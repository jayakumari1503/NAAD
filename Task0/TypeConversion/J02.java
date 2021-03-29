//Java program to convert int type variable to string.
package Task0.TypeConversion;

import java.util.Scanner;

public class J02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a number(int variable) : ");
        int number  = scanner.nextInt();
        String str = String.valueOf(number);
        System.out.println("Number in the form of string : " + str + " . ");
        
    }
}
