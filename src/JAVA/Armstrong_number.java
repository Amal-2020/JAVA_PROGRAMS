package JAVA;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args){
        int num,originalNum,digit,Sum=0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int length = String.valueOf(num).length();
        System.out.println(length);
        originalNum = num;
        while (num!= 0)
        {
            digit = num % 10;
            Sum += Math.pow(digit,length);
            num /= 10;
        }
        if(Sum == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    }
}
