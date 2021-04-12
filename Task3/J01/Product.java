package Task3.J01;

public class Product {
     String name;
     int price;
    int discountedPrice;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        discountedPrice = price;
    }

    @Override
    public String toString() {
        return String.format("Name : %s  @ Rs. : %d",this.name, this.price);
    }

    @Override
    public boolean equals(Object obj) {
        Product override = (Product) obj;

        if (!override.name.equals(this.name) || override.price != this.price)
            return false;
        else
            return true;
    }

}
