package com.damoa.toyProject.user.model.service;

import static com.damoa.toyProject.common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.user.model.dao.UserMapper;
import com.damoa.toyProject.user.model.dto.UserDTO;

public class UserService {
	
	public boolean registUser(UserDTO insertUser) {
		/* DB와 연결해주는 sqlSession 객체를 생성해줍니다. */
		SqlSession sqlession = getSqlSession();
		UserMapper userMapper = sqlession.getMapper(UserMapper.class);
		
		int result = userMapper.insertUser(insertUser);
		if (result > 0) {
			sqlession.commit();
		} else {
			sqlession.rollback();
		}
		sqlession.close();
		return result > 0 ? true : false;
	}
}
