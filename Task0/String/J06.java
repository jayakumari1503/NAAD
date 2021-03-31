//Java program to capitalize the first character of each word in a string.

package Task0.String;

import java.util.Scanner;

public class J06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a String : ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s");
        String capitalizeWord = "";

        for(String w:words) {
            String first = w.substring(0, 1);
            String remainingFirst = w.substring(1);

            first = first.toUpperCase();

            capitalizeWord += first.toUpperCase() + remainingFirst + " ";
        }
            System.out.print(" Required String : " + capitalizeWord.trim());
    }
}
