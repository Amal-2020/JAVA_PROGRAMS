package JAVA;

import java.util.Scanner;
public class Compare_String {
    public static void main(String[] args){
        String str1,str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st string:");
        str1 = sc.nextLine();
        char st1[] = str1.toCharArray();
        int n1 = str1.length();
        System.out.println("Size of the String1:"+n1);

        System.out.println("Enter the 2nd string:");
        str2 = sc.nextLine();
        int n2 = str2.length();
        System.out.println("Size of the String:"+n2);

        char st2[] = str2.toCharArray();
        if(n1==n2){
            System.out.println("The two string are EQUAL!!!");
        }else {
            System.out.println("The two string are NOT EQUAL!!!");
        }
    }
}
