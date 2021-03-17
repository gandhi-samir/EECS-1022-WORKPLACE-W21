package console_apps;

import java.util.Scanner;

import junit_tests.Customer;
import model.Record;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Record r1 = new Record("GreenTeaLatte", 2.5, 4);
		Record r2 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(r1);
		alan.addRecord(r2);
		alan.addRecord("DietCoke", 1.5, 7);

		Record[] alanRecords = alan.getRecords();
		Record alanRecord1 = alanRecords[0];
		System.out.println(alan.getRecords()[1].getItem());

		
		input.close();
	}

}
