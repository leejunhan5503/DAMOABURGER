package com.damoa.toyProject.menu.model.dao;

import java.util.List;

import com.damoa.toyProject.menu.model.dto.MenuDTO;

public interface PostMapper {

	List<MenuDTO> selectAllPost();
	
	MenuDTO selectPostBymenuCode (int menuCode);
	
	int insertBurgerMenu(MenuDTO menu);
	
	int modifyBurgerMenu(MenuDTO menu);
	
	int deleteBurgerMenu(int MenuCode);

}
