//Write a function boolean isDirectlyProportional(int[] x, int[] y)where :
//x & y are two inter-related mathematical variables
//x.length = y.length
//x[i] is related to y[i]
//Your task is to return a boolean stating whether x & y are directly proportional to each other.


package Task1;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter size for both array :");
        int sizeOfArray = scanner.nextInt();

        System.out.print("Enter elements of array X :");
        int[] X = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++)
            X[i] = scanner.nextInt();

        System.out.print("Enter elements of array Y :");
        int[] Y = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++)
            Y[i] = scanner.nextInt();

        if (isDirectlyProportional(X, Y))
            System.out.print(" X & Y are directly proportional to each other.");
        else
            System.out.print(" X & Y are not directly proportional to each other.");
    }

    public static boolean isDirectlyProportional(int[] X, int[] Y) {
        for (int i = 0; i < X.length; i++) {
            if (X[i + 1] > X[i]) {
                if (Y[i + 1] < X[i]) {
                    return false;
                }
            } else if (X[i + 1] < X[i]) {
                if (Y[i + 1] > Y[i]) {
                    return false;
                }
            } else {
                if (Y[i + 1] != Y[i]) {
                    return false;
                }
            }
        }
            return true;
        }
    }
