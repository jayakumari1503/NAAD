//Java program to convert string type variables into int.
package Task0.TypeConversion;

import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number(string) : ");
        String str = scanner.nextLine();
        int number = Integer.parseInt(str);
        System.out.println(" Number in the form of int data type variables is " + number + " .");
           
    }

}
