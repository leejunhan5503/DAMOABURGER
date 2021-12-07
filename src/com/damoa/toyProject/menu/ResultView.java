package com.damoa.toyProject.menu;

import java.util.List;

import com.damoa.toyProject.menu.model.dto.PostDTO;

public class ResultView {

	public void printPostList(List<PostDTO> menuList) {
		System.out.println("[성공] 게시글 조회 성공했음");
		for(PostDTO list : menuList) {
			System.out.println(list);
		}
	}
	public void printMenu(PostDTO menu) {
		System.out.println(menu);
	}
	public void printSuccessMessage(String successCode) {
		String successMessage = "";
		
		switch(successCode) {
		case "insert" : successMessage = "[Success] 신규 게시글 등록에 성공했습니다.";break;
		case "update" : successMessage = "[Success] 게시글 수정에 성공했습니다.";break;
		}
	}

	
	public void printErrorMessage(String errorCode) {
		String printErrorMessage = "";
		
		switch(errorCode) {
		case "selectList" : printErrorMessage = "[Errror] 신규 게시글을 조화에 실패했습니다."; break;
		case "selectPostBySearchOption" : printErrorMessage = "[Error] 게시글 목록 검색에 실패했습니다.";break;
		case "insert" : printErrorMessage = "[Error] 게시글 등록에 실패했습니다.";break;
		case "update" : printErrorMessage = "[Error] 게시글 수정에 실패했습니다.";break;
		}
		
	}

}
