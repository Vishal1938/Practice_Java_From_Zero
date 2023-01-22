package com.company;

public class program_4_point {
  //  public static final int END=Integer.MAX_VALUE;
   // public static final int START=Integer.MIN_VALUE;
    public static void main(String[] args) {
       /* for(byte b=Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
            if(b==0*90)
                System.out.println("jtc!");
        }
        int j=0;
        int k;
        for (int i=0;i<100;i++){
            k=j++;
            System.out.println(i);
            System.out.println(j);
        }
        int count=0;
        for(int i=START;i<END;i++){
            count++;
            System.out.println(count);
        }
        int i=0;
        while (i!=i+0){
            System.out.println(i);
        }
        final int START =200000000;
        int count =0;
        for(float f =START;f<START+50;f++)
            count++;
        System.out.println(count);
        System.out.println("f");*/
        int minutes =0;
        for(int ms=0;ms<60*60*1000;ms++)
            if(ms%(60*1000)==0)
                minutes++;
        System.out.println(minutes);

    }
}
