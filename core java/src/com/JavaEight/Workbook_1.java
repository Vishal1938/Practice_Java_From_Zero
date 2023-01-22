package com.JavaEight;
interface Executable{
    Integer execute(Integer a,Integer b);
}
interface StringExecutable{
    Integer execute(String a);
}
class Runner{
    public void run(Executable e){
        System.out.println("Entered into run method");
        Integer value=e.execute(12,11);
        System.out.println("Return Value is :"+value);
        System.out.println("Test1");
    }
    public void run(StringExecutable e){
        System.out.println("Entered into run method");
        Integer value=e.execute("Hello");
        System.out.println("Return Value is :"+value);
    }
}
public class Workbook_1 {
    public static void main(String[] args) {
        int d=10;
        Runner runner=new Runner();
        runner.run(new Executable() {
            @Override
            public Integer execute(Integer a, Integer b) {
                int d=8;//Anonymous Inner class that's why we can specify d
                System.out.println("Value of D is "+d);;
                System.out.println("Hello There");
                return a+b;
            }
        });
        System.out.println("*********************");
        runner.run((a,b)->{
          //  int d=10;you can not do this inside lamda expression
            return 8+a+b;
        });
        System.out.println("*********************");
        Executable ex=(a,b)->{
            System.out.println("ooh");
            return 8+a+b;
        };
        runner.run(ex);
        System.out.println("**********************");
        Object CodeBlock=(Executable)(a,b)->{
            System.out.println("ooh1");
            return 8+a+b;
        };
        System.out.println("codeBlock :"+CodeBlock);
        //runner.run(CodeBlock);
    }
}
