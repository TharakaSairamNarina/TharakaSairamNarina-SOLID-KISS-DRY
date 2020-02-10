package com.calculator;

public class Division {
	int oper1,oper2;
	
	Division(int oper1,int oper2){
		this.oper1=oper1;
		this.oper2=oper2;
	}
	
	void division() {
		System.out.println("Division of two numbers :"+oper1+"/"+oper2+"="+(oper1/oper2));
	}
}
