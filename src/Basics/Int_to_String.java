package Basics;

import java.util.Scanner;

public class Int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String convert=Integer.toString(n);
        if ((Integer.parseInt(convert) == n)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong Answer");
        }
    }
}
