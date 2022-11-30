package JAVA;

public class Nested_Try_Catch {
    public static void main(String[] args){
        int arr[] = {1,2,5,5,4,3};
        try {
            System.out.println(+arr[9]);
            try {
                System.out.println(+(8/0));
                try {
                    System.out.println(+arr[4]/0);
                }catch (ArithmeticException e){
                    System.out.println("error1");
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("error2");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error3");
        }
    }
}
