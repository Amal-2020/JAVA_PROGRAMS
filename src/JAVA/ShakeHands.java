package JAVA;

import java.util.Scanner;

public class ShakeHands {
    public static void main(String[] args) {
        int N,THS,i;
        System.out.println("Enter no:of person:");
        Scanner sc = new Scanner(System.in);
        N =  sc.nextInt();
        THS=(N*(N-1))/2;
        System.out.println("Total no:of HS "+THS);
    }
}
