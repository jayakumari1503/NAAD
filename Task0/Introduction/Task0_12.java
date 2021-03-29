//Java program to remove all whitespaces from a string.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_12 {
    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a string : ");
        String str = scanner.nextLine();
        
        str = str.replaceAll("\\s" , "");
        System.out.println("After replacement :" + str);
    }
    
}
