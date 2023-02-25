package org.koreait.exam03;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberListService {
	@Autowired
	private MemberDao memberDao;
	
	public MemberListService() {}
	
//	@Autowired
//	public MemberListService(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	public void print() {
		memberDao.printMembers();
	}
}
