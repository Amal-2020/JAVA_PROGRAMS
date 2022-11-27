package JAVA;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class functionSample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum = sum(num1,num2);
        System.out.println("Result is " +sum);
    }
   static int sum(int a,int b){
        int sum = a+b;
        return sum;
   }

}
