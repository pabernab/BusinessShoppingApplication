public class Bundle {
    private String name;
    private int ID;
    private double price;


    public Bundle(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getPrice(Item item) {
        return item.getPrice() * 3;
    }

}
