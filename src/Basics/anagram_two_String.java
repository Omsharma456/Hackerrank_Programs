package Basics;

import java.util.Scanner;

import static java.lang.System.exit;

public class anagram_two_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            exit(0);
        } else {
            String s3=s1+s2;
            int[] arr = new int[256];
            for (int i = 0; i < s3.length(); i++) {
                int ascii=(int)s3.charAt(i);
                arr[ascii]++;
            }
            boolean flag=true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0 && arr[j] % 2 != 0) {
                    flag=false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
            }
        }
    }
}
