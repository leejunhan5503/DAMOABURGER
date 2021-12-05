package com.damoa.toyProject.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.damoa.toyProject.user.controller.UserController;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserController userController = new UserController();

		userController.registUser(inputUser());
	}

	private static Map<String, String> inputUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String userName = sc.nextLine();
		System.out.print("아이디를 입력하세요 :");
		String userId = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String userPwd = sc.nextLine();
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("userName", userName);
		parameter.put("userId", userId);
		parameter.put("userPwd", userPwd);
		parameter.put("email", email);
		
		return parameter;
	}

}
