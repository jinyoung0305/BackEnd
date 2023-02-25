package org.koreait.exam03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@Service
public class MemberJoinService {
	@Autowired
	private MemberDao memberDao;
	private DateTimeFormatter formatter;

	public void join(Member member) {
		String userId= member.getUserId();
		String userPw = member.getUserPw();
		if(userId == null || userPw == null) {
			throw new RuntimeException("아이디, 비밀번호 입력하세요");
		}
		member.setRegDt(LocalDateTime.now());
		if(formatter != null) {
			String date = formatter.format(member.getRegDt());
			System.out.printf("변경된 날짜 형식 : %s%n", date);			
		}
				
		memberDao.join(member);
	}
	
//	@Autowired
//	public void setDateTimeFormatter(@Nullable DateTimeFormatter formatter) {
//		this.formatter = formatter;
//	}
	@Autowired(required=false)
	public void setDateTimeFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}
}
