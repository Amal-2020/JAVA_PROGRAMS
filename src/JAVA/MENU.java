package JAVA;

import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {
        String a,b,choice;;
        int menu;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("1.Addition" + "\n2.Substation" + "\n3.Multiplication" + "\n4.Division" + "\nAny other input gives default message");
            menu = sc.nextInt();
            System.out.println("Enter value of a:");
            a = sc.next();
            System.out.println("Enter value of b:");
            b = sc.next();
            char ch1 = a.charAt(0);
            char ch2 = b.charAt(0);
            if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z') || (ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
                System.out.println("Invalid input...?\nPlease Enter yes for continue");
            } else {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                switch (menu) {
                    case 1:
                        System.out.println("a + b = "+addition(num1,num2));
                        break;
                    case 2:
                        System.out.println("a - b = " +substration(num1,num2));
                        break;
                    case 3:
                        System.out.println("a x b = " +multiplication(num1,num2));
                        break;
                    case 4:
                        System.out.println("a / b = " +division(num1,num2));
                        break;
                    default:
                        System.out.println("ERROR??? Please give correct option!");
                }
                System.out.println("Would you like to continue ? (yes or no)");
            }
            choice = sc.next();
        } while (choice.equals("yes")  || choice.equals("Yes"));
    }
    //Addition
    public static int addition(int a, int b){
        int sum = a + b;
        return sum;
    }
    //Substartion
    public static int substration(int a, int b){
        int sub = a - b;
        return sub;
    }
   //Multiplication
   public static int multiplication(int a,int b){
        int mul = a*b;
        return mul;
    }
   //Divison
    public static float division(int a,int b){
        float div = Float.parseFloat(String.valueOf(a)) / Float.parseFloat(String.valueOf(b));
        return  div;
    }
}

