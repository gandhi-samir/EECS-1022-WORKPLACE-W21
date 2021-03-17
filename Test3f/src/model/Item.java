package model;

public class Item {
	String name =null;
	int amount = 0;
	String info="";
	

	public Item(String name) {
		this.name=name;
		info ="Item: "+name+" ("+amount+")";
	}

	public String getTitle() {
		
		return name;
	}

	public int getAmount() {
		
		return amount;
	}

	public Object getInfo() {
	
		return info;
	}

	public void increaseAmount(int amountIncrease) {
		
		if (amountIncrease>0) {
			this.amount+=amountIncrease;
			info ="Item: "+name+" ("+amount+")";
		}
		if(amountIncrease<=0) {
			info = "Error: non-positive amount "+amountIncrease;
			
		}
		
	}

	public void decreaseAmount(int amountDecrease) {
		if (amountDecrease>0&&amountDecrease<=amount) {
			this.amount-=amountDecrease;
			info ="Item: "+name+" ("+amount+")";
		}
		else if(amountDecrease<=0) {
			info = "Error: non-positive amount "+amountDecrease;
			
		}
		else if(amountDecrease> amount) {
			info = "Error: amount is short of "+(amountDecrease-amount);
		}
		
		
	}

}
