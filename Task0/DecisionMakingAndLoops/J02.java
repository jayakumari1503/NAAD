//Java program to display fibonacci series.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number :");
        int N = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.print(" First " + N + " terms  of fibonacci series : ");

        for( int i = 0; i<=N; i++) {
            System.out.print(num1 + " + ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
