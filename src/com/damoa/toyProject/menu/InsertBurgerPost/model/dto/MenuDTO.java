package com.damoa.toyProject.menu.InsertBurgerPost.model.dto;

public class MenuDTO {
	
	private int menuCode;
	private String menuName;
	private String menuBrand;
	private int menuPrice;
	private int menuRank;
	private String userNo;
	
	public MenuDTO() {
		super();
	}

	@Override
	public String toString() {
		return "MenuDTO [menuCode=" + menuCode + ", menuName=" + menuName + ", menuBrand=" + menuBrand + ", menuPrice="
				+ menuPrice + ", menuRank=" + menuRank + ", userNo=" + userNo + "]";
	}
	public MenuDTO(int menuCode, String menuName, String menuBrand, int menuPrice, int menuRank, String userNo) {
		super();
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.menuBrand = menuBrand;
		this.menuPrice = menuPrice;
		this.menuRank = menuRank;
		this.userNo = userNo;
	}

	public int getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(int menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuBrand() {
		return menuBrand;
	}

	public void setMenuBrand(String menuBrand) {
		this.menuBrand = menuBrand;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

	public int getMenuRank() {
		return menuRank;
	}

	public void setMenuRank(int menuRank) {
		this.menuRank = menuRank;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	
	
}
