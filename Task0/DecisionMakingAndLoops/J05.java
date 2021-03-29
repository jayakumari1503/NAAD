//Java program to reverse a number.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reverse = 0;

        System.out.print(" Enter a number : ");
        int number = scanner.nextInt();

        int n = number;

        while(number != 0)
        {
            n = number%10;
            reverse = reverse * 10 + n;
            number /= 10;
        }

        System.out.print(" Reverse of a given number : " + reverse + ".");
    }
    
}
