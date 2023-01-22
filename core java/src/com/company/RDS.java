package com.company;
import java.io.IOException;
class RunTime{
    private RunTime(){
    }
    private static RunTime rt=null;
    {
        rt=new RunTime();
    }
    public static RunTime getRunTime(){
        return rt;
    }
}

public class RDS {
    public static void main(String[] args) throws Exception{
        RunTime rt=null;
        RunTime.getRunTime();
        RunTime rt1=RunTime.getRunTime();
        System.out.println(rt);
        System.out.println(rt1);
        System.out.println(rt==rt1);
        System.out.println(rt.hashCode()==rt1.hashCode());
        System.out.println();
    }
}
