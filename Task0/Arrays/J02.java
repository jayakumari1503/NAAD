//Java program to Concatenate two arrays.

package Task0.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class J02 {
    public static void main(String[] args) {

        System.out.print(" Enter number of elements which you want in first array : ");
        Scanner scanner1 = new Scanner(System.in);
        int size_Of_Array1 = scanner1.nextInt();
        int[] array1 = new int[size_Of_Array1];
        System.out.print(" Enter all the elements : ");
        for(int i = 0; i<size_Of_Array1; i++) {
            array1[i] = scanner1.nextInt();
        }
            System.out.println(" First array = " + Arrays.toString(array1));

        System.out.print(" Enter number of elements which you want in second array : ");
        Scanner scanner2 = new Scanner(System.in);
        int size_Of_Array2 = scanner2.nextInt();
        int[] array2 = new int[size_Of_Array2];

        System.out.print(" Enter all the elements : ");
        for(int i = 0; i<size_Of_Array2; i++) {
            array2[i] = scanner2.nextInt();
        }
            System.out.println(" Second array = " + Arrays.toString(array2));


        int[] array =  new int[size_Of_Array1 + size_Of_Array2];
        System.arraycopy(array1, 0, array, 0, size_Of_Array1);
        System.arraycopy(array2, 0, array,size_Of_Array1, size_Of_Array2);

        System.out.println(" Concatenate of first and second array is " + Arrays.toString(array));
    }
}
