package Basics;

import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_testCase = sc.nextInt();
        for (int i = 0; i < no_of_testCase; i++) {
            try {
                long element = sc.nextLong();
                System.out.println(element + " can be fitted in:");
                if (element >= -128 && element <= 127) {
                    System.out.println("* byte");
                } else if (element >= -32768 && element <= 32767) {
                    System.out.println("* short");
                } else if (element >= -2147483648 && element <= 2147483647) {
                    System.out.println("* int");
                } else if (element >= -Math.pow(2, 63) && element <= (Math.pow(2, 63)) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.nextLong()+" can't be fitted anywhere.");
            }
        }
    }
}