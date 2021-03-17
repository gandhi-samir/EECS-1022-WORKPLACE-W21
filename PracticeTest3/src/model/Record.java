package model;

public class Record {
	String name=null;
	double price=0;
	int quantity=0;
	double amountDue=0;
	
	public Record (String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.amountDue+=price*quantity;
		
		
		
	}
	
	public Record() {
		
	}

	public Object getItem() {

		return name;
	}

	public double getPrice() {
		
		return price;
	}

	public Object getQuantity() {
		
		return quantity;
	}

	public void setItem(String name) {
		this.name = name;
		
	}

	public void setPrice(double price) {
	this.price = price;
		
	}

	public void setQuantity(int quantity) {
		this.quantity=quantity;
		
	}
	
	public double getAmount() {
		return amountDue;
	}

}
