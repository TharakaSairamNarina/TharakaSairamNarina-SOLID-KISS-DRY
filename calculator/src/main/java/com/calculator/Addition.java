package com.calculator;

public class Addition {
	int oper1,oper2;
	
	Addition(int oper1,int oper2){
		this.oper1=oper1;
		this.oper2=oper2;
	}
	
	void addition() {
		System.out.println("Addition of two number : "+oper1+"+"+oper2+"="+(oper1+oper2));
	}
}
