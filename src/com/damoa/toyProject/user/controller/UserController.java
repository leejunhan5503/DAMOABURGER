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
	
	public void selectUserByCode(Map<String, String> parameter) {
		int userNo = Integer.valueOf(parameter.get("userNo"));
		UserDTO user = userService.selectUserByCode(userNo);
		
		if(user != null) {
			printResult.printUserList(user);
		} else {
			printResult.printErrorMessage("selectUser");
		}
	}
	
	public void registNewUser(Map<String, String> parameter) {
		String userName = parameter.get("userName");
		String userId = parameter.get("userId");
		String userPwd = parameter.get("userPwd");
		String email = parameter.get("email");
		
		UserDTO user = new UserDTO();
		user.setUserName(parameter.get("userName"));
		user.setUserId(parameter.get("userId"));
		user.setUserPwd(parameter.get("userPwd"));
		user.setEmail(parameter.get("email"));
		
	if (userService.registNewUser(user)) {
		printResult.printSuccessMessage("insert");
	} else {
		printResult.printErrorMessage("insert");
	}
}

}
