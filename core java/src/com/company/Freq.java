package com.company;
import java.util.*;
public class Freq{
    public static void main(String[] args){
        String str="This This is our our India India";
        String[] s1=str.split(" ");
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<s1.length-1;i++){
            if(map.containsKey(s1[i])){
                int count =map.get(s1[i]);
                map.put(s1[i],count+1);
            }
        else{
                map.put(s1[i],1);
            }
        }
        System.out.println(map);
    }
}