package exam01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterEx02 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("공통 기능!!! - FilterEx02"); // 요청 처리 전 공통기능
		
		chain.doFilter(request, response);
		
		System.out.println("공통 기능!!! - FilterEx02"); // 응답 처리 후 공통 기능 // 서블릿이 이미 응답 이후
	}

}
