//Java program to check if a string is empty or null.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter string : ");
        String str = scanner.nextLine();

        if(str == null || str.isEmpty() )
        System.out.println(" String is empty or null");
        
        else
        System.out.println(" String is not empty or null"); 
    }
    
}
