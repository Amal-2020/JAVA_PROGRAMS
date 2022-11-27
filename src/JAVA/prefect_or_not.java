package JAVA;

import java.util.Scanner;

public class prefect_or_not {
    public static void main(String[] args) {
        Integer num,sum=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        for(i=1;i<num;i++){
            if(num%i==0){
                System.out.println(+i);
                sum=sum+i;
            }
        }
        System.out.println("These are the factors");
        System.out.println(" is prefect number");
    }
}
