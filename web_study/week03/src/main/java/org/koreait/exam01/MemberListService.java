package org.koreait.exam01;

import org.springframework.stereotype.Service;

@Service
public class MemberListService {
	private MemberDao memberDao;
	
	public MemberListService(MemberDao memberDao) {
		this.memberDao = memberDao;
		
	}
	
	public void print() {
		memberDao.printMembers();
	}
}
