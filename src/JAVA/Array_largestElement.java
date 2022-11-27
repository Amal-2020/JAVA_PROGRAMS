package JAVA;

class Array_largestElement {
    static int large() {
        int arr[] = {21,11,2,14,5,6,9};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] arg) {
        System.out.println("Largest in given array is " + large());
    }
}
