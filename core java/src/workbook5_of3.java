public class workbook5_of3 {
    public static void main(String[] args) {
        Pata p1=new Pata(101,"lucknow","c-45",201301);
        Chatra c1=new Chatra(77,"vishal",876543,p1);
        System.out.println(p1);
        System.out.println("--Modifying the add ref in main");
        p1.aid=123;
        p1.city="ballia";
        System.out.println(c1);
        System.out.println(c1.getSid());
        System.out.println(c1.getpata());
        Pata p2= c1.getpata();
        p2.aid=3333;
        System.out.println(c1);

    }
}
final class Chatra{
    private final int sid;
    private final String name;
    private final long phone;
    private final Pata Chatrapata;
    public Chatra(int sid,String name,long phone,Pata Chatrapata){
        this.sid=sid;
        this.name=name;
        this.phone=phone;
        this.Chatrapata=new Pata(Chatrapata.aid,Chatrapata.street,Chatrapata.city,Chatrapata.pin);
    }
    public String toString(){
        return "Stud Info\t:"+sid+"\t"+phone+"\nAdd Info\t:"+Chatrapata.pin;
    }
    public int getSid(){
        return this.sid;
    }
    public Pata getpata(){
        return (Pata)Chatrapata.clone();
    }
}
class Pata{
    int aid;
    String street;
    String city;
    int pin;
    public Pata(int aid,String city,String street,int pin){
        this.aid=aid;
        this.street=street;
        this.city=city;
        this.pin=pin;
    }
    public Object clone(){
        return new Pata(this.aid,this.street,this.city,this.pin);
    }
    public String toString(){
        return aid+"\t"+street+"\t"+city+"\t"+pin;
    }
}