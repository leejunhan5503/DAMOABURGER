package com.damoa.toyProject.menu.controller;

import java.util.List;

import com.damoa.toyProject.menu.ResultView;
import com.damoa.toyProject.menu.model.dto.PostDTO;
import com.damoa.toyProject.menu.model.service.PostService;

public class PostController {
	private final PostService postService;
	private final ResultView resultView;
	
	public PostController() {
		postService = new PostService();
		resultView = new ResultView();
	}
	
	public void selectAllPost() {
		List<PostDTO> menuList = postService.selectAllPost();
		
		if(!menuList.isEmpty()) {
			resultView.printPostList(menuList);
		} else {
			resultView.printErrorMessage("selectList");
		}
		
	}

}
