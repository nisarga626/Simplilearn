package com.java;
import java.util.Scanner;
public class Calculator {

  public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	
	double firstNumber = scanner.nextDouble();
	
	System.out.println("Enter any operator from (+,-,*,/):");
	
	char operator = scanner.next().charAt(0);
	
	System.out.println("Enter second number:");
	
	double secondNumber = scanner.nextDouble();
	
	scanner.close();
	
	double result = 0;
	
	boolean status = true;
	
	switch(operator) {
	
	case '+' : result = firstNumber+secondNumber;
	           break;
	
	case '-' : result = firstNumber-secondNumber;
	           break;
	           
	case '*' : result = firstNumber*secondNumber;
	           break;
	           
	case '/' : result = firstNumber/secondNumber;
	           break;
	default: System.out.println("Invalid operator given by the user, hence operation cannot be perfromed.");
	           status = false;
	
	}

	if(status) {
		System.out.println(firstNumber+""+operator+""+secondNumber+" = "+result);
	}
}
}
