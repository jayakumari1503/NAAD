//Java program to check whether a number is even or odd.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_7 {
 public static  void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     System.out.println(" Enter any integer : ");
     int number = scanner.nextInt();
        if(number % 2 == 0) 
                System.out.println( number + " is even.");
        else 
                System.out.println( number + " is odd.");  
 }   
}
