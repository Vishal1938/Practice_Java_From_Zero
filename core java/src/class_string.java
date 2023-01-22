public class class_string {
    public static void main(String[] args) {
        String s1=new String("xyz");
        String s2=new String("xyz");
        String s3="xyz";
        String s4="xyz";
        String s6="Xyzabc";
        StringBuffer s7=new StringBuffer("PQR");
        StringBuffer s8=s7.append("austria");
        String s5=new String("pqr");//hashcode methode is overriden inside string and it compaeres
        System.out.println(s1.hashCode());//on the basis on the basis of content that's why s1,s2,s3,s4
        System.out.println(s2.hashCode());//all of them have same hashcode.
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1==s2);//false-> beacuse of diffrent obj creation in heap
        System.out.println(s1.equals(s2));//true->overiden so compare on the basis of content
        System.out.println(s3==s4);//true-> ref to the same obj in scp in heap
        System.out.println(s3.equals(s4));//true>compare on basis of content
        System.out.println(s3==s1.intern());//true->ref to object of string literal in scp
        s5=s5.intern();
        System.out.println(s5.hashCode());
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s6));
        System.out.println(s1.compareTo(s4));
        System.out.println(s8.toString());
        System.out.println(s7==s8);//true->austria is appendon exisng
        // new obj crea like string.
        //no new obj is created thats'why it is called mutable methode unlike string
        System.out.println(s7.equals(s8));
        System.out.println("************");
        System.out.println(s8.length());
        System.out.println(s8.capacity());
         String st1 ="rds";
         String st2="RDS";
        String st3=st1+st2;
        String st4="rdsRDS";
        String st5="rds"+"RDS";
        System.out.println(st4==st5);
        System.out.println(st3==st4);
        System.out.println(st3.intern()==st4);
        System.out.println(st3.equals(st4));
    }
}