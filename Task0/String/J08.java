//Java program to differentiate string == operator and equals() method.

package Task0.String;

import java.util.Scanner;

public class J08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter a String :");
        String str1 = scanner.nextLine();

        System.out.print(" Enter a String :");
        String str2 = scanner.nextLine();

        // == operator is use to compare reference or address
        if(str1 == str2)
            System.out.print("str1 == str2 is true.");
        else
            System.out.print("str1 == str2 is false.");

        // equals() method is use to check contents are same or not
        if(str1.equals(str2))
            System.out.print("\nstr1.equals(str2) is true.");
        else
            System.out.print("\nstr1.equals(str2) is false.");
    }
}
