// Write a function int totalWeight(String s, int[] weights)where
//String s consists characters (A-E).
//int[] weights consists weights of characters A-E in the order A-E.
//Your task is to return the total weight of string s according to weights given.

package Task1;

import java.util.Scanner;

public class J02 {
    public static int totalWeight(String S, int[] weights) {
        int totalWeights = 0;
        int j = 0;
        int index = 0;
        char ch;
        for (int i = 65; i < 70; i++) {
            ch = (char) (i);
            for (int k = 0; k < S.length(); k++) {
                if (ch == S.charAt(k))
                    j++;
            }
            totalWeights += j * weights[index];
            index++;
            j = 0;
        }
        return totalWeights;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a string consists characters (A-E) :");
        String str = scanner.next();
        str = str.toUpperCase();

        System.out.print(" Enter integer weights consists of characters A-E in order A-E : ");
        int[] weights = new int[5];

        for (int i = 0; i < 5; i++)
            weights[i] = scanner.nextInt();
            System.out.print(" Total weight of string S according to weights of character is " + totalWeight(str, weights));
    }
}
