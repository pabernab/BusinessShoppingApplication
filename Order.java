package Team8.Cs151.SJSU.model;
import java.util.ArrayList;

public class Order {
	
	ArrayList<LineItem> itemList;
	//ArrayList<Bundle> bundleList;
	//ArrayList<Discount> discountList;
	double totalPrice;
	
	Order () {
		this.itemList = new ArrayList<LineItem>();
		//this.bundleList = new ArrayList<Bundle>();
		//this.discountList = new ArrayList<Discount>();
	}

	public boolean addItem ( Item i) {
		if (i == null)
			return false;
		else {
			itemList.add(i);
			return true;
		}	
	}
	public boolean addItem ( Bundle b) {
		if (b == null)
			return false;
		else {
			itemList.add(b);
			return true;
		}	
	}
	public boolean addItem ( Discount d) {
		if (d == null)
			return false;
		else {
			itemList.add(d);
			return true;
		}	
	}
	
	public double getPrice () {
		totalPrice = 0;
		for ( LineItem i : itemList) {
			totalPrice += i.getPrice();

		}
		return totalPrice;
		//for ( Bundle b : bundleList) {
			//totalPrice += b.getPrice();
		//}
		//for ( Discount d : discountList) {
			//totalPrice += d.getPrice();
		//}
	}


	public ArrayList<LineItem> getOrderList() {
		return itemList;
	}


}
