package org.koreait.exam05;

import org.koreait.exam05.cal.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		RecCalculator cal1 = ctx.getBean("recCalculator", RecCalculator.class);
		Calculator cal2 = ctx.getBean("implCalculator", Calculator.class);
		
		int result1 = cal1.factorial(10);
		System.out.printf("cal1=%d%n", result1);
		
		int result2 = cal1.factorial(10);
		System.out.printf("cal1=%d%n", result2);
		
		int result3 = cal1.factorial(10);
		System.out.printf("cal1=%d%n", result3);
		
		int result4 = cal1.factorial(10);
		System.out.printf("cal1=%d%n", result4);
		
//		int result2 = cal2.factorial(10);
//		System.out.printf("cal2=%d%n", result2);
				
		
		ctx.close();
	}

}
