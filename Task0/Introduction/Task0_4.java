//Java program to find ASCII value of a character.
package Task0.Introduction;
import java.util.Scanner;
public class Task0_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a character : ");
        char character = scanner.next().charAt(0);
        System.out.print(" ASCII VALUE OF " + character + " is "+ ( int ) character);

    }    
}
