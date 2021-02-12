package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		int n = 0;
		
		for(int i = 0;i<numbers.length;i++) {
			if((numbers[i]%3)==0) {
			n++;
			}
		}
			
	    result = new int[n];
		for(int j = (numbers.length-1);j>=0;j--) {
			if((numbers[j]%3)==0) {
				result[n-1]= numbers[j];
				n--;
			}
		}
		return result;
	}	
	
	
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		int a = 0;
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]!=n) {
			a++;
			}
		}
			
	    result = new int[a];
		for(int j = (numbers.length-1);j>=0;j--) {
			if(numbers[j]!=n) {
				result[a-1]= numbers[j];
				a--;
			}
		}
		
		return result;
	}
	
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		result = new String[numbers.length];
		String num ="[";
	
		for (int i = 0; i< numbers.length;i++) {
				num+=numbers[i];	
				result[i]=num+"]";
				if(i<numbers.length-1) {
				num+=", ";
				}
		}
		return result;
	}
	
	
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		int n = numbers.length;
		
	    result = new int[n];
		for(int j = (numbers.length-1);j>=0;j--) {
			if((numbers[j]%3)==2) {
				result[n-1]= numbers[j];
				n--;
			}
		}
			for(int k = (numbers.length-1);k>=0;k--) {
			if((numbers[k]%3)==1) {
				result[n-1]= numbers[k];
				n--;
			}
			}
			for(int l = (numbers.length-1);l>=0;l--) {
			if((numbers[l]%3)==0) {
				result[n-1]= numbers[l];
				n--;
			}
		}
		
		return result;
	}
}
