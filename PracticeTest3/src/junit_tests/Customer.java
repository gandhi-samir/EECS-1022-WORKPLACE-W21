package junit_tests;

import model.Record;

public class Customer {
	String name=null;
	double balance=0;
	Record[] records = new Record[0];




	

	public Customer(String name, double balance) {
		this.name=name;
		this.balance=balance;

		
	}

	public Customer(String name) {
		this.name=name;
	
	}

	public String getName() {
		
		return name;
	}

	public double getBalance() {
		
		return balance;
	}

	public Record[] getRecords() {
	
		return records;
	}

	public double getAmountDue() {
		double amountPay=0;
		for(int i =0; i <records.length;i++) {
			if(records[i]!=null) {
			amountPay+=records[i].getAmount();
		}
		}
		
	
		
		return amountPay;
	}

	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}

	
	
	public void addRecord(Record r1) {
		Record[] temp;
		if(records.length<1) {
			records=new Record[1];
			records[0]=r1;
			
		}
		else {

	 temp=records;
	 records=new Record[records.length+1];
	 for(int i =0; i < temp.length;i++) {
		 records[i]=temp[i];
	 }
	 records[records.length-1]=r1;
		}
		
	}

	public void addRecord(String name, double price, int quantity) {
		Record record = new Record(name,price,quantity);
		addRecord(record);
		
	}

	public void addRecords(Record[] orders) {
		for(int i =0; i <orders.length;i++) {
			if(orders[i]!=null) {
			addRecord(orders[i]);
			}
			
		}
		
		
		}

	public Record[] getRecordsLargerThan(double amount) {
		Record [] larger= new Record[0];
		Record [] temp;
		for(int i =0; i <records.length;i++) {
			if(records[i]!=null)
			
			if(records[i].getAmount()>amount) {
				temp = larger;
				larger = new Record[larger.length+1];
				for(int j =0;j < temp.length; j++) {
					larger[j]=temp[j];
				}
				larger[larger.length-1]=records[i];
				
			}
			
		}
		
		return larger;
	}
	
	public void setBalance(double amount) {
		this.balance=balance-amount;
	}
	
	public void resetRecord() {
		records = new Record[0];
	}
	
		
	

		
	
		
	

}
