package com.damoa.toyProject.menu.model.service;

import static com.damoa.toyProject.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.damoa.toyProject.menu.model.dao.PostMapper;
import com.damoa.toyProject.menu.model.dto.PostDTO;
import com.damoa.toyProject.menu.model.dto.SearchOption;

public class PostService {

	public List<PostDTO> selectAllPost() {
		SqlSession sqlSession = getSqlSession();
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
		
		List<PostDTO> postList = postMapper.selectAllPost();
		
		sqlSession.close();
		
		return postList;
	}

	public List<PostDTO> selectPostBySearchOption(SearchOption searchOption) {
		SqlSession sqlSession = getSqlSession();
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
		List<PostDTO> searchedPostList = postMapper.selectPostBySearchOption(searchOption);
		
		sqlSession.close();
		
		return searchedPostList;
	}

	public boolean registMenuPost(PostDTO post) {
		SqlSession sqlSession = getSqlSession();
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
		
		int result = postMapper.insertNewPost(post);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result > 0 ? true : false;
	}

	public boolean modifyMenuPost(Map<String, Object> parameter) {
		SqlSession sqlSession = getSqlSession();
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
		
		int result = postMapper.modifyMenuPost(parameter);
		if(result>0) {
			sqlSession.commit();
		} else {
			sqlSession.commit();
		}
		sqlSession.close();
		return result > 0 ? true : false;
	}

	public boolean deleteMenuPost(int menuCode) {
		SqlSession sqlSession = getSqlSession();
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
		
		int result = postMapper.deleteMenuPost(menuCode);
		if (result>0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0 ? true : false;
	}

}
