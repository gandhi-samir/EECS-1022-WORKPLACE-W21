package model;

/*
 * This class contains three separate sets of test questions.
 * You can check tutorials on solutions to these methods here:
 * https://www.youtube.com/playlist?list=PL5dxAmCmjv_4UZNiLzeFPAgDDv2vLCGb4
 * (The IDE used there is not Eclipse, but the lines of code will work.)
 */

public class Utilities
{
	
	/*
	 * Example Test 2a
	 */
	
	/* Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Requirement: 
	 * 	- It is forbidden for you to use any Java library class or method.
	 * 	(that is, there must not be an import statement in the beginning of this class.)
	 * 	- Each task violating this requirement will result in an immediate zero for it. 
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests 
	 * 	  (therefore it is important that you test your own methods
	 *     by either the console application class App or your own JUnit tests) 
	 */

	/*
	 * Given an array of integers, calculate the average of its elements.
	 * You can assume that the array is not empty and contains at least 1 one element.
	 */
	public static double averageOf(int[] ia) {
		double result = -1;
		double sum=0;
	

		for (int i = 0; i < ia.length;i++) {
			sum+=ia[i];
		}
		
		result = sum/ia.length;
		

		return result;
	}

	/*
	 * Given an integer array ia, determine whether or not
	 * all elements are multiples of 5.
	 */
	public static boolean allMultiplesOf5(int[] ia) {
		boolean result = false;
		if(ia.length==0) {
			result = true;
		}
		else {
		for(int i = 0; i < ia.length;i++) {
			if(ia[i]%5==0) {
				result=true;
			}
			else if(ia[i]%5!=0) {
				result = false;
				break;
			}
			
			
		}
		}
		
		return result;
	}

	/* Given an integer array ia, determine whether or not
	 * at lease one element is multiple of 5.
	 */
	public static boolean atLeastOneMultipleOf5(int[] ia) {
		boolean result = false;
		for (int i = 0; i < ia.length;i++) {

		if(ia[i]%5==0) {
			result = true;
			break;
			
		}
		if(ia[i]%5!=0) {
			result = false;
		}
		}
		

		// Do not modify this return statement. 
		return result;
	}

	/* Given an array of integers, find out the second maximum element.
	 * The input array may contain duplicates.
	 * You can assume that integer array ia contains at least two elements.
	 * Your are forbidden to use any library class, e.g., Arrays.sort.
	 */
	public static int secondMaximumOf(int[] ia) {
		int result = -1;

		double max = -1;
				
				int temp;  
				for (int i = 0; i < ia.length; i++)   
		        {  
		            for (int j = i + 1; j < ia.length; j++)   
		            {  
		                if (ia[i] > ia[j])   
		                {  
		                    temp = ia[i];  
		                    ia[i] = ia[j];  
		                    ia[j] = temp;  
		                }  
		            }  
		        }  
		       return ia[ia.length-2];  
		}  
				
		
	
	/*
	 * Example Test 2b
	 */

	/* Given an array of integers, return its reverse.
	 * Your are forbidden to use any library class, e.g., Arrays.sort.
	 */
	public static int[] reverseOf(int[] ia) {
		
		
		int[] result = null;
		result = new int[ia.length];
		
	
		for(int i=0;i<ia.length;i++) {
	       result[i]=ia[ia.length-i-1];
		}
		return result;
	}

	/* Given two arrays of integers, determine whether or not
	 * one is exactly the reverse of the other.
	 * Your are forbidden to use any library class, e.g., Arrays.sort.
	 */
	public static boolean isReverseOfEachOther(int[] ia1, int[] ia2) {
		boolean result = false;
		int[]hello=null;
		
		if(ia1.length==0&& ia2.length==0) {
			result = true;
		}
		
		else if(ia1.length!=ia2.length) {
			result = false;
		}
		
		else {

		hello = new int[ia1.length];
		
		
		for(int i=0;i<ia1.length;i++) {
	       hello[i]=ia1[ia1.length-i-1];
		}
		
		if(ia1.length==ia2.length) {
		
		for(int j = 0; j <ia2.length;j++) {
			if(hello[j]==ia2[j]) {
				result = true;
			}
			
			if(hello[j]!=ia2[j]) {
				result = false;
				break;
			}
		}
		}
		else { result = false;
		
		}
		}
		
		return result;
	}

