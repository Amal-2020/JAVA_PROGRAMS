package JAVA;

import java.util.Scanner;

public class MultiplicationTable {
        public static void main (String[]arg){
            Scanner sc = new Scanner(System.in);
            System.out.println("Multiplication table for:");
            int n = sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(i+" x "+n+" = "+n*i);
            }
        }
    }
