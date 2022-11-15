package abschnitt_3Einkaufswaagen;

import java.util.InputMismatchException;

public class CartItem {

    private String name;
    private int quantity;
    private double pricePU;

    public CartItem(CartItem getIt) {
        this.name= getIt.getName();
        this.quantity= getIt.getQuantity();
        this.pricePU= getIt.getPricePU();
    }

    public CartItem(String name, int quantity, double pricePU) {
        this.name= name;
        if (quantity> 0) {
            this.quantity = quantity;
        } else {
            throw new InputMismatchException("Anzahl muss größer 0 sein.");
        }
        this.pricePU= pricePU;
    }

    public void setQuantity(int quantity) {this.quantity= quantity;}
    public int getQuantity() {return quantity;}
    public double getCost() {return this.quantity* this.pricePU;}
    public String getName() {return this.name;}
    public double getPricePU() {return this.pricePU;}

}
