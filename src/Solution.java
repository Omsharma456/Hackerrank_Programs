import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean flag=true;
        if (a.length() != b.length()) {
            flag=false;
        } else {
            String s3=a+b;
            int[] arr = new int[256];
            for (int i = 0; i < s3.length(); i++) {
                int ascii=(int)s3.charAt(i);
                arr[ascii]++;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0 && arr[j] % 2 != 0) {
                    flag=false;
                    break;
                }
            }

        }
        return flag;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}