package com.vkp;

public class Calculator {
	public int a,b;
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int substract(int a,int b)
	{
		if(a>b)
		return a-b;
		else 
			return b-a;
	}
	public static int multiplication(int a,int b)
	{
		return a*b;
	}
	public static int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		int a =10;
		int b=20;
		System.out.println("Addition is : ");
		Calculator.add(a, b);
		System.out.println("Substraction is : ");
		Calculator.substract(a, b);
		System.out.println("Multiplication is : ");
		Calculator.multiplication(a, b);
		System.out.println("Division is : ");
		Calculator.division(a, b);
		
	}

}
