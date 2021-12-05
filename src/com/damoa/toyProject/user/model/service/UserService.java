package com.damoa.toyProject.user.model.service;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.user.model.dao.UserMapper;
import com.damoa.toyProject.user.model.dto.UserDTO;

import static com.damoa.toyProject.common.Template.getSqlSession;

public class UserService {
	
	public boolean registUser(UserDTO user) {
		SqlSession sqlSession = getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		int result = userMapper.insertUser(user);
		
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
	}
}
