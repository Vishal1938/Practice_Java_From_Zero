package com.company;

public class workbook24_of3 {
    public static void main(String[] args) {
        //primitive to wrapper
        Integer in1=new Integer(987);
        Boolean b1=new Boolean(true);
        Character ch1=new Character('A');
        Byte by11=new Byte((byte)12);
        Integer in2=Integer.valueOf(123);
        Character ch2=Character.valueOf('A');
        Boolean b2=Boolean.valueOf(false);
        //wrapper to primitive
        byte byval =in1.byteValue();
        short shval =in1.shortValue();
        int ival=in1.intValue();
        long lnval=in1.longValue();
        float fval=in1.floatValue();
        double dval=in1.doubleValue();
        char chval=ch1.charValue();
        boolean bval=b1.booleanValue();
        //primitive to String
        int val=12345;
        String st1=val+"";
        String st2=""+val;
        String st3=String.valueOf(val);
        String st4=Integer.toString(val);
        int ab=Integer.parseInt("765");
        byte by1=Byte.parseByte("123");
        boolean b3=Boolean.parseBoolean("ok");
        //string to wrapper
        Integer in3=new Integer("1234");
        Boolean b4=new Boolean("som");
        Boolean b5=new Boolean("True");
        //Wrapper to string
        String str1=in1.toString();
        String str2=ch1.toString();
        String str3=b1.toString();
        //other methods
        String binStr=Integer.toBinaryString(6567533);
        System.out.println(binStr);
        String hexStr=Integer.toHexString(6567533);
        System.out.println(hexStr);
        String octStr=Integer.toOctalString(6567533);
        System.out.println(octStr);

    }
}
