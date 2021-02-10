package Basics;

import java.util.Locale;
import java.util.Scanner;

public class String_Lexicography {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next();
        System.out.println(s1.length() + s2.length());
        if ((int) s1.charAt(0) < (int) s2.charAt(0)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        int capital=(int)s1.charAt(0)-32;
        System.out.println((char) capital+s1.substring(1,s1.length())+"\n"+s2);

    }
}
