package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Utilities {
	
	public static String getNumbers(int lower, int upper) {
		String result = "";
		int counter =0;
		
		if (lower < 0 || upper < 0) {
			result ="Error: both bounds must be non-negative";
		}
		
		else  if(lower>upper) {
			result = "Error: lower bound "+lower+" is not less than or equal to upper bound "+upper;
		}
		
		else {
		
			for (int i = lower; i < upper;i++) {
				if(i%3==0) {
				result = result+"("+i+"), ";
				}
				if(i%3==1) {
				result = result+"["+i+"], ";
				}
				if(i%3==2) {
				result = result+"{"+i+"}, ";
				}
				counter++;
			}
			
			if(upper%3==0) {
			result = result+"("+upper+")";
			counter++;
			}
			if(upper%3==1) {
			result = result+"["+upper+"]";
			counter++;
			}
			if(upper%3==2) {
			result = result+"{"+upper+"}";
			counter++;
			}
		
			if (counter>1) {
			result = counter+ " numbers between "+lower+" and "+upper+": <"+result+">";
			}
		
			if (counter==1) {
			result = counter+ " number between "+lower+" and "+upper+": <"+result+">";
			}
		}
		
		
		return result;
	}
	
	
	
	 
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		String termsSum = "";
		
		int sum=0;
		String terms= "";
		float average =0;
	
		
		for(int i =1; i <=n;i++) {
			
			
			
			if (i ==1) {
				terms = terms+""+(ft+((i-1)*d));
			}
			else {
				terms = terms+", "+(ft+((i-1)*d));
			}
				sum = sum + (ft+((i-1)*d));
				average = (float) sum/i;
				String formattedAverage = ""+String.format("%.2f", average);
				
			termsSum = termsSum+"[sum of <"+terms+">: "+sum+" ; "+"avg of <"+terms+">: "+formattedAverage+"]";
			
			if (i!=n) {
			termsSum = termsSum+", ";
			}	
		}
		
		termsSum = "{"+termsSum+"}";
	
		result = termsSum;
		
		return result;
	}
		

	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		String sequence1="";
		String sequence2="";
		String interleaving="";
		
		if(n1<n2) {
			for(int i =1;i<=n2;i++) {
				if (i ==1) {
					sequence2 = ", "+(ft2+((i-1)*d2));
				}
				else {
					sequence2 =", "+(ft2+((i-1)*d2));
					
				}
				for(int j =1; i <=n1;j++) {
					if (j ==1) {
						sequence1 = ""+(ft1+((j-1)*d1));
					}
					else {
						sequence1 =", "+(ft1+((j-1)*d1));
						
					}
			}
				interleaving = interleaving +"("+sequence1+")"+"["+sequence2+"]";
		}
			
	
	}
		else if (n1>n2) {
			for(int i =1;i<=n1;i++) {
				if (i ==1) {
					sequence1 = ""+(ft1+((i-1)*d1));
				}
				else {
					sequence1 =", "+(ft1+((i-1)*d1));
					
				}
				for(int j =1; i <=n2;j++) {
					if (j ==1) {
						sequence2 = ""+(ft2+((j-1)*d2));
					}
					else {
						sequence2 =", "+(ft2+((j-1)*d2));
						
					}
			}
				interleaving = interleaving +"("+sequence1+")"+"["+sequence2+"]";
		}
			
	
	}
		
		else {
		for(int i =1; i <=n1||i<=n2;i++) {
			
			
			
			if (i ==1) {
				sequence1 = ""+(ft1+((i-1)*d1));
				sequence2 = ", "+(ft2+((i-1)*d2));
			}
			else {
				sequence1 =", "+(ft1+((i-1)*d1));
				sequence2 =", "+(ft2+((i-1)*d2));
				
					}
			interleaving = interleaving +"("+sequence1+")"+"["+sequence2+"]";
			}
		
			}
		result = interleaving;
		
		return result;
		}	
	}
