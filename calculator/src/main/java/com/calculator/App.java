package com.calculator;
import java.util.Scanner;
public class App 
{
	public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of operations you want to perform");
		int operations=sc.nextInt();
		
		for(int itr=0;itr<operations;itr++) {
			new Calculator();
		}
		
		System.out.println("All Operations are executed and exited");
        
    }
}
