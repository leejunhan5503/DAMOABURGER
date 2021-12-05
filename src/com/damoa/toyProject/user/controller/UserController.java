package com.damoa.toyProject.user.controller;

import java.util.Map;

import com.damoa.toyProject.user.PrintResult;
import com.damoa.toyProject.user.model.dto.UserDTO;
import com.damoa.toyProject.user.model.service.UserService;


public class UserController {

	private final UserService userService;
	private final PrintResult printResult;
	
	public UserController() {
		userService = new UserService();
		printResult = new PrintResult();
	}
	
public void registUser(Map<String, String> parameter) {
	String userName = parameter.get("userName");
	String userId = parameter.get("userId");
	String userPwd = parameter.get("userPwd");
	String email = parameter.get("email");
		
	UserDTO user = new UserDTO();
	user.setUserName(userName);
	user.setUserId(userId);
	user.setUserPwd(userPwd);
	user.setEmail(email);
		
	if (userService.registUser(user)) {
		printResult.printSuccessMessage("insert");
	} else {
		printResult.printErrorMessage("insert");
	}
}

}
