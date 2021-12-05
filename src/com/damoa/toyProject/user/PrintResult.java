package com.damoa.toyProject.user;

import java.util.List;

import com.damoa.toyProject.user.model.dto.UserDTO;

public class PrintResult {

	public void printMenu(UserDTO menu) {
		System.out.println(menu);
	}
	
	public void printSuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
			case "insert" : successMessage = "회원가입에 성공하셨습니다."; break;
		}
		System.out.println(successMessage);
	}
	
	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
			case "insert" : errorMessage = "회원가입에 실패하셨습니다."; break;
		}
		System.out.println(errorMessage);
	}

}




