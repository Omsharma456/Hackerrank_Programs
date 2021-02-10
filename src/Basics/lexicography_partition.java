package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lexicography_partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next().toLowerCase();
        int partition=sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= s.length()-partition; i++) {
            list.add(s.substring(i, i + partition));
        }
        System.out.println(list);
        int max=0;
        int maxIndex=0;
        int min = list.get(0).charAt(0);
        int minIndex=0;
        for (int i = 0; i < list.size(); i++) {
            int asciimax=(int) list.get(i).charAt(0);
            int asciimin=asciimax;
            if (asciimax > max) {
                max=asciimax;
                maxIndex=i;
            }if (asciimin < max) {
                max=asciimax;
                maxIndex=i;
            }
        }
        System.out.println(list.get(maxIndex));
        System.out.println(list.get(minIndex));
    }
}
