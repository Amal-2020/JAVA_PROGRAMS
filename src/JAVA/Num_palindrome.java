package JAVA;

import java.util.Scanner;

public class Num_palindrome {
    public static void main(String[] args) {
        int num, digit ,sum = 0;
        String choice;
        do {
            System.out.println("Enter the Number:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            int orginalnum = num;
            while (num != 0) {
                digit = num%10;
                sum = (sum*10)+digit;
                num = num/10;
            }
            if (orginalnum == sum) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
            System.out.println("Do you want to continue ? (yes or no)");
            choice = sc.next();
        }while (choice.equals("yes")||choice.equals("Yes"));
    }
}
