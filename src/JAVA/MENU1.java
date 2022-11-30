package JAVA;

import java.util.Scanner;

public class MENU1 {
    //HW
    //Implement try catch finally
    //Input int / float
    //By IMPORT MENU.java for fns.
    //well documented.
    public static void main(String[] args) {
        String choice;
        int a, b, menu;
        Scanner sc = new Scanner(System.in);
        //do-while loop for continue the program after a invaid input given
        do {
            try {
                System.out.println("MENU");
                System.out.println("1.Addition" + "\n2.Substation" + "\n3.Multiplication" + "\n4.Division" + "\nAny other input gives default message");
                menu = sc.nextInt();
                System.out.println("Enter value of a:");
                a = sc.nextInt();
                System.out.println("Enter value of b:");
                b = sc.nextInt();
                    //for option selection
                    switch (menu) {
                        case 1:
                            System.out.println("a + b = " + MENU.addition(a, b));
                            break;
                        case 2:
                            System.out.println("a - b = " + MENU.substration(a, b));
                            break;
                        case 3:
                            System.out.println("a x b = " + MENU.multiplication(a, b));
                            break;
                        case 4:
                            System.out.println("a / b = " + MENU.division(a, b));
                            break;
                        default:
                            System.out.println("ERROR??? Please give correct option!");
                    }
            } catch (Exception e) {
                System.out.println("Invalid input...?");
                sc.next();
            } finally {
                System.out.println("END THE PROGRAM");
            }
            System.out.println("Would you like to continue ? (yes or no)");
            choice = sc.next();
        } while (choice.equals("yes") || choice.equals("Yes")) ;
    }
}
