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

	public void registMenuPost(Map<String, String> parameter) {
		PostDTO post = new PostDTO();
		
		post.setTitle(parameter.get("title"));
		post.setContent(parameter.get("content"));
		post.setMenuBrand(parameter.get("menuBrand"));
		post.setMenuName(parameter.get("menuName"));
		post.setMenuPrice(Double.valueOf(parameter.get("menuPrice")));
		post.setMenuRank(Integer.valueOf(parameter.get("menuRank")));
		post.setCategoryCode(Integer.valueOf(parameter.get("categoryCode")));
		
		if(postService.registMenuPost(post)) {
			resultView.printSuccessMessage("insert");
		} else {
			resultView.printErrorMessage("insert");
		}
	}

}
