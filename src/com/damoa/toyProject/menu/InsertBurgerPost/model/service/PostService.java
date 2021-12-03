package com.damoa.toyProject.menu.InsertBurgerPost.model.service;

import static com.damoa.toyProject.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.menu.InsertBurgerPost.model.dao.PostMapper;
import com.damoa.toyProject.menu.InsertBurgerPost.model.dto.MenuDTO;

public class PostService {

	public List<MenuDTO> selectAllPost() {
		SqlSession sqlSession = getSqlSession();
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
		
		List<MenuDTO> menuList = postMapper.selectAllPost();
		
		sqlSession.close();
		
		return menuList;
	}

}
