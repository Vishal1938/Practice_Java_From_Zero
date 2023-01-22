package com.ExceptionHandling;

public class Page_343 {
    public static void main(String[] args) {
        int[][] tests={{1,2,3,4,5,6},{1,2},{1,2,3},{1,2,3,4,5},{5}};
        int n=0;
        try{
            int i=0;
            while(true){
                if(thirdElementIsThree(tests[i++])){
                    n++;
                    System.out.println("sequence :"+i);
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }
        System.out.println(n);
    }
    public static boolean thirdElementIsThree(int[] a){
        return a.length>=3&a[2]==3;
      //  return a.length>=3||a[1]==2;
    }
}
