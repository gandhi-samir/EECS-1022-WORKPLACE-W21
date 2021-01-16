package model;

public class Utilities {
	
	public static String getGeometricSequence(int ft, int ratio) {
		String result = "";
		int [] geometricValues = new int [5];
		geometricValues[0]=ft;
		double sumValues = geometricValues[0];
		double averageValues;
		
		for (int i =1;i<5;i++) {
			geometricValues[i]= geometricValues[i-1]*ratio;
			sumValues = sumValues+geometricValues[i];	
		}
		
		averageValues = sumValues/5;
		result = "["+geometricValues[0]+"]"+"["+geometricValues[1]+"]"+"["+geometricValues[2]+"]"+"["+geometricValues[3]+"]"+"["+geometricValues[4]+"]"+ " has average "+averageValues;
	
		return result;
	}
	
	public static double getBMI(double weight, double height) {
		double result = 0.0;
		
		double weightInKilo = weight*0.4536;
		double heightInMeter = height*0.0254;
		double bmi = weightInKilo/(heightInMeter*heightInMeter);
		
		result = bmi;
		
		return result;
	}
	
	public static String getTimeConversion(int seconds) {
		String result = "";
		/*
		 * 1 day = 86400 seconds
		 * 1 hour = 3600 seconds
		 * 1 minute = 60 seconds
		 */
		
		long numberOfDays = seconds / 86400;
		long numberOfHours = (seconds % 86400 ) / 3600 ;
		long numberOfMinutes = ((seconds % 86400 ) % 3600 ) / 60;
		long numberOfSeconds = ((seconds % 86400 ) % 3600 ) % 60;
		
		result = ""+numberOfDays+" days "+numberOfHours+" hours "+numberOfMinutes+" minutes "+numberOfSeconds+" seconds";
		
		
		return result;
	}
}
