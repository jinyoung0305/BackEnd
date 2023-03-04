package org.koreait.exam05;

import org.koreait.exam05.cal.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppCtx {
	
	@Bean
	@Order(1)
	public CachedProxy cachedProxy() {
		return new CachedProxy();
	}
	
	@Bean
	@Order(2)
	public CalculatorProxy calculatorProxy() {
		return new CalculatorProxy();
	}
	
	@Bean
	public Calculator implCalculator() {
		return new ImplCalculator();
	}
	
	@Bean
	public RecCalculator recCalculator() {
		return new RecCalculator();
	}
}
