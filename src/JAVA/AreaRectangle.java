package JAVA;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        double l,b,A;
        System.out.println("Enter the l and b:");
        Scanner sc = new Scanner(System.in);
        l=sc.nextDouble();
        b=sc.nextDouble();
        A = l * b;
        System.out.print("Area of Rectangle is ");
        System.out.println(A);
    }
}
