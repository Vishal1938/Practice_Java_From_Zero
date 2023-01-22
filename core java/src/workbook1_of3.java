public class workbook1_of3 {
    public static void main(String[] args) {
        System.out.println("****hashCode*****");
        System.out.println("===Student===");
        Student st1=new Student(11,"vishal",2344);
        Student st2=new Student(11,"vishal",2344);
        Student st3=new Student(22,"Rahul",3999);
        Student st4=st1;
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1==st4);
        Employee emp1=new Employee(44,"RDS",39111);
        Employee emp2=new Employee(44,"RDS",39111);
        Employee emp3=new Employee(88,"rds",45555);
        Employee emp4=emp1;
        System.out.println(emp1.hashcode());
        System.out.println(emp2.hashcode());
        System.out.println(emp3.hashcode());
        System.out.println(emp4.hashcode());
        System.out.println(emp1==emp2);
        System.out.println(emp1==emp4);
        ClassService.showClassInfo("RDS");
        ClassService.showClassInfo(st1);
        ClassService.showClassInfo(emp1);
        System.out.println("\n****toString*****");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        String str1="OK";
        str1=str1+str1;
        System.out.println(str1);
        System.out.println(emp1);
        System.out.println(emp3);
        Employee emp5=null;
        System.out.println();
        System.out.println(emp5);//null
        String str11="OK";
        str11=str11+emp5;
        System.out.println(str11);//OKnull
       // System.out.println(emp5.toString());
        System.out.println("----------");
        System.out.println(st1.toString());
        String cName=st1.getClass().getName();
        int hs=st1.hashCode();
        String hx=Integer.toHexString(hs);
        String msg=cName+"@"+hx;
        System.out.println(msg);
    }
}
class ClassService{
    static void showClassInfo(Object obj){
        Class cl=obj.getClass();
        System.out.println("\nName\t:"+cl.getName());
        System.out.println("Name\t:"+cl.getSimpleName());
        System.out.println("Super class\t:"+cl.getSuperclass());
        System.out.println("package \t:"+cl.getPackage());
        Class intrs[]=cl.getInterfaces();
        for(int i=0;i< intrs.length;i++){
            Class in=intrs[i];
            System.out.println(in);
        }
    }
}
interface I1{}
interface I2{}
class Person{}
class Student extends Person implements I1,I2{
    int sid;
    String name;
    long phone;
    public Student(int sid,String name,long phone){
        this.sid=sid;
        this.name=name;
        this.phone=phone;
    }
}
class Usher{}
class Employee extends Usher{
    int eid;
    String name;
    long phone;
    public Employee(int eid,String name,long phone){
        this.eid=eid;
        this.name=name;
        this.phone=phone;
    }
    public String toString(){
        return "Info Eid :"+eid +",Name :"+name+",phone :"+ phone;
    }
    public int hashcode(){
        return (int)(phone<<name.length());
    }
}