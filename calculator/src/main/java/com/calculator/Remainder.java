package com.calculator;

public class Remainder {
	int oper1,oper2;
	
	Remainder(int oper1,int oper2){
		this.oper1=oper1;
		this.oper2=oper2;
	}
	
	void remainder() {
		System.out.println("Remainder of two numbers : "+oper1+"%"+oper2+"="+(oper1%oper2));
	}
}
