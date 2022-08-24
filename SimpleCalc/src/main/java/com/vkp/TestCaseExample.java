package com.vkp;

import org.junit.Test;

public class TestCaseExample {

	Calculator calc = new Calculator();
	@Test
	public void testPositive()
	{
		calc.add(10, 5);
		calc.substract(10, 5);
		calc.multiplication(10, 5);
		calc.division(10, 5);
	}
	@Test
	public void testNegative()
	{
		calc.add(10, -5);
		calc.substract(10, -5);
		calc.multiplication(10, -5);
		calc.division(10, -5);
	}
}
