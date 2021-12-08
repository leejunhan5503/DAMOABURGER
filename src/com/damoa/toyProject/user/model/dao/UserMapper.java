package com.damoa.toyProject.user.model.dao;

import com.damoa.toyProject.user.model.dto.UserDTO;

public interface UserMapper{

	int insertNewUser(UserDTO user);

	UserDTO selectAllUser(int userNo);



}
