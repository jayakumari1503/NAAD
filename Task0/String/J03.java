//Java program to check if a string is numeric.

package Task0.String;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a String :");
        String str = scanner.nextLine();
        boolean numeric = true;

        try{
            double number = Double.parseDouble(str);
        }
        catch(NumberFormatException exception) {
            numeric = false;
        }
        if(numeric) {
            System.out.print(str + " : String is numeric.");
        }
        else
            System.out.print( str + " : String is not numeric.");
    }
    
}
