package JAVA;

import java.util.Scanner;

public class Sum_Elem_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int n ,sum=0;
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:") ;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of "+n+" elements in an array = "+sum);
    }
}
