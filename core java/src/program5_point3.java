public class program5_point3 {
    public static void main(String[] args) {
        Hello h1[]=new Hello[2];
        h1[0]=new Hello();
        for (int i=0;i< h1.length;i++){
            System.out.println(h1[i]);
        }
        System.out.println("------------");
       // h1[1]=new Hai();
        Object o[]=new Object[2];
        o[0]=new Hello();
        o[1]=new Hai();
        for(int i=0;i<o.length;i++){
            System.out.println(o[i]);
        }
    }
}
class Hello{
    public int hashcode(){
        return 4;
    }
    public String tostring(){
        return this.getClass().getName()+"@"+Integer.toHexString(hashcode());
    }
}
class Hai{}