package org.koreait.exam01;

public class Member {
	private String userId; // 아이디
	private String userPw; // 비번
	private String userNm; // 회원명
	
	public Member(String userId, String userPw, String userNm) {
		this.userId = userId;
		this.userPw = userPw;
		this.userNm = userNm;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userNm=" + userNm + "]";
	}
}
