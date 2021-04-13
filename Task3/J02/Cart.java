package Task3.J02;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    Cart() {
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }

     public Cart add(GroceryCartItem items) {
        cartItems.add(items);
        return this;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cart{" +" \n\t groceryCartItems = [" );
      for(GroceryCartItem item : cartItems) {
          stringBuilder.append("\n\t\t" + item + " , ");
          totalAmount += item.price;
      }
      stringBuilder.append("\n\t],\n\ttotalAmount = $" + totalAmount + "\n}");
      return stringBuilder.toString();
    }
}
