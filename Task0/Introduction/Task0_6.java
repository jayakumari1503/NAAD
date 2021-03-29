//Java program to swap two numbers.
package Task0.Introduction;

import java.util.*;
 class Task0_6 {
    public static void main(String args[]) {
        int x;
        int y;
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the value of x and y :");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(" Before swapping :" + " x = " + x + " and "+ " y =" + y);
        z = x;
        x = y;
        y =z;
        System.out.println(" After swapping : " + " x = " + x + " and " + " y = " + y);
    }
}
