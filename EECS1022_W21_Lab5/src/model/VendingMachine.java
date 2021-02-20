package model;

public class VendingMachine {
	String food;
	

	String Status = "Empty VM Started";
	int Coke = 0;
	int OrangeJuice = 0;
	int KitKatChunkyBar = 0;
	int LaysClassicChips = 0;
	String Stock;
	
	
	
	
	public String checkStock(String food) {
	this.food = food;
	
	if (food == "Coke") {
		Stock = food+" ("+Coke+")";
	}
	
	else if (food == "Orange Juice") {
		Stock = food+" ("+OrangeJuice+")";
	}
	
	else if (food == "Kitkat Chunky Bar") {
		Stock = food+" ("+KitKatChunkyBar+")";
	}
	
	else if (food == "Lay's Classic Chips") {
		Stock = food+" ("+LaysClassicChips+")";
	}
	
	else if (food != "Coke" || food != "Orange Juice" || food != "Lay's Classic Chips"|| food != "Kitkat Chunky Bar") { 
		Stock ="Invalid product: " +food;
	}
	
	return Stock;
		
	}
	
	public String checkStock() {
		Stock = "Stock: Coke ("+Coke+"), Orange Juice ("+OrangeJuice+"), Kitkat Chunky Bar ("+KitKatChunkyBar+"), Lay's Classic Chips ("+LaysClassicChips+")"; 
		
		return Stock;
	}
	
	
	public String checkStatus() {	
		
		return Status;
	
	}
	
	public void add(String food, int quantity) {
		if (food == "Coke") {
			Coke+=quantity;
			Status = "Product added: Coke ("+quantity+")";
		}
		
		else if (food == "Orange Juice") {
			OrangeJuice += quantity;
			Status = "Product added: Orange Juice ("+quantity+")";
		}
		
		else if (food == "Kitkat Chunky Bar") {
			KitKatChunkyBar+=quantity;
			Status = "Product added: Kitkat Chunky Bar ("+quantity+")";
		}
		
		else if (food == "Lay's Classic Chips") {
			LaysClassicChips+= quantity;
			Status = "Product added: Lay's Classic Chips ("+quantity+")";
		}
		
		else if (food != "Coke" || food != "Orange Juice" || food != "Lay's Classic Chips"|| food != "Kitkat Chunky Bar") { 
			Status ="Invalid product: " +food;
		}

		
		
	}
	
	public void dispense(String food, int quantity) {
		if (food == "Coke") {
			Coke-=quantity;
			Status = "Product removed: Coke ("+quantity+")";
		}
		
		else if (food == "Orange Juice") {
			OrangeJuice -= quantity;
			Status = "Product removed: Orange Juice ("+quantity+")";
		}
		
		else if (food == "Kitkat Chunky Bar") {
			KitKatChunkyBar-=quantity;
			Status = "Product removed: Kitkat Chunky Bar ("+quantity+")";
		}
		
		else if (food == "Lay's Classic Chips") {
			LaysClassicChips-= quantity;
			Status = "Product removed: Lay's Classic Chips ("+quantity+")";
		}
		
		else if (food != "Coke" || food != "Orange Juice" || food != "Lay's Classic Chips"|| food != "Kitkat Chunky Bar") { 
			Status ="Invalid product: " +food;
		}

		
		
		
	}
	
}
