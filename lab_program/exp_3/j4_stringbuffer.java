package exp_3;/*
write a program that converts all the char of string in capital latter use string buffer to store string without using inbuilt function
 */

import java.util.Scanner;
public class j4_stringbuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();

        StringBuffer s2 =new StringBuffer(s1);

        for (int i = 0; i < s2.length(); i++) {
            char s = s2.charAt(i);
            if (s>='a' && s<='z'){
                s = (char)((int)s-32);
                s2.setCharAt(i, s);
            }
        }

        System.out.println(s2);

    }
}
