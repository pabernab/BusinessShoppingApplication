package Team8.Cs151.SJSU.model;

public class OrderTester {
    public static void main(String[] args) {
        Item a1 = new Item("cab", 1234,145.00);
        Item a2 = new Item("cab", 1266,155.00);
        Item a3 = new Item("Chard", 1277,160.00);
        Item a4 = new Item("Chard", 1289,170.00);
        Bundle b1 = new Bundle( 9266);
        Bundle b2 = new Bundle(9277);
        b1.addItem(a1);
        b1.addItem(a4);
        Discount d1 = new Discount(a1,.08);
        Discount d2 = new Discount(b1,.10);
        Order newOrder = new Order();
        Customer c1 = new Customer(68965,"Original Joes","901 S First Street", 4384.00,8000.00);
        c1.addOrder(newOrder);
        newOrder.addItem(a1);
        newOrder.addItem(b1);
        newOrder.addItem(d1);
        newOrder.addItem(d2);
        System.out.println("Customer ID: "+c1.ID+
                "\n" +"Customer Name: " + c1.name + "\n"
                + "Address: "+ c1.address +"\n"+
                "Balance: "+c1.balance);
        for (LineItem a : newOrder.itemList){
            System.out.println(a.getID()+" "+a.getName()+" "+a.getPrice());

        }
        System.out.println(" The Order Total : "+ newOrder.getPrice());
    }
}
