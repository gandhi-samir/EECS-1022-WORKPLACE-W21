package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] seq = {3, 1, 1, 1, 2, 2, 2, 2};
		int[] result = Utilities.task4(seq);
		
		System.out.println(result[0]);
		input.close();
	}

}
