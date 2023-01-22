package com.company;
class Array{
    public int hashcode(){
        return 4;
    }
    public String toString(){
        return this.getClass().getName()+":@:"+Integer.toHexString(hashcode());
    }
}
class List{
}

public class program5_point3 {
    public static void main(String[] args) {
        Array a1[]=new Array[2];
        a1[0]=new Array();

        Object o[]=new Object[2];
        o[0]=new Array();
        o[1]=new List();
        for (int i=0;i<o.length;i++){
            System.out.println(o[i]);
        }
    }
}
