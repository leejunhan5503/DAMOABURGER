package com.damoa.toyProject.user.controller;

import java.util.Map;

import com.damoa.toyProject.user.PrintResult;
import com.damoa.toyProject.user.model.dto.UserDTO;
import com.damoa.toyProject.user.model.service.UserService;

public class UserController {

	/* MVC 구조상 controller는 Service로 향합니다. 
	 * 그리고 컨트롤러에서는 트랜잭션을 통해 그 결과값을 보여주므로 printResult 객체도 만들어줍니다. */
	private final UserService userService;
	private final PrintResult printResult;
	
	public UserController() {
		userService = new UserService();
		printResult = new PrintResult();
	}
	
	public void registUser(Map<String, String> parameter) {
		UserDTO user = new UserDTO();
		user.setUserName(parameter.get("userName"));
		user.setUserId(parameter.get("userId"));
		user.setUserPwd(parameter.get("userPwd"));
		user.setEmail(parameter.get("email"));
		
	if (userService.registUser(user)) {
		printResult.printSuccessMessage("insert");
	} else {
		printResult.printErrorMessage("insert");
	}
}

}
