package JAVA;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String str;
        int i, flag = 1;
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int n = str.length();
        System.out.println("Size Of String is " + n);
        char[] ch = str.toCharArray();
        System.out.println(ch);
        for (i =n-1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
       for(i=0;i<n;i++){
         if(ch[i] != ch[n-i-1] ){
              flag = 0;
              break;
            }
        }
        if (flag==0){
            System.out.println("The given string is not palindrome");
        }else {
            System.out.println("The given string is palindrome");
        }
    }

}
