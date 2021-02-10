package Basics;

import java.time.LocalDate;
import java.util.Scanner;

public class get_day {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int mm = in.nextInt();
    int dd = in.nextInt();
    int yy = in.nextInt();
    LocalDate dt = LocalDate.of(yy, mm, dd);
    System.out.print(dt.getDayOfWeek());
}}