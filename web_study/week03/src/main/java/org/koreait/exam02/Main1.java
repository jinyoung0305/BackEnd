package org.koreait.exam02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Message message = ctx.getBean(Message.class);
		message.send("이이름");
		ctx.close();
	}

}
