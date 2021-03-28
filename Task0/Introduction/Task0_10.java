//Java program to find all roots of a quadratic equation.
package Task0.Introduction;

import java.util.Scanner;

public class Task0_10 {
    public static void main(String args[]) {
        System.out.println(" Standard form of quadratic equation is a*x^2 + b*x + c = 0" );
            System.out.println(" Enter the value of a :");
            System.out.println(" Enter the value of b : ");
            System.out.println(" Enter the value of c : ");

        Scanner sc = new Scanner(System.in);
            double a = sc.nextFloat();
            double b = sc.nextFloat();
            double c = sc.nextFloat();
            double determinant = b * b - 4 * a * c ;
            double root1;
            double root2;

        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant))/( 2 * a);
            root2 = (-b - Math.sqrt(determinant))/( 2 * a);
            System.out.println(" root1 = " + root1);
            System.out.println(" root2 = " + root2);
        } 
    
        else if(determinant == 0){
            root1 = root2 = -b / ( 2 * a);
            System.out.println(" root1 = root2 = " + root1);
        }

        else {
            double real = -b / ( 2 * a );
            double imaginary = Math.sqrt(-determinant) / ( 2 * a );
            System.out.println(" root1 = " + (float)real + " + i " + (float)imaginary);
            System.out.println(" root2 = " + (float)real +  " -i " + float)imaginary);
        }
    }
}
