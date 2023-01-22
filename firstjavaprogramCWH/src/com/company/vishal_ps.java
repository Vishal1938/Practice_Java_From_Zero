package com.company;

public class vishal_ps {
    public static void main(String[] args) {
        int n =6;
        int factorial = 1;
        for(int i=1; i<=n ; i++){
            factorial *=i;
        }
        System.out.println(factorial);

        int x =6;
        int y = 1;
        int sum = 1;
        while(y<=x){
            sum += x*y;
            y++;
        }
        System.out.println(sum);

    }
}
