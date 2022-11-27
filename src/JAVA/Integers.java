package JAVA;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n =  sc.nextInt();
        if(n<0){
            System.out.println("Negative Number");
        }else {
            System.out.println("Postive Number");
        }
    }
}
