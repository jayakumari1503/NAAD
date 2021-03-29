//Java program to display alphabets( A to Z) using loop.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Alphabets (A to Z) : ");

        for(int i = 65; i<=90; i++) {
            char ch = (char) i;
            System.out.print( ch + " ");
        }
    }

}
