package com.damoa.toyProject.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.damoa.toyProject.user.controller.UserController;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* MVC구조 상 다음은 컨트롤러로 향한다. */
		UserController userController = new UserController();
	
		/* 사용자 회원가입, 로그인, 로그아웃 선택사항을 만들어 보자. */
		do {
			System.out.println("(1)회원가입, (2)로그인, (3)로그아웃 단위 테스트");
			System.out.println("1. 회원가입을 실시합니다.");
			System.out.println("2. 로그인을 시도합니다.");
			System.out.println("3. 로그아웃을 시도합니다.");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : userController.registNewUser(insertNewUser());break;
			}
			
		} while(true);
	}
	
	private static Map<String, String> insertNewUser() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		
		System.out.println("회원가입을 위해 필요한 다음의 정보를 입력해주세요.");
		System.out.println("성함을 입력해주세요.");
		String userName = sc.nextLine();
		System.out.println("사용하실 아이디를 입력해 주세요.");
		String userId = sc.nextLine();
		System.out.println("사용하실 비밀번호를 입력해 주세요");
		String userPwd = sc.nextLine();
		System.out.println("사용하실 이메일을 입력해 주세요.");
		String email = sc.nextLine();
			
		parameter.put("userName", userName);
		parameter.put("userId", userId);
		parameter.put("userPwd", userPwd);
		parameter.put("email", email);
		
		return parameter;
		
	}
}
