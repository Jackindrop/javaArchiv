package abschnitt_3Einkaufswaagen;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> items= new ArrayList<CartItem>();

    public ShoppingCart() {}

    public void setItemToCart(CartItem i) {
        items.add(i);
    }

    public void addItem(CartItem item) {
        setItemToCart(item);
    }

    public double getTotalCost() {
        double totalCost= 0;
        for (int i= 0; i< items.size(); i++) {
            CartItem tmp= new CartItem(this.items.get(i));
            totalCost+= tmp.getCost()*tmp.getQuantity();
        }
        return totalCost;
    }
}
