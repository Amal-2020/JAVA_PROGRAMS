package JAVA;

import java.util.Scanner;

public class Toggle_UpperCase_LowerCase {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        char c[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(c[i]>='a' && c[i]<='z'){
                //c[i]= (char) (c[i]-32);
                c[i] =  (char)((int)c[i]-32);
            }else{
                c[i] = (char)((int)c[i]+32);
            }
        }
        System.out.println("The toggled string is :-");
        for (int i=0;i<str.length();i++){
            System.out.println(c[i]);
        }
    }
}
