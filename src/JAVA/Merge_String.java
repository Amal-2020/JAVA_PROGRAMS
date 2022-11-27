package JAVA;

import java.util.Scanner;

class Merge_String {
    public static String merge(String w1, String w2) {
        int len = w1.length() + w2.length();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < len; i++) {
            if (i < w1.length()) {
                sb.append(w1.charAt(i));
            }
            if (i < w2.length()) {
                sb.append(w2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WORD1:");
        String w1 = sc.next();
        System.out.println("WORD2:");
        String w2 = sc.next();
        System.out.println(merge(w1, w2));
    }
}
