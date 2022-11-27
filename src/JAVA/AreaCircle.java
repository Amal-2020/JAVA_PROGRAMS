package JAVA;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args){
        double PI = 3.14;
        double r,A;
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        A = PI*(r*r);
        System.out.print("Area of Circle is ");
        System.out.println(A);
    }
}
