package JAVA;

import java.util.Scanner;

public class Lowercase_to_upper {
    public static void main(String args[]) {
        String str;
        int i;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        char st[] = str.toCharArray();
            for (i = 0; i < str.length(); i++) {
                if (st[i] >= 'a' && st[i] <= 'z') {
                    st[i] = (char) ((int) st[i] - 32);
                } else {
                    flag = 1;
                }
            }
            if(flag==1){
            System.out.println("Already UpperCase!");
        }
        System.out.println("The string in UpperCase is");
        for (i = 0; i < str.length(); i++)
            System.out.print(st[i]);
    }
}