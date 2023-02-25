package org.koreait.exam03;

import java.util.Optional;

public class Ex01 {

	public static void main(String[] args) {
		String str = null;
		Optional<String> opt = Optional.ofNullable(str);
		//String str2 = opt.orElse("기본값"); // orElse -> null값 -> 기본값
		//String str2 = opt.orElseGet(() ->"기본값");
		String str2 = opt.orElseThrow(() -> new RuntimeException("예외발생!"));
		
		System.out.println(str2);			
		

	}

}
