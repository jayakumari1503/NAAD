//Java program to count number of digits in an integer.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.print(" Enter a number : ");
        int num = scanner.nextInt();

        while(num != 0){
            num = num/10;
            count++;

            if(num == 0)
                System.out.print(" Total count number of digits in given number is " + count + ".");
        }
    }
}
