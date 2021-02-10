package Basics;

import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String delims = "[ !,?._'@]+";
        String[] arr = s.split(delims);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
