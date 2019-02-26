package cse360assign2;

/* Author: Brian Zahn 
 * Class ID: 594
 * Assignment 2
 * This class mimics the functions of a calculator, providing add, subtract, 
 * multiply, and divide methods, as well as for a method to get the total 
 * from the operations, and a method which displays the history of actions
 * performed.
 */
public class Calculator {
private int total;	// The total from the operations performed
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * The "getTotal" method returns the value of the total variable.
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * The "add" method adds the inputed value to the total variable. 
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/*
	 * The "subtract" method subtracts the inputed value from the total variable.
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/*
	 * The "multiply" method multiplies the inputed value by the total variable.
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/*
	 * The "divide" method divides the total variable by the inputed value.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
	}
	
	/*
	 * The "getHistory" method returns a string of each inputed operation
	 * that was performed before the method was called.
	 */
	public String getHistory () {
		return "";
	}
}
