package com.company;
class array{
    public int haschcode(){
        return 4;
    }
    public String toString(){
        return this.getClass().getName()+":@:"+Integer.toHexString(haschcode());
    }
}
class arr{
}
public class program5_point1 {
    public static void main(String[] args) {
     /*   int a[]={11,22,33,44};
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]+"\t"+i);
        }
        System.out.println("**********");
        array a1=new array();
        System.out.println(a1);
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println("DYNAMIC ARRAY");
        int x1[]=new int[4];
        for (int i=0;i< x1.length;i++){
            System.out.println(a[i]+"\t"+i);
        }
        x1[0]=11;
        x1[1]=22;
        x1[2]=33;
        x1[3]=44;
        for(int i=0;i< x1.length;i++){
            System.out.println(x1[i]);
            System.out.println("x1.hashcode:"+x1.hashCode());
            System.out.println("length of array:" +x1.length);
            x1=new int[5];
            System.out.println(x1.length);
            System.out.println(x1.hashCode());
            for (int j=0;i< x1.length;j++){
                System.out.println(x1[j]);
            }
        }
        char ch[]=new char[10];
        for(int i=0;i< ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println("****************");
        System.out.println(ch.hashCode());
        System.out.println(ch.length);
         array h1[]=new array [5];
         array h11=new array();
        System.out.println(h11);
        for (int i=0;i< h1.length;i++) {
            System.out.println(h1);
        }
        String str1[]={"abc","xyz","mno"};
        for(int i=0;i< str1.length;i++){
            System.out.println(str1[i]+"  "+str1[i].length());

       }
        array ar1[]=new array[2];
        ar1[0]=new array();
        Object o[]=new Object[2];
        o[0]=new array();
        o[1]=new arr();
        for (int i=0;i< o.length;i++){
            System.out.println(o[i]);
        }*/
        int a[][] = new int[3][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
                System.out.print("inside loop");
            }
        }
        System.out.println("value");
    }
}
