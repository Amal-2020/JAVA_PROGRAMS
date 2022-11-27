package JAVA;

import java.util.Arrays;

class Array_value_check {
    private static void check(int arr[], int check_value) {
        boolean test = false;
        for (int element : arr) {
            if (element == check_value) {
                test = true;
                break;
            }
        }
      System.out.println("Is "+check_value +" present in the array: "+test);
}
     public static void main(String[] arg){
         int arr[] = {1,2,3,4,5,9};
         int check_value = 4;
         System.out.println("Array: " + Arrays.toString(arr));
         check(arr,check_value);
     }
}
