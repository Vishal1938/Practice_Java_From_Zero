package com.company;
public class vishal_practice_7 {
    static int logic(int x,int y){
        int z;
        if(x==y){
            z= 4*x;
        }
        else {
            z =2*(x+y);
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c = logic(a,b);
        int a1 = 2;
        int b1 = 2;
        int c1;
        c1 = logic(a1 ,b1);
        System.out.println(c);
        System.out.println(c1);
     /*   float[] maarks ={45.7f,67.8f,63.4f,99.2f,110.0f};
                float sum=0;
        for(float a:maarks){
            sum = sum + a;
        }
        System.out.println("the value of sum is "+sum);
        System.out.println("Avg :"+sum/maarks.length);
        int[][]mat1 ={{1,2,3},
                {4,5,6}};
        int [][]mat2 ={{2,4,6},
                {3,7,9}};
        int[][] result ={{0,0,0},
                     {0,0,0}};

        for(int i=0;i< mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.println(result[i][j]+" ");
                System.out.printf("setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println(result[i][j] + " ");
            }
            System.out.println("");
        }*/


    }
}
