//Java program to check whether a character is alphabet or not.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J01 {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.print(" Enter a character : ");
         char ch = scanner.next().charAt(0);

         if(ch>= 'a' && ch<= 'z' || ch>= 'A' && ch<= 'Z')
             System.out.print( ch + " : Character is alphabet.");
         else
             System.out.print(ch + " : Character is not  alphabet.");

     }
    
}
