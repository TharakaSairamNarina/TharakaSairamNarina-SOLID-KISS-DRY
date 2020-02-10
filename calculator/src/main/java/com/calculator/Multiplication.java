package com.calculator;

public class Multiplication {
	int oper1,oper2;
	
	Multiplication(int oper1,int oper2){
		this.oper1=oper1;
		this.oper2=oper2;
	}
	
	void multiplication() {
		System.out.println("Multiplication of two number : "+oper1+"*"+oper2+"="+(oper1*oper2));
	}
}
