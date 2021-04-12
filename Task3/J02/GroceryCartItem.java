package Task3.J02;

public class GroceryCartItem extends GroceryItem {
    float price;
    float quantity;

    GroceryCartItem(String name, int pricePerKg) {
        super(name,pricePerKg);
    }


    @Override
    public String toString() {

        return String.format("%s(₹%d X %fkg) = ₹%.2f", name,pricePerKg,quantity,price);
    }

    public static float extractQuantity(String quantityStr) {
        String[] quantityStrArray = quantityStr.split(" ");
        quantityStrArray[0] = quantityStrArray[0].replace("kg","");
        quantityStrArray[1] = quantityStrArray[1].replace("kg","");

        int kg,g;
        float result;
        kg = Integer.parseInt(quantityStrArray[0]);
        g = Integer.parseInt((quantityStrArray[1]));
        result = (float)kg + (float)g/1000;
        return result;
    }

    public static GroceryCartItem createNew(GroceryCartItem item, String quantityStr) {
        GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
        cartItem.quantity = GroceryCartItem.extractQuantity(quantityStr);
        cartItem.price =(float) item.pricePerKg*cartItem.quantity;
        return cartItem;
    }
}

