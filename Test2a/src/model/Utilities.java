package model;

public class Utilities {
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library class (e.g., ArrayList, Arrays)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 	- You can define helper methods if you wish.
	 * 
	 * Only write lines of code within the methods given to you. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests  
	 */
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  -  Return another array of strings, each of which denoting a non-empty suffix of the input array.
	 *     
	 *     A suffix of array `seq` contains its last n elements (where 1 <= n <= seq.length). 
	 *     
	 *  	For example, if the input array is:
	 *   
	 *  		<3, 1, 4>
	 *  
	 *  	Then the output or returned array of string values is:
	 *  		
	 *  		<"[3, 1, 4]", "[1, 4]", "[4]">
	 *  	
	 *  	where each suffix is structured as a comma-separated list surrounded by square brackets.	
	 *  
	 *  	Note that the length of the output array is equal to the length of the input array. 
	 *  	
	 *  	Also, elements in the output array are ``sorted'' by the lengths of the suffixes. 
	 *  		(e.g,. the last element is the suffix of length 1, the second last element is the suffix of length 2).
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String[] task1(int[] seq) {
		String[] result = null;
		

		result = new String[seq.length];
		String open="[";
		String num ="";
	
		for (int i = seq.length-1; i>=0;i--) {
			if(i<seq.length-1) {
				num=", "+num;
			}
				num=seq[i]+num;
			
				result[i]=open+num+"]";
				
		}
		// Do not modify this return statement. 
        return result;
    }

	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers
	 *	- `n`: a non-negative integer 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty.
	 * 	- Input integer `n` is non-negative (>= 0).
	 *  
	 * What to return?
	 *  - Given an array `seq` of integers and an integer `n`, 
	 *  	return a new array whose elements correspond to those of `seq` by 
	 *  	shifting every element in `seq` to the right by `n` positions. 
	 *  - The shifts are ***circular***: 
	 *  	any elements that would "go off the boundary" are 
	 *  	wrapped around back from the beginning of the array.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task2(int[] seq, int n) {
    	int[] result = null;
    	
  
		
    	result = new int[seq.length];
    	
    	
    	
    	
    	
    	
    	 for(int i = 0; i < n; i++){    
              
             int last;      
             last = seq[seq.length-1];    
             
             for(int j = seq.length-1; j > 0; j--){    
                 seq[j] = seq[j-1];    
             }    
            
             seq[0] = last;    
         }   
    	 
    	 for(int k = 0; k < seq.length;k++) {
    		 result[k]=seq[k];
    	 }
    	 return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: an array of integers
	 *	- `indices`: an array of integers (each of which may or may not be a valid index for `seq`) 
	 *
	 * Assumptions:
	 * 	- `seq` may be empty.
	 * 	- `indices` may be empty. 
	 * 	- `indices` may contain duplicates.
	 *  
	 * What to return?
	 *  - For each integer value in `indices`, if it is a valid index for input array `seq`, 
	 *  	then use it to index into `seq` and include the result in the output array.
	 *  
	 *  For example: Say `seq` is {23, 46, 69} and `indices` is {2, -1, 0, 3, 0, 2}
	 *  	(where indices -1 and 3 are invalid, so only indices 2, 0, 0, 2 are used)
	 *   	Then the method should return {69, 23, 23, 69} 
	 *   
	 *  Note: Order of elements in the output array corresponds to the order in which
	 *  		valid indices in the `indices` array are arranged. 
	 *  
	 *  That is, the output array may be empty if the input array `seq` is empty,
	 *  	or if the input array `indices` does not contain any valid indices.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task3(int[] seq, int[] indices) {
		int[] result = null;
		int counter=0;
		int[] temp = null;
		int a =0;
		int b =0;
		
		
		
				
				
		
		for(int i = 0; i < indices.length;i++) {
			if(indices[i]<=seq.length-1&&indices[i]>=0) {
				counter++;
				
			}
		}
		
		temp = new int [counter];
		
		for(int j = 0; j < indices.length-1;j++) {
			if(indices[j]<=seq.length-1&&indices[j]>=0) {
				
				temp[a]=seq[indices[j]];
				a++;
				
			}
		}
		
		result = new int[counter];
		
		for(int k = 0; k < temp.length;k++) {
			temp[k]=b;
			result[k]=seq[b];
			
		}
		
		
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  - Return an array that represents an encoding of `seq`, by adopting the following principle:
	 *  	Element at each even index (e.g., at index 0, at index 2, and so on) of the return array specifies 
	 *  		how many times the element at the next odd index (e.g., at index 1, at index 3, and so on) repeats 
	 *  		in the input array `seq`.
	 *  	
	 *  	For example, {4, 2, 3, 1} encodes that value 2 (at odd index 1) should repeat 4 times (as specified at even index 0), 
	 *  		and similarly, value 1 should repeat 3 times. 
	 *  		
	 *  		Say `seq` is {2, 2, 2, 2, 1, 1, 1}.
	 *  		Then the method should return an encoded array {4, 2, 3, 1}.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task4(int[] seq) {
        int[] result = null; 
        
        int [] fr = new int [seq.length];  
       

	
		
	
				
			
			
		
        
        
        
        
        
        return result;
    }	
}

