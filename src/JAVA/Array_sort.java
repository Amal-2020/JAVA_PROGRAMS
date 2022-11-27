package JAVA;

import java.util.Arrays;
import java.util.Collections;

public class Array_sort {
    public static void main(String args[]){
        Integer arr[] = {9,0,2,-1,5,3,12};
        Arrays.sort(arr);
        System.out.println("Array in sorted order: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array in reverse order: " + Arrays.toString(arr));
    }
}
