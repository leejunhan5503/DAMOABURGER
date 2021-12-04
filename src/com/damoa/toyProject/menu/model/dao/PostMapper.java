package com.damoa.toyProject.menu.model.dao;

import java.util.List;

import com.damoa.toyProject.menu.model.dto.PostDTO;
import com.damoa.toyProject.menu.model.dto.SearchOption;

public interface PostMapper {

	List<PostDTO> selectAllPost();

	List<PostDTO> selectPostBySearchOption(SearchOption searchOption);

	int insertNewPost(PostDTO post);
	
}
