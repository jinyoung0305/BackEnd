package org.koreait.exam04.cal;

public class RecCalculator implements Calculator {

	@Override
	public int factorial(int num) {
		
		int total = num;
		if(num==0) {
			return 1;
		}			
		return total*factorial(num-1);
		
	}

}
