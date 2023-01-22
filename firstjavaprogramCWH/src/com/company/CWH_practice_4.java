package com.company;
import java.util.Scanner;
public class CWH_practice_4 {
    public static void main(String[] args) {
     /*   String var = "vishal";
        Scanner sc = new Scanner(System.in);
       var = sc.nextS();
        switch (var) {
            case "raj":
                System.out.println("you are an adult");
                break;
            case "ravi":
                System.out.println("you are going to graduate");
                break;
            case "vishal":
                System.out.println("you are going to join a job");
                break;
            case "vipin":
                System.out.println("you are a legend");
                break;
            default:
                System.out.println("leave a legecy!");

        }
        System.out.println("enjoy");
        byte b1,b2,b3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your math marks");
        b1= sc.nextByte();
        System.out.println("Enter your phyics marks");
        b2= sc.nextByte();
        System.out.println("Enter your chemistrey marks");
        b3=sc.nextByte();
        float avg=(b1+b2+b3)/3;
        if(b1>33 && b2>33 && b3>33 && avg>40)
        System.out.println("you are promoted");
        else
            System.out.println("you are not promoted");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakh per anum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05f * (income - 2.2f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("the total tax paid by employeeis :" + tax);
        for (int i = 10; i > 0; i--) {
            System.out.println(2 * i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
        }
        int i=0;
        while(i==5){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            i++;
        }
        System.out.println("loop terminates here");
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        while(i<5);
        System.out.println("loop ends here");
        int n=4;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
int sum=0;
int n=5;
for(int i=0;i<n;i++)
    sum=sum +(2*i);
        System.out.print("sum of even numbers is : ");
        System.out.println(sum);
        int n =5;
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
            int n = 5;
               int i = 1;
            int factorial = 1;
            while(i<=n){
                factorial *= i;
                i++;

            }
        int sum=0;
        int n=4;
        for (int i=0;i<=n;i++) {
            sum = sum + (2 * i);
        }
        System.out.print("sum of first n even no. is :");
        System.out.println(sum);
        int n=5;
        int factorial =1;
        for (int i=1;i<=n;i++)
         //   System.out.printf("%d * %d= %d\n",i*n)
        factorial *=i;
        System.out.println("factorial of given no :"+factorial);
        int n=8;
        int sum=0;
        for (int i=1 ;i<=10;i++)
            sum +=n*i;
        System.out.println("sum of element of table 8 :" + sum);
        float [] marks ={ 98.5f, 45.5f, 79.5f,99.5f,80.5f};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        for(int i= marks.length-1;i>=0;i--)
            System.out.println(marks[i]);
        System.out.println("printing using for loop ");
        for(float element: marks)
            System.out.println(element);
        int [][] flats = new int [2][3];
        ;flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println("printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for (int j = 0; j<flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");*/
      //  float[] marks = {45.7f, 56.8f, 67.9f, 99.2f, 100.0f};
     //   float sum = 0;
        //   float num = 45.7f;
        //   boolean isInarray = false;
      //  for (float element : marks)
            //      if(num==element){
            //           isInarray = true ;
            //           break;

      //      sum = sum + element;

     /*   if(isInarray)
        System.out.println("the value is present in the aaray");
        else
            System.out.println("value is not present in the array");

    float[] marks = {45.7f, 56.8f, 67.9f, 99.2f, 100.0f};
    float sum = 0;
    for(float element:marks)
    sum =sum +element;
        System.out.println("The value of average marks is " +sum/marks.length);
        int [] arr ={1,21,3,4,5,34,67};
        int l = arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0; i<n;i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
            for (int element : arr) {
                System.out.print(element + "\t");
            }*/
             boolean isSorted =true ;
            int [] arr ={ 1, 12,3,4,5,34,67};
            for(int i=0;i< arr.length-1;i++){
                if (arr[i] > arr[i+1]){
                    isSorted = false ;
                    break;
                }
            }
            if(isSorted){
                System.out.println("the array is sorted");
            }
            else{
                System.out.println("the array is not sorted");
            }
}

}