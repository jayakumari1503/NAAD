//Java program to create random string.

package Task0.String;

import java.util.Random;
import java.util.Scanner;

public class J05 {
            public static void main(String[] args) {

                String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                StringBuilder sb = new StringBuilder();

                Random random = new Random();

                Scanner scanner = new Scanner(System.in);
                System.out.print(" Enter length of random string : "); //specify the length of random string
                int length = scanner.nextInt();
                for(int i = 0; i < length; i++) {

                    int index = random.nextInt(alphabet.length());

                    // get character specified by index
                    // from the string
                    char randomChar = alphabet.charAt(index);

                    sb.append(randomChar);
                }

                String randomString = sb.toString();
                System.out.println("Random String is: " + randomString);
            }
        }
