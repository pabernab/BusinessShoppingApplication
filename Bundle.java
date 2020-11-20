package Team8.Cs151.SJSU.model;

import java.util.ArrayList;

public class Bundle implements LineItem {
    private String name;
    private int ID;
    private double price;
    public ArrayList<Item> items = new ArrayList<>();

    public Bundle(int ID) {
        this.name = "Bundle ";
        this.ID = ID;
        this.price = 0.00;
    }
    public void addItem(Item a){
        items.add(a);
        name +=a.getName()+ "+ ";
        price += a.getPrice();
    }
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

}
