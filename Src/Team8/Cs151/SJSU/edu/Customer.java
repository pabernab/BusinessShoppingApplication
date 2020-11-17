public class Customer {
    public String name;
    public int ID;
    public String address;
    public double balance;
    public double credit_limit;
    Order newOrder;

    public Customer(int xID, String xName, String xAddress, double xBalance, double xCredit_limit) {
        ID = xID;
        name = xName;
        address = xAddress;
        balance = xBalance;
        credit_limit = xCredit_limit;
    }

    public void UpdateBalance(double newBalance) {
        balance += newBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void addOrder() {

    }

}
