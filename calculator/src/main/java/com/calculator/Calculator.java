package com.calculator;
import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
	
	Calculator(){
		System.out.println("Enter operator followed by two operands");
		String operator=sc.next();
		int operand1=sc.nextInt();
		int operand2=sc.nextInt();
		
		switch(operator){
			case "+": 
				Addition A=new Addition(operand1,operand2);
				A.addition();
				break;
			case "-": 
				Subtraction S=new Subtraction(operand1,operand2);
				S.subtraction();
				break;
			case "*":
				Multiplication M=new Multiplication(operand1,operand2);
				M.multiplication();
				break;
			case "/":
				Division D=new Division(operand1,operand2);
				D.division();
				break;
			case "%":
				Remainder R=new Remainder(operand1,operand2);
				R.remainder();
				break;
			default: 
				System.out.println("Invalid Operator");
		}
	}
}
