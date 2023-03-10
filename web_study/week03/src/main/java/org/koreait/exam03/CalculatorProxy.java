package org.koreait.exam03;

public class CalculatorProxy implements Calculator {

	private Calculator calculator; // ImplCalculator, RecCalculator
	
	public CalculatorProxy(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int factorial(int num) {
		long startTime = System.nanoTime(); // 공통기능
		
		int result = calculator.factorial(num); // 핵심기능
		
		long endTime = System.nanoTime(); // 공통기능
		
		System.out.printf("걸린 시간 : %d%n", endTime-startTime);
		
		return result;
	}
}
