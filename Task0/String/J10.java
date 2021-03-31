//Java program to check if a string contains a substring.

package Task0.String;

import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string :");
        String string = scanner.nextLine();

        System.out.print("Enter a substring :");
        String str1 = scanner.nextLine();

        boolean result = string.contains(str1);

        if(result)
            System.out.print("String contains a substring :" + str1);
        else
            System.out.print("String does not contains a substring :" + str1);

    }
}
