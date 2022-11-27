package JAVA;

import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Integer num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        int count=0;

        if(num<=1)

            System.out.println(num+" is not a prime number");

        else

        {

            for( i=2;i<=num;i++)

            {

                if(num%i==0)

                {

                    count++;

                }

            }

            if(count>2)

                System.out.println(num+" is not a prime number");

            else

                System.out.println(num+" is a prime number");

        }

    }

}
