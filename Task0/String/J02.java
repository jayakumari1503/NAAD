//Java program to compare strings.

package Task0.String;

import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter first string : ");
        String string1 = (scanner.nextLine()).toUpperCase();


        System.out.print(" Enter second string : ");
        String string2 = (scanner.nextLine()).toUpperCase();

        if(string1.equals(string2))
            System.out.print(" String is equal.");
        else
            System.out.print(" String is not equal.");
    }
}
