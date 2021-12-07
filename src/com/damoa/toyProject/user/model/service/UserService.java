package com.damoa.toyProject.user.model.service;

import org.apache.ibatis.session.SqlSession;
import static com.damoa.toyProject.common.Template.getSqlSession;

import com.damoa.toyProject.user.model.dao.UserMapper;
import com.damoa.toyProject.user.model.dto.UserDTO;

public class UserService {

	public boolean registNewUser(UserDTO user) {
		SqlSession session = getSqlSession();
		UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
		int result = userMapper.registNewUser(user);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result > 0 ? true : false;
	}
	

}
