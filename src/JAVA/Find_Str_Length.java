package JAVA;

import java.util.Scanner;

public class Find_Str_Length {
    public static void main(String[] args){
        String str;
        //int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = sc.nextLine();
        int l = str.length();
//        char st[] = str.toCharArray();
//        for(char c:st){
//            i++;
//        }
//        System.out.println(i);
        System.out.println(l);
    }
}
