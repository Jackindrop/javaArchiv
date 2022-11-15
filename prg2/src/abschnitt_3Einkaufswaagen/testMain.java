package abschnitt_3Einkaufswaagen;

public class testMain {
    public static void main(String[] args) {
        CartItem Futter= new CartItem("Futter", 10, 2.35);
        CartItem Trinken= new CartItem("Trinken", 6, 0.95);
        CartItem Suff= new CartItem("Suff", 32, 55.70);

        Suff.setQuantity(64);

        ShoppingCart cart= new ShoppingCart();

        cart.addItem(Futter);
        cart.addItem(Trinken);
        cart.addItem(Suff);
        System.out.println(cart.getTotalCost());

        CartItem Nix= new CartItem("Nix", 0, 55.70);


    }
}
