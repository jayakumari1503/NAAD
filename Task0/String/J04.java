//Java program to check if two strings are anagram.

package Task0.String;

import java.util.Arrays;
import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter first String :");
        String str1 = scanner.nextLine();
        str1 = str1.toLowerCase();

        System.out.print(" Enter second String :");
        String str2 = scanner.nextLine();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2))
                System.out.print(str1 + " and " + str2 + " are anagram.");
            else
                System.out.print(str1 + " and " + str2 + " are not anagram.");
            }
        else
            System.out.print(str1 + " and " + str2 + " are not anagram.");
    }
    
}
