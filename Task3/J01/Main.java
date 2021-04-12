package Task3.J01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name and price of first product :");
        String nameOfFirstProduct = scanner.nextLine();
        int priceOfFirstProduct = scanner.nextInt();
        Product productFirst = new Product(nameOfFirstProduct, priceOfFirstProduct);

        System.out.print("Enter name and price of second product :");
        String nameOfSecondProduct = scanner.nextLine();
        int priceOfSecondProduct = scanner.nextInt();
        Product productSecond = new Product(nameOfSecondProduct, priceOfSecondProduct);

        System.out.print("Enter name and price of third product :");
        String nameOfThirdProduct = scanner.nextLine();
        int priceOfThirdProduct = scanner.nextInt();
        Product productThird = new Product(nameOfThirdProduct, priceOfThirdProduct);

        System.out.print("\n" + productFirst);
        System.out.print("\n" + productSecond);
        System.out.print("\n" + productThird);

        if(productFirst.equals(productSecond) || productFirst.equals(productThird) || productSecond.equals(productThird))
            System.out.print("\n First Product and Second Product are equal.");
        else
            System.out.print("\n First Product and Second Product are not equal.");

        System.out.print("\n Enter the PercentageOff :");
        int percentageOff = scanner.nextInt();

        System.out.println(SpecialProduct.applyOffOnProduct(productFirst,percentageOff));
    }
}
