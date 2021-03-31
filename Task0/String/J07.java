//Java program to iterate through each characters of the string.

package Task0.String;

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a String : ");
        String str = scanner.nextLine();
        String noSpaceStr = str.replaceAll("\\s","");


        for(char ch : noSpaceStr.toCharArray()) {
            System.out.print(ch + " , ");
        }
    }
}
