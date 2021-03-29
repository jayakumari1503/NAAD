//Java program to find the largest among three number.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_9 {
 public static void main(String args[]) {
     int x;
     int y;
     int z;

    Scanner scanner = new Scanner(System.in);

     System.out.print(" Enter the first number : ");
     x = scanner.nextInt();

     System.out.print(" Enter the second number : ");
     y = scanner.nextInt();

     System.out.print(" Enter the third number : ");
     z = scanner.nextInt();

     if(x > y && x > z)
            System.out.println(" Largest number = " + x);
    else if(y > z)
            System.out.println(" Largest number = " + y);

    else
            System.out.println(" Largest number = " + z);

    }

}
