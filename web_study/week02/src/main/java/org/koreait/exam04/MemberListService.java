package org.koreait.exam04;

public class MemberListService {
	private MemberDao memberDao;
	
	public MemberListService(MemberDao memberDao) {
		this.memberDao = memberDao;
		
	}
	
	public void print() {
		memberDao.printMembers();
	}
}
