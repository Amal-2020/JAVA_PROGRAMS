package JAVA;

public class Remove_dupl {
    private static Object check_remove(int arr[], int temp) {
        int new_arr;
        if (temp == arr[1]) {
            new_arr = arr.length - 1;
        } else {
            return null;
        }
        return new_arr;
    }
    public static void main(String[] args){
        int arr[]={1,1,3,3,5,5,4};
        int temp = arr[0];
        check_remove(arr,temp);
    }
}
