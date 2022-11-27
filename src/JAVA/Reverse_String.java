package JAVA;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = sc.nextLine();
        char c[] = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}
