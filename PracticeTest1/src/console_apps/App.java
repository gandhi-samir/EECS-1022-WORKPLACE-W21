package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius");
		double radius = input.nextDouble();
		System.out.println(Utilities.areaOfCircle(radius));
		
		System.out.println("enter number 1");
		int one = input.nextInt();
		
		System.out.println("enter number 2");
		int two = input.nextInt();
		
		System.out.println("enter number 3");
		int three = input.nextInt();
		
		System.out.println("enter number 4");
		int four = input.nextInt();
		
		System.out.println(Utilities.averageOf(one, two, three, four));
		
		
		System.out.println("enter number 1");
		int five = input.nextInt();
		
		System.out.println("enter number 2");
		int six = input.nextInt();
		
		System.out.println("enter number 3");
		int seven = input.nextInt();
		
		System.out.println(Utilities.maximumOf(five, six, seven));
		
		System.out.println("enter number 1");
		int eight = input.nextInt();
		
		System.out.println("enter number 2");
		int nine = input.nextInt();
		
		System.out.println("enter number 3");
		int ten = input.nextInt();
		
		System.out.println("enter number 4");
		int eleven= input.nextInt();
		
		System.out.println(Utilities.isArithmeticSeq(eight, nine, ten, eleven));
		
		
		 
		
		input.close();
	}

}
