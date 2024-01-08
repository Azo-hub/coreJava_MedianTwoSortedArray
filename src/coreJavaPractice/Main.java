package coreJavaPractice;

import java.util.Stack;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */
public class Main {
	
	public static void main(String [] args) {
		/* Reverse Polish Notation
		 * ["2", "1", "+", "3", "*"] => ((2 + 1) * 3) => 9 
		 * ["4", "13", "5", "/", "+"] => (4 + (13 / 5)) => 6
		 */
		
		String[] tokens = {"4", "13", "5", "/", "+"};
		System.out.println(evalRPN(tokens));
		
	}
	
	public static int evalRPN(String[] tokens) {
		
		int returnValue = 0;
		String operators = "+-*/";
		
		Stack<String> stack = new Stack<>();
		
		for(String t : tokens) {
			
			if(!operators.contains(t)) {
				stack.push(t);
			} else {
				
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				
				/* System.out.print("a: " + a + "and b: " + b); */
				
				switch(t) {
				
				case "+":
					stack.push(String.valueOf(b + a));
					break;
					
				case "-":
					stack.push(String.valueOf(b - a));
					break;
					
				case "*":
					stack.push(String.valueOf(b * a));
					break;
					
				case "/":
					stack.push(String.valueOf(b / a));
					break;
					
				}
			}
		}
		
		returnValue = Integer.valueOf(stack.pop());
		
		return returnValue;
	}
	
	
}



