package Basics;

import java.util.Scanner;

public class Series_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_test_case = sc.nextInt();
        while (no_of_test_case != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int formula = (int) (a + Math.pow(2, 0) * b);
            System.out.print(formula + " ");
            for (int i = 1; i < n; i++) {
                for (int j = i; j <= i; j++) {
                    formula += (int) (Math.pow(2, j) * b);
                }
                System.out.print(formula + " ");
            }
            no_of_test_case--;
        }
    }
}