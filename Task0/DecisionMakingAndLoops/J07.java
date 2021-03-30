//Java program to make simple calculator using switch case.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float number1;
        float number2;


            System.out.print("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit\n");
            System.out.print(" Enter choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print(" 1.Addition \n Enter two  number : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.print(" Addition of " + number1 + " and " + number2 + " = " + (number1 + number2));
                }
                case 2 -> {
                    System.out.print("2.Subtraction \n Enter two  number : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.print(" Subtraction of " + number1 + " and " + number2 + " = " + (number1 - number2));
                }
                case 3 -> {
                    System.out.print("3.Multiplication \n Enter two  number : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.print(" Multiplication of " + number1 + " and " + number2 + " = " + (number1 * number2));
                }

                case 4 -> {
                    System.out.print("4.Division \n Enter two  number : ");
                    number1 = scanner.nextFloat();
                    number2 = scanner.nextFloat();
                    System.out.print(" Addition of " + number1 + " and " + number2 + " = " + (number1 / number2));
                }
                case 5 ->
                    System.exit(0);
            }

        }
    }
