package com.damoa.toyProject.user.model.dto;

import java.io.Serializable;
import java.sql.Date;

/*
 *  implements Serializable 를 사용하는 이유는 ? 직렬화 떄문 이라고 하는데 아직 이해못함.
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 6035064647152544048L;

	private int userNo;
	private String name;
	private String id;
	private String pwd;
	private Date enrollDate;
	private String email;

	public UserDTO() {
	}
	public UserDTO(int userNo, String name, String id, String pwd, Date enrollDate, String email) {
		this.userNo = userNo;
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.enrollDate = enrollDate;
		this.email = email;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [userNo=" + userNo + ", name=" + name + ", id=" + id + ", pwd=" + pwd + ", enrollDate="
				+ enrollDate + ", email=" + email + "]";
	}

	
}
