package com.calculator;

public class Subtraction {
	int oper1,oper2;
	
	Subtraction(int oper1,int oper2){
		this.oper1=oper1;
		this.oper2=oper2;
	}
	
	void subtraction() {
		System.out.println("Subtraction of two number : "+oper1+"-"+oper2+"="+(oper1-oper2));
	}
}
