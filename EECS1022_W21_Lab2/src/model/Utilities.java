package model;

public class Utilities {
	
	public static String getTaxReport(int status, int income) {
		String result = null;
		double taxableAmount;
		int singleMaxValue1 = 8350;
		int singleMaxValue2= 33950;
		int singleDifference = singleMaxValue2 - singleMaxValue1;
		int marriedMaxValue1=16700;
		int marriedMaxValue2=67900;
		int marriedDifference = marriedMaxValue2 - marriedMaxValue1;
		double tax1;
		double tax2;
		double tax3;
		
		
// 1 single
		if ( status == 1) {
			
			if (income < singleMaxValue1) {
				taxableAmount = income*.10;
				String formattedNumber = ""+String.format("%.2f", taxableAmount);
				result ="Single Filing: $" +formattedNumber+" (Part I: $"+formattedNumber+")" ;
			}
			
			else if (income < singleMaxValue2) {
				tax1 = singleMaxValue1 * .10;
				tax2 = (income - singleMaxValue1)*.15;
				taxableAmount = tax1+tax2;
				String formattedNumberTotal = ""+String.format("%.2f", taxableAmount);
				String formattedNumber1 = ""+String.format("%.2f", tax1);
				String formattedNumber2 = ""+String.format("%.2f", tax2);
				result = "Single Filing: $" +formattedNumberTotal+" (Part I: $"+formattedNumber1+", Part II: $"+formattedNumber2+")" ;
			}
			
			else if (income > singleMaxValue2) {
				tax1 = singleMaxValue1 * .10;
				tax2 = singleDifference*.15;
				tax3 = (income - singleMaxValue2)*.25;
				taxableAmount = tax1+tax2+tax3;
				String formattedNumberTotal = ""+String.format("%.2f", taxableAmount);
				String formattedNumber1 = ""+String.format("%.2f", tax1);
				String formattedNumber2 = ""+String.format("%.2f", tax2);
				String formattedNumber3 = ""+String.format("%.2f", tax3);
				result = "Single Filing: $" +formattedNumberTotal+" (Part I: $"+formattedNumber1+", Part II: $"+formattedNumber2+", Part III: $"+formattedNumber3+")" ;
			}
		}
		
// 2 married
		else if (status == 2) {
			
			if (income < marriedMaxValue1) {
				taxableAmount = income*.10;
				String formattedNumber = ""+String.format("%.2f", taxableAmount);
				result ="Married Filing: $" +formattedNumber+" (Part I: $"+formattedNumber+")" ;
			}
			
			else if (income < marriedMaxValue2) {
				tax1 = marriedMaxValue1 * .10;
				tax2 = (income - marriedMaxValue1)*.15;
				taxableAmount = tax1+tax2;
				String formattedNumberTotal = ""+String.format("%.2f", taxableAmount);
				String formattedNumber1 = ""+String.format("%.2f", tax1);
				String formattedNumber2 = ""+String.format("%.2f", tax2);
				result = "Married Filing: $" +formattedNumberTotal+" (Part I: $"+formattedNumber1+", Part II: $"+formattedNumber2+")" ;
			}
			
			else if (income > marriedMaxValue2) {
				tax1 = marriedMaxValue1 * .10;
				tax2 = marriedDifference*.15;
				tax3 = (income - marriedMaxValue2)*.25;
				taxableAmount = tax1+tax2+tax3;
				String formattedNumberTotal = ""+String.format("%.2f", taxableAmount);
				String formattedNumber1 = ""+String.format("%.2f", tax1);
				String formattedNumber2 = ""+String.format("%.2f", tax2);
				String formattedNumber3 = ""+String.format("%.2f", tax3);
				result = "Married Filing: $" +formattedNumberTotal+" (Part I: $"+formattedNumber1+", Part II: $"+formattedNumber2+", Part III: $"+formattedNumber3+")" ;
			}
		}
			
		else if (status != 1 || status !=2) {
			result = "Illegal Status: "+status;
		}
			

		return result;
	}
	
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		int p1Score=0;
		int p2Score=0;
		String playerWin;
		String roundWin  =null;
		String round2Win = null;
		String output1 = null;
		String output2 = null;
		
//round 1
		
		if (p1r1 == 'R' && p2r1 == 'S'){
			roundWin = p1+" wins";
			p1Score = p1Score+1;
			output1 = "("+p1r1+" vs. "+p2r1+") ;";
		}
		
