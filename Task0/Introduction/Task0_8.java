//Java program to check whether a number is vowel or consonant.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_8 {
  public static void main(String args[]) {

         Scanner scanner = new Scanner(System.in);

         char character = scanner.next().charAt(0);

     if( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character =='A' || character == 'E' || character == 'I' || character == 'O' || character =='U')
        System.out.println(character + " is vowel." );

    else
        System.out.println(character + " is Consonant.");

      
  }  
}
