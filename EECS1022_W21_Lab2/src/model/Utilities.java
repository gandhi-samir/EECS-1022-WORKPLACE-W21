package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";

		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		

		/* Your implementation ends here. */

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
