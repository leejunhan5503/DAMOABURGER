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

	public void printErrorMessage(String errorCode) {
		String printErrorMessage = "";
		
		switch(errorCode) {
		case"selectList" : printErrorMessage = "[Errror] 신규 게시글을 등록에 실패했습니다."; break;
		
		}
		
	}

}
