package com.company;

public class workbook16_of3 {
    public static void main(String[] args) {
        String str="Hi this is RDS school.No 1 school of this region it will create a better future for" +
                "for your child";
        System.out.println(str);
        String res[]=str.split("school");
        for(int i=0;i< res.length;i++){
            String st=res[i];
            System.out.println(i+"\t"+st);
        }
        System.out.println("----------");
        res=str.split("school",2);
        for (int i=0;i< res.length;i++){
            String st=res[i];
            System.out.println(i+"\t"+st);
        }
    }
}
