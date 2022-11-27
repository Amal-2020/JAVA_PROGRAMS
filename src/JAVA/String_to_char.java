package JAVA;

import java.util.Scanner;

public class String_to_char {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        char c[] = str.toCharArray();
        System.out.println("On using toCharArray() method :-");
        for(int i=0;i<c.length;i++) {
            System.out.println(c[i]);
        }
    }

}
