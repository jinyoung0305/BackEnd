package org.koreait.exam04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		MemberJoinService memberJoinService = ctx.getBean(MemberJoinService.class);
		Member member = new Member("user01", "123456", "사용자01");
		memberJoinService.join(member);
		
		MemberListService memberListService = ctx.getBean(MemberListService.class);
		memberListService.print();
		
		ctx.close();

	}

}
