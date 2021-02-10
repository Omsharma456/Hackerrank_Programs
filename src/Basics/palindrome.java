package Basics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        boolean flag=true;
        int half=s.length()/2;
        int movefromlast=s.length()-1;
        for (int i=0; i<half; i++){
            if (movefromlast != half) {
                if (s.charAt(i) != s.charAt(movefromlast)) {
                    flag=false;
                    break;
                }
            }
            movefromlast--;
        }
        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
