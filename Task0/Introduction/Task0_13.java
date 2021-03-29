//Java program to round a number to n decimal places.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_13 {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print(" Enter a number : ");
      float N = scanner.nextFloat();
      int result = Math.round(N);

      System.out.print( " After round : " + result);
   } 
}