	/* Return the first n elements in an arithmetic sequence whose
	 * start term is start and common difference is diff.
	 */
	public static int[] getArithSeq(int start, int diff, int n) {
		int[] result = null;
		int hello=start;
		result = new int[n];

		for(int i =1;i<n;i++) {
			result[0]=start;
			hello+=diff;
			result[i]=hello;
			
		}
		return result;
	}
	
	/* Given an integer array, determine if it's an arithmetic sequence,
	 * i.e., there's a common different between every two consecutive elements.
	 */
	public static boolean isArithSeq(int[] ia) {
		boolean result = false;
		
		if(ia.length>0) {
		int temp = ia[ia.length-1]-ia[ia.length-2];

		for(int i =ia.length-1; i>0;i--){
			if((ia[i])-(ia[i-1])== temp) {
				result = true;
			}
			else {
				result = false;
			}
		
			
		}
		}
		return result;
	}
	
	/*
	 * Example Test 2c
	 */

	/* Return the first i items in a Fibonacci sequence. 
	 * A Fibonacci sequence is:
	 * 1, 1, 2, 3, 5, 8, 13, 21, ...
	 * where the 1st and 2nd elements are always 1, and
	 * starting from the third element, the value of an element
	 * is the sum of its previous two neighbouring elements.
	 * For example, 2 == 1 + 1, 3 == 2 + 1, 5 == 3 + 2, 8 == 5 + 3, and etc.
	 * You can assume that the input i >= 0.
	 */
	public static int[] getFibSeq(int i) {
		int[] result = null;
		result = new int[i];
		
		if (result.length>2) {
			result[0]=1;
			result[1]=1;
			
			for(int j = 2;j<i;j++) {
				result[j]=result[j-1]+result[j-2];
				
			}
			
		}
		
		if(i==1) {
			result[0]=1;
		}
		
		if(i ==2) {
			result[0]=1;
			result[1]=1;
		}

		
		return result;
	}

	/* Determine whether or not an integer array ia contains
	 * the first ia.length elements in a Fibonacci sequence.
	 * Remember that ia.length >= 0
	 */
	public static boolean isFibSeq(int[] ia) {
		boolean result = false;
		
		if(ia.length >2) {
			
				for(int i = 2; i < ia.length;i++) {
					if((ia[i]==ia[i-1]+ia[i-2])&&ia[0]==1 &ia[1]==1) {
						result = true;
					}
					if((ia[i]!=ia[i-1]+ia[i-2])||ia[0]!=1||ia[1]!=1) {
						result = false;
						break;
				}
			}
		}
		
		if(ia.length==2) {
			if(ia[0]==1&&ia[1]==1) {
				result = true;
			}
		}
		
		if(ia.length==1) {
			if(ia[0]==1) {
				result = true;
			}
		}
		
		
		
		
		return result;
	}

	/*
	 * Count the number of occurrences of string s in string array sa.
	 */
	public static int numberOfOccurrences(String[] sa, String s) {
		int result = -1;
		for(int i = 0; i <sa.length;i++) {
			if(sa[i]==s) {
				result++;
			}
			
		}
		result+=1;
		return result;
	}

	/* Return an array storing the indices of string s in string array sa.
	 * If s does not occur in sa, then the returned array should be EMPTY.
	 * Length of the returned array should correspond to the number of times
	 * string s occurs in string array sa.
	 */
	public static int[] getIndices(String[] sa, String s) {
		int[] result = null;
		int counter= 0 ;
		int k =0;
		for(int i = 0; i <sa.length;i++) {
			if(sa[i]==s) {
				counter++;
			}
			}
		result= new int[counter];
		
		
		
		for (int j = 0; j < sa.length;j++) {
			if(sa[j].equals(s)) {
				result[k]=j;
				k++;
				
			}
			}
			
		
		return result;
	
}
	}

