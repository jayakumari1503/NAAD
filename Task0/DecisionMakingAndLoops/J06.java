//Java program to check whether a number is palindrome or not.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {

        int temp = 0;
        int reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int number = scanner.nextInt();

        int n = number;

        while(number != 0)
        {
            n = number % 10;
            reverse = reverse * 10 + n;
            number /= 10;

        }

        if(temp == reverse)
            System.out.print("Number is palindrome number.");
        else
            System.out.print("Number is not palindrome number.");
    }
    
}
