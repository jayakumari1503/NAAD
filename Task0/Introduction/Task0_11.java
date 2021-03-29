//Java program to find the frequency of character in a string.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_11 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a string : ");
        String str = scanner.nextLine();

        System.out.print(" Enter a random character : ");
        char character = scanner.nextLine().charAt(0);
        int frequency = 0;

        for(int i = 0; i<str.length(); i++) {
            if (character == str.charAt(i)) {
                ++frequency;
            }
        }
            
                System.out.println(" Frequency of " + character + " = " + frequency);
      
    }
}
