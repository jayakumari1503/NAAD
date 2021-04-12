package Task3.J02;

public class Main {
    public static void main(String[] args) {
        GroceryCartItem sugar = new GroceryCartItem("Sugar", 45);
        GroceryCartItem jaggery = new GroceryCartItem("Jaggery", 60);
        GroceryCartItem apple = new GroceryCartItem("Apple", 100);
        GroceryCartItem pulses = new GroceryCartItem("Pulses", 120);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(sugar , " 3kg 0g"))
                .add(GroceryCartItem.createNew(jaggery, "0Kg 750g"))
                .add(GroceryCartItem.createNew(apple, "1Kg 500g"))
                .add(GroceryCartItem.createNew(pulses, "3Kg 500g"));

        System.out.print(cart.toString());

    }
}
