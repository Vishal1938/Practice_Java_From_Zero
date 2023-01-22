public class workbook3_of3 {
    public static void main(String[] args)throws CloneNotSupportedException {
        worker wk1=new worker(77,"vishal");
        wk1.showClone();
        System.out.println("\n============");
        LoginInfo log=new LoginInfo(101,"rahul","RDS");
        Address ad=new Address("c-24","delhi",277302);
        vidyarthi v1=new vidyarthi(999,"rahul",33444,ad,log);
        System.out.println(v1);
        vidyarthi v2=(vidyarthi) v1.clone();
        System.out.println(v2);
        System.out.println("\n**** After Clonning the Object *****");
        System.out.println(v1==v2);
        System.out.println(v1.studAdd== v2.studAdd);
        System.out.println(v1.login== v2.login);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("\n====MODIFYING THE DATA====");
        v2.sid=90909;
        v2.name="neeraj";
        v2.phone=76543;
        v2.studAdd.street="varansi";
        v2.login.uname="JTcuser";
        System.out.println(v1);
        System.out.println(v2);

    }
}
class vidyarthi implements Cloneable {
    int sid;
    String name;
    long phone;
    Address studAdd;
    LoginInfo login;
    public vidyarthi(int sid,String name,long phone,Address studAdd,LoginInfo login){
        this.name=name;
        this.sid=sid;
        this.login=login;
        this.studAdd=studAdd;
    }
    public String toString(){
        return "\nStud Info\t:"+sid+"\t"+name+"\t"+phone+"\nAdd Info\t:"+studAdd+"\nLogin Info\t:"+login;
    }
    public Object clone()throws CloneNotSupportedException{
        Object obj=null;
        if(this instanceof Cloneable){
            Address ad=new Address(this.studAdd.aid,this.studAdd.street,this.studAdd.pin);
            LoginInfo info=new LoginInfo(this.login.loginId,this.login.uname,this.login.pwd);
            obj=new vidyarthi(this.sid,this.name,this.phone,ad,info);
        }else{
            throw new CloneNotSupportedException(this.getClass().getName());
        }
        return obj;
    }
}
class worker implements Cloneable {
    int wid;
    String name;
    public worker(int wid, String name) {
        this.wid = wid;
        this.name = name;
        System.out.println("--Employee(int,string)--");
    }

    public String toString() {
        return wid + "\t" + name;
    }
    void showClone() throws CloneNotSupportedException {
        worker ep = (worker) clone();
        System.out.println("this\t\t:" + this);
        System.out.println("cloned Obj\t:" + ep);
        System.out.println(this==ep);
    }
}
class Address{
    String aid;
    String street;
    int pin;
    public Address(String aid,String street,int pin){
        super();
        this.aid=aid;
        this.street=street;
        this.pin=pin;
    }
    public String toString(){
        return aid+"\t"+street+"\t"+pin;
    }
}
class LoginInfo{
    int loginId;
    String uname;
    String pwd;
    public LoginInfo(int loginId,String uname,String pwd){
        this.loginId=loginId;
        this.uname=uname;
        this.pwd=pwd;
    }
    public String toString(){
        return loginId+"\t"+uname+"\t"+pwd;
    }
}