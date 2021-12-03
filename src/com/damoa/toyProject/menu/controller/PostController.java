package com.damoa.toyProject.menu.controller;

import java.util.List;

import com.damoa.toyProject.menu.PostPrintResultView;
import com.damoa.toyProject.menu.model.dto.MenuDTO;
import com.damoa.toyProject.menu.model.service.PostService;

public class PostController {
	private final PostService postService;
	private final PostPrintResultView resultView;
	
	public PostController() {
		this.postService = new PostService();
		this.resultView = new PostPrintResultView();
	}
	
	public void selectAllPost() {
		List<MenuDTO> menuList = postService.selectAllPost();
		
		if(!menuList.isEmpty()) {
			resultView.printPostList(menuList);
		} else {
			resultView.printErrorMessage("selectList");
		}
		
	}

}
