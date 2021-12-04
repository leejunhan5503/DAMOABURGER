package com.damoa.toyProject.menu.controller;

import java.util.List;
import java.util.Map;

import com.damoa.toyProject.menu.ResultView;
import com.damoa.toyProject.menu.model.dto.PostDTO;
import com.damoa.toyProject.menu.model.dto.SearchOption;
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
	public void selectPostBySearchOption(SearchOption searchOption) {
		List<PostDTO> searchedPostList = postService.selectPostBySearchOption(searchOption);
		
		if(!searchedPostList.isEmpty()) {
			resultView.printPostList(searchedPostList);
		} else {
			resultView.printErrorMessage("selectList");
		}
	}

	public void registMenuPost(Map<String, Object> parameter) {
		PostDTO post = new PostDTO();
		
		post.setMenuCode(Integer.valueOf((String) parameter.get("menuCode")));
		post.setTitle((String) parameter.get("title"));
		post.setContent((String) parameter.get("content"));
		post.setMenuBrand((String) parameter.get("menuBrand"));
		post.setMenuName((String) parameter.get("menuName"));
		post.setMenuPrice(Integer.valueOf((String) parameter.get("menuPrice")));
		post.setMenuRank(Integer.valueOf((String) parameter.get("menuRank")));
		
		if(postService.registMenuPost(post)) {
			resultView.printSuccessMessage("insert");
		} else {
			resultView.printErrorMessage("insert");
		}
	}

}
