package com.damoa.toyProject.user.model.dto;

import java.io.Serializable;
import java.sql.Date;

/*
 *  implements Serializable 를 사용하는 이유는 ? 직렬화 떄문 이라고 하는데 아직 이해못함.
 *  => 자바 빈 형태의 DTO를 더욱 명확하게 만들기 위해서입니다. (이준한)
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 6035064647152544048L;

	private int userNo;
	private String userName;
	private String userId;
	private String userPwd;
	private java.util.Date enrollDate;
	private String email;

	public UserDTO() {
	}

	public UserDTO(int userNo, String userName, String userId, String userPwd, java.util.Date enrollDate,
			String email) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
		this.enrollDate = enrollDate;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [userNo=" + userNo + ", userName=" + userName + ", userId=" + userId + ", userPwd=" + userPwd
				+ ", enrollDate=" + enrollDate + ", email=" + email + "]";
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public java.util.Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(java.util.Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
