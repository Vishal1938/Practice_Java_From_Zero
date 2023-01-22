package com.company;

public class program5_point6 {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        a[0][0]=99;
        a[0][1]=99;
        a[1][0]=88;
        a[1][1]=77;
        a[2][0]=66;
        a[2][1]=55;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+"\t"+a[i].hashCode());
            }
        }
        System.out.println("*********\n");
        a[0]=new int[4];
        for (int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+"\t"+a[i].hashCode());
            }
        }
    }
}
