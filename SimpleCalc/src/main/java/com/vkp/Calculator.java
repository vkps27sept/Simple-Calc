package com.vkp;



public class Calculator {
	public int a,b;
	
	public void  add(int a,int b)
	{
		int result = a + b;
		System.out.println("The addition is "+result);
	}
	
	public void  substract(int a,int b)
	{
		int result = a - b;
		System.out.println("The substraction is "+result);
	}
	public void  multiplication(int a,int b)
	{
		int result = a * b;
		System.out.println("The multiplication is"+result);
	}
	public void  division(int a,int b)
	{
		int result = a / b;
		System.out.println("The division is "+result);
	}
	

}
