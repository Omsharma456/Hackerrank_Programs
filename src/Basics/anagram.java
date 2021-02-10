package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1=sc.next().toCharArray();
        char[] s2=sc.next().toCharArray();
        for (int i=0; i<s1.length; i++){
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    s1[i] = '0';
                    s2[j]='0';
                }
            }
        }

        int count=0;
        for (int i=0; i<s1.length; i++){
            if (s1[i] != '0') {
                count++;
            }
            }
        for (int i = 0; i <s2.length ; i++) {
            if (s2[i] != '0') {
                count++;
            }
        }
        System.out.println(count);
    }
}
