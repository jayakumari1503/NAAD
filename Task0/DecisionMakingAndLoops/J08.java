//Java program to count the number of vowels and consonants in a sentence.

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class J08 {
    public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            //check whether a character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
            System.out.print("Number of vowels in string : " + vCount);

            System.out.print("\n Number of consonants in string : " + cCount);
    }
}
