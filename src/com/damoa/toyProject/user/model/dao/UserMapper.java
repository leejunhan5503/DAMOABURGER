package com.damoa.toyProject.user.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.user.model.dto.UserDTO;

public class UserMapper {
	/* 회원가입용 메소드 */
	public int insertUser(SqlSession session, UserDTO requestUser) {
		return session.insert("UserMapper.insertUser", requestUser);
	}

}
