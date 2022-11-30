package JAVA;

import java.util.Scanner;

public class Even_Odd_sum {
    public static void main(String[] args) {
        int n, i, sum = 0, sum1 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit:");
        n = sc.nextInt();

        System.out.println("The Numbers are:");
        for (i = 1; i <= n; i++) {
            System.out.printf("%s ",i);
        }
        //print the element 1 to n
        for (i = 1; i <= n; i++) {

            //give the sum of even and odd numbers
            if (i % 2 == 0) {
                int even = i;
                sum = sum + i;
            }
            else {
                int odd = i;
                sum1 = sum1 + i;

            }
        }

        System.out.println("\nEven number sum = " + sum);
        System.out.println("Odd number sum = " + sum1);
    }
}
