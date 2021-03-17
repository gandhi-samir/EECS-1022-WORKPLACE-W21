package junit_tests;


public class Shop {
	Customer[] customer = new Customer[0];
	Customer [] temp;

	public Customer[] getCustomers() {
		// TODO Auto-generated method stub
		return customer;
	}

	public void addCustomer(Customer name) {
		temp=customer;
		customer = new Customer[customer.length+1];
		for (int i =0; i <temp.length;i++) {
			customer[i]=temp[i];
		}
		customer[customer.length-1]=name;
		
		
		
	}

	public void pay(String name) {
		for(int i =0; i <customer.length;i++) {
			if(customer[i]!=null) {
				if(customer[i].getName().equals(name)) {
					customer[i].deposit(0-customer[i].getAmountDue());
					customer[i].resetRecord();
					
					
				}
				
			}
		}
	
	
		
	}

	
		
	}


