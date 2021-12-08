package com.damoa.toyProject.user.model.service;

import static com.damoa.toyProject.common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.user.model.dao.UserMapper;
import com.damoa.toyProject.user.model.dto.UserDTO;

public class UserService {

	public boolean registNewUser(UserDTO user) {
		SqlSession session = getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		int result = userMapper.insertNewUser(user);
		
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		System.out.println("result출력" + result);
		
		session.close();
		
		return result > 0 ? true : false;
	}
	public UserDTO selectUserByCode(int userNo) {
		SqlSession session = getSqlSession();
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		UserDTO user = userMapper.selectAllUser(userNo);
		
		session.close();
		
		return user;
	}
	

}