		else if (p1r1 == 'R' && p2r1 == 'P'){
			roundWin = p2+" wins";
			p2Score = p2Score+1;
			output1 = "("+p2r1+" vs. "+p1r1+") ;";
		}
		
		else if (p1r1 == 'R' && p2r1 == 'R'){
			roundWin = "Tie";	
			output1 = "("+p1r1+" vs. "+p2r1+") ;";
		}
		
		else if (p1r1 == 'P' && p2r1 == 'R'){
			roundWin = p1+" wins";
			p1Score = p1Score+1;
			output1 = "("+p1r1+" vs. "+p2r1+") ;";
		}
		
		else if (p1r1 == 'P' && p2r1 == 'P'){
			roundWin = "Tie";
			output1 = "("+p1r1+" vs. "+p2r1+") ;";
		}
		
		else if (p1r1 == 'P' && p2r1 == 'S'){
			roundWin = p2+" wins";
			p2Score = p2Score+1;
			output1 = "("+p2r1+" vs. "+p1r1+") ;";
			
		}
		
		else if (p1r1 == 'S' && p2r1 == 'R'){
			roundWin = p2+" wins";
			p2Score = p2Score+1;
			output1 = "("+p2r1+" vs. "+p1r1+") ;";
			
		}
		
		else if (p1r1 == 'S' && p2r1 == 'P'){
			roundWin = p1+" wins";
			p1Score = p1Score+1;
			output1 = "("+p1r1+" vs. "+p2r1+") ;";
			
		}
		
		else if (p1r1 == 'S' && p2r1 == 'S'){
			roundWin = "Tie";
			output1 = "("+p1r1+" vs. "+p2r1+") ;";
		}
		
		
		
//round 2
		if (p1r2 == 'R' && p2r2 == 'S'){
			round2Win = p1+" wins";
			p1Score = p1Score+1;
			output2 = " Round 2: "+round2Win+" ("+p1r2+" vs. "+p2r2+")]";
			
		}
		
		else if (p1r2 == 'R' && p2r2 == 'P'){
			round2Win = p2+" wins";
			p2Score = p2Score+1;
			output2 = " Round 2: "+round2Win+" ("+p2r2+" vs. "+p1r2+")]";
					
		}
		
		else if (p1r2 == 'R' && p2r2 == 'R'){
			round2Win = "Tie";
			output2 = " Round 2: "+round2Win+" ("+p1r2+" vs. "+p2r2+")]";
			
		}
		
		else if (p1r2 == 'P' && p2r2 == 'R'){
			round2Win = p1+" wins";
			p1Score = p1Score+1;
			output2 = " Round 2: "+round2Win+" ("+p1r2+" vs. "+p2r2+")]";
		}
		
		else if (p1r2 == 'P' && p2r2 == 'P'){
			round2Win = "Tie";
			output2 = " Round 2: "+round2Win+" ("+p1r2+" vs. "+p2r2+")]";
		}
		
		else if (p1r2 == 'P' && p2r2 == 'S'){
			round2Win = p2+" wins";
			p2Score = p2Score+1;
			output2 = " Round 2: "+round2Win+" ("+p2r2+" vs. "+p1r2+")]";
		}
		
		else if (p1r2 == 'S' && p2r2 == 'R'){
			round2Win = p2+" wins";
			p2Score = p2Score+1;
			output2 = " Round 2: "+round2Win+" ("+p2r2+" vs. "+p1r2+")]";
		}
		
		else if (p1r2 == 'S' && p2r2 == 'P'){
			round2Win = p1+" wins";
			p1Score = p1Score+1;
			output2 = " Round 2: "+round2Win+" ("+p1r2+" vs. "+p2r2+")]";
		}
		
		else if (p1r2 == 'S' && p2r2 == 'S'){
			round2Win = "Tie";	
			output2 = " Round 2: "+round2Win+" ("+p1r2+" vs. "+p2r2+")]";	
		}
		
		if (p1Score>p2Score) {
			playerWin = p1+" wins";
		}
		else if (p1Score<p2Score) {
			playerWin = p2+" wins";
		}
		
		else {
			playerWin = "Tie";
		}
	result ="Game over: "+playerWin+"! [Round 1: "+roundWin+" "+output1+""+output2;
		

		return result;
	}
}
