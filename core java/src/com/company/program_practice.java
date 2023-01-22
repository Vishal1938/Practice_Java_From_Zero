package com.company;
class wow{
    static {
        System.out.println("Instace blocks in wow");
    }
     {
        System.out.println("static blocks in wow");
    }
}

public class program_practice {
    static wow w1=new wow();
    {
        System.out.println("instance blocks in ");
    }
    static {
        System.out.println("static blocks in ");
    }
    public static void main(String[] args) {
    //    wow w1=new wow();
    }
}
