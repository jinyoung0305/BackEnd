package org.koreait.exam02;

public class Main1 {

	public static void main(String[] args) {
		MemberServiceManager manager = new MemberServiceManager();
		Member member = new Member("user01", "123456","이이름");
		MemberJoinService joinService = manager.getMemberJoinService();
		joinService.join(member);
		
		MemberListService listService = manager.getMemberListService();
		listService.print();
		
	}

}
