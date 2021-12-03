package com.damoa.toyProject.menu.InsertBurgerPost;

import java.util.List;

import com.damoa.toyProject.menu.InsertBurgerPost.model.dto.MenuDTO;

public class PostPrintResultView {

	public void printPostList(List<MenuDTO> menuList) {
		System.out.println("[성공] 게시글 조회 성공했음");
		for(MenuDTO list : menuList) {
			System.out.println(list);
		}
	}

	public void printErrorMessage(String errorCode) {
		String printErrorMessage = "";
		
		switch(errorCode) {
		case"selectList" : printErrorMessage = "[Errror] 신규 게시글을 등록에 실패했습니다."; break;
		
		}
		
	}

}
