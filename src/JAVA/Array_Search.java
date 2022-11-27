package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n,srh,flag=0;
        System.out.println("Enter no:of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array:" +Arrays.toString(arr));
        System.out.println("Enter the element to be seached:");
        srh = sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==srh){
                System.out.println("Element "+srh+" found at "+i+" position");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element "+srh+" NOT found!");
        }
    }
}
