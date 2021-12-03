package com.damoa.toyProject.menu.InsertBurgerPost.model.dao;

import java.util.List;

import com.damoa.toyProject.menu.InsertBurgerPost.model.dto.MenuDTO;

public interface PostMapper {

	List<MenuDTO> selectAllPost();

}
