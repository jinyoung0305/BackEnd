package org.koreait.exam05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorProxy {
	
	
	@Around("CommonPointcut.calculatorTarget()") // == @Around("org.koreait.exam05.CommonPointcut.calculatorTarget()")
//	@Around("execution(* org.koreait.exam05.cal..*(..))")
	public Object calcu(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.nanoTime();
		
		Object result = joinPoint.proceed(); // factorial 대신 수행 // 핵심기능
		
		long endTime = System.nanoTime();
		System.out.printf("걸린 시간 : %d%n", endTime-startTime);
		
		return result;
	}
}
