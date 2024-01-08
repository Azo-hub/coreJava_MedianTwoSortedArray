package coreJavaPractice;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */
public class Main {
	
	public static void main(String [] args) {
		/* Rotating an array to the right or left by some steps */
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8}; 
		int step = 3;
		
		rotateRight(array, step);
		
	}
	
	public static void rotateRight(int [] array, int step) {
		
		if(step > array.length) {
			
			step = step % array.length;
		}
		
		int [] result = new int[array.length];
		
		for(int i = 0; i < step; i++) {
			
			result[i] = array[array.length - step + i];
			
		}
		
		int j = 0;
		  
		for(int i = step; i < array.length; i++) {
		  
		result[i] = array[j]; 
		
		j++;
		
		}
		 
		
		System.out.print(Arrays.toString(result));
		
	}
	
	
}



