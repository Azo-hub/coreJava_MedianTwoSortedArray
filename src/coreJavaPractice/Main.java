package coreJavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */
public class Main {
	
	public static void main(String [] args) {
		/* The median of two sorted arrays */
		
		int[] arrayA = {4, 5, 1, 2, 6, 3, 7, 9};
		
		int[] arrayB = {16, 17, 10, 12, 15, 13, 14, 18};
		
		
		System.out.print(findMedianSortedArrays(arrayA, arrayB));
		
	}
	
	public static double findMedianSortedArrays(int [] A, int [] B) {
		
		return findKth(A, B);
		 
	}
	
	
	public static double findKth(int [] A, int [] B) {
	
		int [] newArray = new int [A.length + B.length];
		
		// Merge two array into one array
        System.arraycopy(A, 0, newArray, 0, A.length);
        System.arraycopy(B, 0, newArray, A.length, B.length);
		
		Arrays.sort(newArray);
		
		if((newArray.length) % 2 != 0) {
			
			return newArray[Math.round(newArray.length / 2)];
		} else {
			return (newArray[newArray.length / 2] + newArray[((newArray.length / 2) - 1)]) * 0.5;
		}
        
		
	}
	
	
}



