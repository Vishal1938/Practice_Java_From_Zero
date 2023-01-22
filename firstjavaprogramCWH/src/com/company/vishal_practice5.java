package com.company;
import java.util.Scanner;
public class vishal_practice5 {
    public static void main(String[] args) {
   /*     System.out.println(90-45+"Result is ");
        System.out.println(90>45 && 90>78);
        int ab=65;
        char ch=(char)ab;
        int res=(int)123.456;
        System.out.println(res);
        System.out.println(ch);
        int bd=300;
        byte by=(byte)bd;
        System.out.println(by);
        String st1=new String("vishal");
        String st2=new String("vishal");
        System.out.println(st1+"\t"+st2);
        System.out.println(st1==st2);
        int arr[]=new int[12];
        System.out.println(arr);
        System.out.println(st1 instanceof String);
        Object ref=st1;
        System.out.println("Ref\t:"+ref);
        System.out.println(ref instanceof String);
        System.out.println(ref instanceof Object);
        int xy=10;
        int yz=20;
        int res1=true?xy:yz;
        int res2=false?xy:yz;
        System.out.println(res1);
        System.out.println(res2);
        int res3=(xy>yz)?yz:xy;
        System.out.println(res3);
        int a=90;
        int b=456;
        int c=43;
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
        if(true)
            System.out.println("true block");
        if(false)
            System.out.println("false block");
        System.out.println("false block 2");
        int pq=10;
        if (pq==10)
            System.out.println("value of pq :"+ pq);
        else
            System.out.println("value is not ten");
        System.out.println("\n**IF -Else -IF***");
        int mn=0;
        if(mn++==0)
            System.out.println("value is zero");
        else if(mn++==1)
            System.out.println("value is one");
        else if(mn++==2)
            System.out.println("value is two ");
        else
            System.out.println("value is three");
        System.out.println("bn value is :"+mn);
        int bn=0;
        if(++bn==1)
            System.out.println("value is zero");
        else if(++bn==2)
            System.out.println("value is one");
        else if(++bn==3)
            System.out.println("value is two");
        else
            System.out.println("value is three");*/


   /* int arr[]=null;
    String names[];
    boolean barr[];
    int size=5;
  //  arr[]=new int[size];
   // names=
        String name = "Jack Danials";
     //   name = name.toLowerCase();
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));
        String text="name is a good boy";
        System.out.println(text.replace("name","rahul"));
        String mystring="this sting contains    double  and triple spaces";
        System.out.println(mystring.indexOf(" "));
        System.out.println(mystring.indexOf("   "));*/
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>60) {
            System.out.println("retired");
        }
        else if(age>40) {
            System.out.println("experianced");
        }
        else  {
            System.out.println("you are young");

        }

    }
}
