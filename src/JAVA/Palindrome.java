package JAVA;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        String str;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = sc.nextLine();
        char c[] = str.toCharArray();
        int n = str.length();
        for(int i=0;i<n;i++){
            if(c[i] != c[n-i-1]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
