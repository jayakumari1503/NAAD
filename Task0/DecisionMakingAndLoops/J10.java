//Java program to create pyramid and pattern.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;
public  class J10 {
    public static void main(String[] args) {

        System.out.print(" Enter number of rows : ");
        Scanner scanner = new Scanner(System.in);
        int number_Of_Rows = scanner.nextInt();

        // outer loop to handle number of rows
        for (int i = 0; i < number_Of_Rows; i++) {

            //inner loop to handle number of columns
            for (int j = number_Of_Rows - i; j > 1; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                //printing stars
                System.out.print(" *  ");
            }

            System.out.println();
        }
    }
}