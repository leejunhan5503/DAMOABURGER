package com.damoa.toyProject.user.model.service;

import static com.damoa.toyProject.common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.user.model.dao.UserMapper;
import com.damoa.toyProject.user.model.dto.UserDTO;

public class UserSerivce {
	
	/* 의존 관계에 있는 객체가 불변을 유지할 수 있도록 final 필드로 선언한다. */
	private final UserMapper userMapper;
	
	/* 생성자를 이용하여 객체를 생성해 필드에 값을 넣는다. */
	public UserSerivce() {
		userMapper = new UserMapper();
	}
	/* 회원가입용 메소드 */
	public int registUser(UserDTO signupUser) {
		SqlSession session = getSqlSession();
		int result = userMapper.insertUser(session, signupUser);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		session.close();
		return result;
	}
}
