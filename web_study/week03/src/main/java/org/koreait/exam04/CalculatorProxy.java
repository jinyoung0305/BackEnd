package org.koreait.exam04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorProxy {
	
	@Pointcut("execution(public * org.koreait.exam04.cal..*(int))")
	public void publicTarget() {}
	
	@Around("publicTarget()")
	public Object calcu(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.nanoTime();
		Object result = joinPoint.proceed(); // 핵심기능 -> factorial
		long endTime = System.nanoTime();
		
		System.out.printf("걸린시간 : %d%n", endTime-startTime);
		return result;
	}
}	

