package exam01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CommonFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 요청전 공통 기능
		CommonRequestWrapper requestWrapper = new CommonRequestWrapper((HttpServletRequest)request);
		
		chain.doFilter(requestWrapper, response);
		
		// 응답후 공통 기능
	}

}
