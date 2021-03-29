//Java program to calculate average using arrays.
package Task0.Arrays;

import java.util.Scanner;

public class J01 {
          public static void main(String[] args) {

              int sum = 0;
              float average;

              Scanner scanner = new Scanner(System.in);
              System.out.print(" Enter number of elements which you want in array : ");
              int number = scanner.nextInt();
              int[] a = new int[number];
              System.out.print(" Enter all the elements : ");

              for(int i = 0; i<number; i++)
              {
                  a[i] = scanner.nextInt();
                  sum = sum + a[i];
              }
                 System.out.print(" Sum : " + sum);
                 average = (float)sum / number;
                 System.out.print(" Average : " + average);
    }
}
