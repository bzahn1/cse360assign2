package cse360assign2;

/* Author: Brian Zahn 
 * Class ID: 594
 * Assignment 2
 * This class mimics the functions of a calculator, providing add, subtract, 
 * multiply, and divide methods, as well as for a method to get the total 
 * from the operations, and a method which displays the history of actions
 * performed.
 */

public class Calculator 
{
	private int total;	// The calculator output from the operations performed
	private String operationHistory;	//string created to track history of operations performed
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		operationHistory = Integer.toString(total);	// operationHistory set to initial value of the total
	}
	
	
	/*
	 * The "getTotal" method returns the value of the total variable.
	 * 
	 *  @return		Returns the output from the operations performed to the test class.
	 *  
	 */
	public int getTotal () 
	{
		return total;
	}
	
	
	/*
	 * The "add" method adds the inputed value to the total variable. 
	 * Additionally, the "history" variable is updated to represent the change
	 * in operations performed.
	 * 
	 * @param	calculatorInput	 The value inputed from the test class to be 
	 * 							 added to the variable "total".
	 * 
	 */
	public void add (int calculatorInput) 
	{
		total = total + calculatorInput;
		operationHistory = operationHistory + " + " + calculatorInput;
	}
	
	
	/*
	 * The "subtract" method subtracts the inputed value from the total variable.
	 * Additionally, the "history" variable is updated to represent the change
	 * in operations performed.
	 * 
	 * @param	calculatorInput	 The value inputed from the test class to be 
	 * 							 subtracted from the variable "total".
	 * 
	 */
	public void subtract (int calculatorInput) 
	{
		total = total - calculatorInput;
		operationHistory = operationHistory + " - " + calculatorInput;
	}
	
	
	/*
	 * The "multiply" method multiplies the inputed value by the total variable.
	 * Additionally, the "history" variable is updated to represent the change
	 * in operations performed.
	 * 
	 * @param	calculatorInput	 The value inputed from the test class to be 
	 * 							 multiplied by the variable "total".
	 * 
	 */
	public void multiply (int calculatorInput) 
	{
		total = total * calculatorInput;
		operationHistory = operationHistory + " * " + calculatorInput;
	}
	
	
	/*
	 * The "divide" method divides the total variable by the inputed value.
	 * Additionally, the "history" variable is updated to represent the change
	 * in operations performed.
	 * 
	 * @param	calculatorInput	 The value inputed from the test class to  
	 * 							 divide the variable "total" by.
	 * 
	 */
	public void divide (int calculatorInput) 
	{
		if (calculatorInput == 0) 
		{
			total = 0;
		}
		else 
		{
			total = total / calculatorInput;
			operationHistory = operationHistory + " / " + calculatorInput;
		}
	}
	
	/*
	 * The "getHistory" method returns a string of each inputed operation
	 * that was performed before the method was called.
	 * 
	 *  @return		Returns the history of the operations performed to the test class.
	 *  
	 */
	public String getHistory () 
	{
		return operationHistory;
	}
}
