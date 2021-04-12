package Task3.J01;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;

    SpecialProduct(String name, int price) {

        super(name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff) {
        int discountedPrice = product.price - product.price*percentageOff/100;

        SpecialProduct specialProduct = new SpecialProduct(product.name, discountedPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;

        return specialProduct;
    }


    @Override
    public String toString() {
        return String.format("\n For First Product \n Product Name : %s @ Rs. %d, Regular price : Rs. %d @ PercentageOff : %d @ Discounted Price : %s", name, regularPrice, percentageOff, discountedPrice);
    }
}
