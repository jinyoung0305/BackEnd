package org.koreait.exam04;

public class MemberJoinService {
	private MemberDao memberDao;
	
	public MemberJoinService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public void join(Member member) {
		String userId= member.getUserId();
		String userPw = member.getUserPw();
		if(userId == null || userPw == null) {
			throw new RuntimeException("아이디, 비밀번호 입력하세요");
		}
		memberDao.join(member);
	}
}
