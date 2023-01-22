package com.company;
import javax.xml.crypto.Data;
import java.io.DataInput;
import java.io.DataInputStream;
import java.util.Scanner;
public class vishal_practice_6 {
    public static void main(String[] args) throws Exception {
     /*   String val = "";
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter int value");
        val = dis.readLine();
        int ab = Integer.parseInt(val);
        System.out.println("Enter char value");
        val = dis.readLine();
        char ch = val.charAt(0);
        System.out.println("Enter String value");
        val = dis.readLine();
        System.out.println(ab + "\t" + ch + "\t" + val);
        System.out.println(val.length());*/

       /* int arr[] = null;
        String names[];
        boolean bArr[];
        int size = 5;
        arr = new int[size];
        names = new String[3];
        bArr = new boolean[4];
        System.out.println("arr\t:" + arr.length);
        System.out.println("names\t:" + names.length);
        int len = 'A';
        System.out.println("Len\t:" + len);
        String emails[] = new String[len];
        System.out.println("emails\t:" + emails.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(names[0]);
        System.out.println(bArr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("------");
        for (int i = 0; i < bArr.length; i++) {
            System.out.println(bArr[i]);

        }
        System.out.println("----after storing data----");
        arr[0] = 123;
        arr[3] = 582;
        arr[4] = 745;
        for (int i = 0; i < bArr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----");
        names[0] = "vishal";
        names[1] = "rahul";
        names[2] = "vipin";
        for (int i = 0; i < names.length; i++) {
            ;
            System.out.println(names[i]);
        }
        double d1Arr[] = new double[2158525];
        System.out.println("Length\t:" + d1Arr.length);
        int arr3[] = new int[0];
        System.out.println("arr3\t:" + arr3.length);
        System.out.println(arr3[0]);
        int arr[]=new int[7];
        System.out.println("Length\t:"+arr.length);
        arr[0]=45;
        arr[3]=28;
        arr[5]=69;
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Length\t:"+arr.length);
        int other[]=arr;
        System.out.println(other==arr);
        arr=new int[9];
        System.out.println(other==arr);
        System.out.println("length\t:"+other.length);
        for(int i=0;i<= arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("------");
        System.out.println("length\t:"+other.length);
        for(int i=0;i< other.length;i++){
            System.out.println(other[i]);
        }
        System.out.println("\n-----");
        final int arr3[]=new int[3];
        for(int i=0;i< arr3.length;i++){
            System.out.println(arr3[i]);
        }
        arr3[0]=74;
        arr3[1]=96;
        arr3[2]=25;
        System.out.println("--------");
        for(int i=0;i< arr3.length;i++) {
            System.out.println(arr3[i]);
        }
        byte b1=90;
        int ab=b1;
        int arr5[]=new int[2];
        arr5[0]=b1;
        int ref[]=new int[3];
        Object obj=ref;
        System.out.println(ref==obj);
        System.out.println(ref[0]);
        ref[0]=74;
        int ref3[]=(int[]) obj;
        System.out.println(obj==ref3);
        System.out.println(ref==ref3);
        System.out.println(ref[0]);
        System.out.println(ref3[0]);
        int arr[]=null;
        arr =new int[4];
        byte by1=45;
        int arr3[]={10,20,51,'A',by1};
        System.out.println("Length\t:"+arr3.length);
        int arr4[]=null;
        for (int i=0;i< arr3.length;i++){
            System.out.println(arr3[i]);
        }
        int arr5[]={10,20,51,'a',by1};
        System.out.println("Length\t:"+arr5.length);
        System.out.println("\n-- Anonymus---");
        arr4=new int []{12,34,65,67};
        System.out.println("Length\t:"+arr4.length);
        for (int i=0;i<arr4.length;i++){
            int ab=arr4[i];
            System.out.println(ab);
        }
        System.out.println("\n--------");
        String names[]={"vishal","kumar","singh"};
        for(int i=0;i<names.length;i++){
            String ab=names[i];
            System.out.println(ab);
        }
        int arr[][] = null;
        arr = new int[2][4];
        System.out.println("len\t:" + arr.length);
        System.out.println("len\t:" + arr[0].length);
        System.out.println("len\t:" + arr[1].length);
        arr[0][2] = 123;
        System.out.println((arr[0][2]));
        System.out.println("------");
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; i++) {
                System.out.println("\t" + arr[i][j]);
            }
            System.out.println();
        }*/
        System.out.println("******");
        int ref[][]=new int[3][];
        for(int j=0;j<ref.length;j++){
            System.out.println(ref[j]);
        }
      //  ref[0][1]=123;
        ref[0]=new int[4];
       ref[1]=new int[]{67,55,78};
        ref[2]=new int[6];
        System.out.println("-------");
        for(int i=0;i< ref.length;i++) {
            for (int j = 0; j < ref.length; j++) {
                System.out.print("\t" + ref[i][j]);
            }

            System.out.println();
        }
        System.out.println("------");
        int values[][]={{12,67,43},{12},{90,80,70,60}};
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length;j++){
                System.out.print("\t"+values[i][j]);
            }
            System.out.println();
        }
        int others[][]=null;
        others=new int[][]{{12,67,43},{12},{90,80,70,60}};
        System.out.println("-----");
        for(int i=0;i< others.length;i++){
            for(int j=0;j< others[i].length;j++){
                System.out.print("\t"+others[i][j]);
            }
            System.out.println();
        }
    }
}/*
byte by1 =Byte.parseByte(val);
short sh=Short.parseShort(val);
int ab=Integer.parseInt(val);
long Ival=Long.parseLong(val);
float f1=Float.parseFloat(val);
double d1=Double.parseDouble(val);
boolean b1=Boolean.parseBoolean(val);*/



