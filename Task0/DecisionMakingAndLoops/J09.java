//Java program to sort elements in Lexicographical order( Dictionary Order).

package Task0.DecisionMakingAndLoops;

import java.util.Scanner;
public class J09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of element which you want to sort in Lexicographical Order :");
        int size_Of_Elements = scanner.nextInt();

        String[] elements = new String[size_Of_Elements];

        System.out.print("Enter an elements :");
        for(int i = 0; i<size_Of_Elements; i++) {
            elements[i] = scanner.nextLine();
        }

        for(int i = 0; i < (size_Of_Elements-1); i++) {
            for (int j = i + 1; j < size_Of_Elements; j++) {
                if (elements[i].compareTo(elements[j]) > 0) {

                    //swap elements[i] with elements[j]
                    String temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
                System.out.print(" Elements in Lexicographical Order : ");
                for(int i = 0; i<(size_Of_Elements); i++){
                    System.out.print(elements[i] + " ");
                }
            }
        }
