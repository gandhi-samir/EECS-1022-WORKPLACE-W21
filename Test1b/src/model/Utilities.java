package model;
public class Utilities
{
	
	

	/*	Task 1.
	 * 	
	 * 	Input Parameters:
	 *	- `weightUnit`	: either 'p' (for pound) or 'k' (for kilogram)
	 *	- `w`			: the weight value
	 *	- `heightUnit`	: either 'f' (for foot) or 'i' (for inch)
	 *	- `h`			: the height value
	 *
	 *	Error conditions (in order of priority):
	 *	1. When the `weightUnit` is neither 'p' nor 'k' (case sensitive).
	 *	2. When the `heightUnit` is neither 'f' nor 'i' (case sensitive).
	 *	3. When not both weight value and height value are positive.
	 *	If multiple error conditions hold, return a message related to the error with the highest priority.
	 *	e.g., invoking getBMIReport('q', -154.3, 'I', -66.92) has all inputs invalid,
	 *			but only an error message about weight unit is returned.
	 *
	 *  What to return?
	 *  - Return an error message if there is any error.
	 *  - Otherwise, calculate the Body Mass Index (BMI) by: weight (in kilogram) divided by the square of height (in meters).
	 *  	+ Use the following conversion rates (when needed):
	 *  		1 inch is 0.0254 meter 			(use it when `heightUnit` is 'i')
	 *  		1 foot is 0.3048 meter
	 *  		1 pound is 0.453592 kilogram
	 *  	+ The calculation result must be formatted with 2 digits after the decimal:
	 *  		Use String.format("%.2f", someNumber)
	 *  	+ Also, include an interpretation message (case sensitive) according to the following scheme:
	 *  		BMI < 18.5 			means "Underweight"
	 * 			18.5 <= BMI < 25.0 	means "Normal"
	 * 			25.0 <= BMI < 30.0 	means "Overweight"
	 * 			30.0 <= BMI 		means "Obese"
	 * 
	 * See the JUnit tests related to this method for the precise format of the string return value.
	 */
	public static String getBMIReport(char weightUnit, double w, char heightUnit, double h) {
		String result = "";
		double weightInKilo = 0;
		double heightInMetres=0;
		double BMI=0;
		String formattedBMI="";
		String weight="";
		
		
		
		
		
		
  if ((weightUnit == 'k'||weightUnit == 'p')&&(heightUnit == 'f'||heightUnit == 'f')&&(w>0&&h>0)) {
			if ( weightUnit == 'p') {
				weightInKilo = w*.453592;
			}
			else if(weightUnit == 'k') {
				weightInKilo = w;
			}
			if (heightUnit == 'f') {
				heightInMetres = h*.3048;
			}
			else if (heightUnit == 'i') {
				heightInMetres = h*.0254;
			}
			BMI = weightInKilo/(heightInMetres*heightInMetres);
			formattedBMI = ""+String.format("%.2f", BMI);
			
			if(BMI >=30) {
				weight ="Obese";
			}
			else if (BMI>=25 && BMI <30) {
				weight = "Overweight";
			}
			
			else if ( BMI>= 18.5 && BMI< 25) {
				weight = " Normal";
			}
				else if(BMI < 18.5) {
					weight = "Underweight";
			}
			
			result = "BMI is: "+formattedBMI+" ("+weight+")";
			
			
		}
  else {	
		
  


 if ( w <0||h<0) {
		result = "Error: both weight and height must be positive";
	}
 if ( (heightUnit !='f') || (heightUnit !='i')) {
		result = "Error: "+heightUnit+" is not a valid height unit";
	}
 if ((weightUnit !='p')||(weightUnit !='k')) {
		result = "Error: "+weightUnit+" is not a valid weight unit";
	}
  
  
  
  }
  
  
  

		return result;
	}
	
	
	/*
	 * Task 2.
	 * 
	 * Input Parameters: 
	 * - `coffeeType` 	: either 'L' (for light type), 'R' (for regular type) or 'D' (for dark type)
	 * - `cupSize`		: either 'S' (for small size), 'M' (for medium size) or 'L' (for large size)
	 * - `numberofCup`	: integer represent number of cups ordered
	 * 
	 * Assumptions:
	 * 	- the numberofCups is positive value greater than zero.
	 *	- `coffeeType` and `cupSize` characters are valid (no error checking is needed).
	 *
	 * What to return? - First you need to determine the preparation time  
	 * of single cup of coffee in term of minutes and seconds  according to the following facts
	 * If coffee type is light coffee then the initial preparation time of single cup of any size is 25 seconds.
	 * If coffee type is regular coffee then the initial preparation time of single cup of any size is 45 seconds.
	 * If coffee type is dark coffee then the initial preparation time of single cup of any size is 65 seconds.
	 * 
	 * Now, consider the size 
	 * if the cup size is small then add 15 seconds. 
	 * if the cup size is medium then add 35 seconds.
	 * if the cup size is large then add 45 seconds.
	 * 
	 * Do not forget to consider the number of cup to determine the final preparation time of coffee order
	 * 
	 * The output string should include  message with case sensitive. For example:
	 * 
	 * "You ordered 5 cups of type light and size small, then your time is 3 minutes 20 seconds" 
	 * "You ordered 1 cup of type light and size small, then your time is 0 minutes 40 seconds" 
	 * "You ordered 7 cups of type dark and size large, then your time is 12 minutes 50 seconds" 
	 * 
	 * Note: we use cup  when the order is for single cup and 
	 *  we use cups  when the order is for more than one cup
	 * 
	 *  
	 * See the JUnit tests related to this method for the precise format of the
	 * string return value.
	 */ 
	public static String getCoffeeTime(char coffeeType, char cupSize, int numberofCup) {
		String result = "";
		int time=0;
		int formatTimeMin=0;
		int formatTimeSeconds=0;
		
		
		if (coffeeType == 'L') {
			if (cupSize == 'S') {
				time = (25+15)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type light and size small, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type light and size small, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			if (cupSize == 'M') {
				time = (25+35)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type light and size medium, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type light and size medium, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			
			if (cupSize == 'L') {
				time =  (25+45)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type light and size large, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type light and size large, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			}
			
		
		
		if (coffeeType == 'R') {
			if (cupSize == 'S') {
				time = (45+15)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type regular and size small, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type regular and size small, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			if (cupSize == 'M') {
				time =  (45+35)*numberofCup;
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type regular and size medium, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type regular and size medium, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			if (cupSize == 'L') {
				time = (45+45)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type regular and size large, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type regular and size large, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			
		}
		
		if (coffeeType == 'D') {
			if (cupSize == 'S') {
				time = (65+15)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type dark and size small, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type dark and size small, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			if (cupSize == 'M') {
				time = (65+35)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type dark and size medium, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type dark and size medium, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			if (cupSize == 'L') {
				time = (65+45)*numberofCup;	
				formatTimeMin = time/60;
				formatTimeSeconds = time%60;
				if (numberofCup ==1) {
					result = "You ordered "+numberofCup+" cup of type dark and size large, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
				else {
					result = "You ordered "+numberofCup+" cups of type dark and size large, then your time is "+formatTimeMin+" minutes "+formatTimeSeconds+" seconds";
				}
			}
			
		}
		
		
		
		
		
		
		
		return result;
	}
	
	
	/*
	 * Task 3.
	 * 
	 * Input Parameters: 
	 * - `carSpeed` 	: integer value represents car speed in kilometer per hour at time of ticket
	 * - `roadSpeed`	: integer value represents the road speed limit in kilometer per hour regulated by the City
	 * - `whenItHappen`	: either 'M' (for Morning day time), 'A' (for Afternoon day time) or 'E' (for Evening day time)
	 * 
	 * Assumptions:
	 * 	- `carSpeed` is greater than `roadSpeed` always
	 *	- `whenItHappen` character is valid (no error checking is needed).
	 *
	 * What to return? - First you need to determine speed ticket value in dollars according to the following facts
	 * If difference between car speed and road speed limit is less than 20 kilometer/hour 
	 * then the initial ticket value is 80 dollars.
	 * 
	 * If difference between car speed and road speed limit is between 20 and 40 kilometer/hour inclusive 
	 * then the initial ticket value is 250 dollars.
	 * 
	 * If difference between car speed and road speed limit is more than 40 kilometer/hour 
	 * then the initial ticket value is 800 dollars.
	 * 
	 * Now, consider the when ticket happen. 
	 * if speeding ticket happened during morning day time then add 150 dollars to the initial speeding ticket value
	 * if speeding ticket happened during afternoon day time then add 100 dollars to the initial speeding ticket value
	 * if speeding ticket happened during evening day time then add 540 dollars to the initial speeding ticket value
	 * 
	 * The output string should include  message with case sensitive. For example:
	 * 
	 * "In the morning, your speed was 25 over the limit then your ticket value is 400$" 
	 * 
	 * "In the afternoon, your speed was 10 over the limit then your ticket value is 180$"
	 *  
	 * See the JUnit tests related to this method for the precise format of the
	 * string return value.
	 */

	public static String getTicketValue(int carSpeed, int roadSpeed, char whenItHappen) {
		String result = "";
		int ticketValue = 0;
		int difference = carSpeed-roadSpeed;

		
		if((difference)<20) {
			ticketValue = 80;
			if (whenItHappen=='M') {
				ticketValue+=150;
				result = "In the morning, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			if (whenItHappen=='A') {
				ticketValue+=100;
				result = "In the afternoon, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			if (whenItHappen=='E') {
				ticketValue+=540;
				result = "In the evening, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			
		}
		if((difference)>=20 &&(difference)<=40) {
			ticketValue = 250;
			if (whenItHappen=='M') {
				ticketValue+=150;
				result = "In the morning, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			if (whenItHappen=='A') {
				ticketValue+=100;
				result = "In the afternoon, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			if (whenItHappen=='E') {
				ticketValue+=540;
				result = "In the evening, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			
		}
		if((difference)>40 ) {
			ticketValue = 800;
			if (whenItHappen=='M') {
				ticketValue+=150;
				result = "In the morning, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			if (whenItHappen=='A') {
				ticketValue+=100;
				result = "In the afternoon, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			if (whenItHappen=='E') {
				ticketValue+=540;
				result = "In the evening, your speed was "+difference+" over the limit then your ticket value is "+ticketValue+"$";  
			}
			
		}
		
		
		
		
		

	
		return result;
	}

}

