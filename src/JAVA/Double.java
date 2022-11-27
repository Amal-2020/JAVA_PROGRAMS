package JAVA;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Double {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(num<<1);

    }
}
