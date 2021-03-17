package model;

public class Repository {
	int itemCounter=0;
	Item [] items = new Item[0];

	public Repository(int i) {
		// TODO Auto-generated constructor stub
	}

	public Item[] getItems() {
		
		return items;
	}

	public Item[] getItems(String[] titles) {
		Item [] getItem = new Item[0];
		Item [] temp = new Item[0];
		int l =0;
		while(l<titles.length) {
		for(int i =0; i <items.length;i++) {
			
			if(items[i]!=null&&items[i].getTitle().equals(titles[l])) {
				
				temp=getItem;
				getItem = new Item[getItem.length+1];
				for(int k =0; k <temp.length;k++) {
					getItem[k]=temp[k];
				}
				getItem[getItem.length-1]=items[i];
				
				
				
			}
			
			}
		l++;
	
		}
		
		
		return getItem;
	}

	public Item[] getItemsOutsideRange(int amount1, int amount2) {
		Item [] itemsOutside = new Item[0];
		Item[] temp = new Item[0];
	
		for(int i =0; i < items.length;i++) {
			if(items[i]!=null&&items[i].getAmount()!=amount1&&items[i].getAmount()!=amount2) {
				temp=itemsOutside;
				itemsOutside=new Item[itemsOutside.length+1];
				for(int k =0; k <temp.length;k++) {
					itemsOutside[k]=temp[k];
				}
				itemsOutside[itemsOutside.length-1]=items[i];
				
			}
		}
		
		
			
		
		return itemsOutside;
	}

	public int getAmount(String string) {
		int amount = -1;
		for(int i =0; i <items.length;i++) {
			if(items[i]!=null&&items[i].getTitle().equals(string)) {
				amount = items[i].getAmount();
				break;
			}
		}
		return amount;
	}

	public void addItem(Item i1) {
		boolean isItem=false;
		for(int i =0; i <items.length;i++) {
			if(items[i].getTitle()==i1.getTitle()) {
				isItem=true;
				items[i].increaseAmount(i1.getAmount());
				break;
				
			}
		}
		
		if(itemCounter<4&&isItem==false) {
		Item [] temp = new Item[0];
		temp=items;
		items = new Item[items.length+1];
		for(int i =0; i <temp.length;i++) {
			items[i]=temp[i];
		}
		items[items.length-1]=i1;
		itemCounter++;
		}
		
	
			}

	public void decreaseAmount(String item, int amount) {
		for(int i =0; i <items.length;i++) {
			if(items[i]!=null &&items[i].getTitle().equals(item)) {
				items[i].decreaseAmount(amount);
				break;
			}
		}
		
	}
		
	

}
