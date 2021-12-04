package com.damoa.toyProject.menu.model.dto;

import java.io.Serializable;

public class PostDTO implements Serializable{
	
	private static final long serialVersionUID = 2033992169619151526L;
	
	private int menuCode;
	private String menuName;
	private String menuBrand;
	private int menuPrice;
	private int menuRank;
	private String title;
	private String content;
	private int categoryCode;

	public PostDTO() {
		super();
	}

	public PostDTO(int menuCode, String menuName, String menuBrand, int menuPrice, int menuRank, String title,
			String content, int categoryCode) {
		super();
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.menuBrand = menuBrand;
		this.menuPrice = menuPrice;
		this.menuRank = menuRank;
		this.title = title;
		this.content = content;
		this.categoryCode = categoryCode;
	}

	@Override
	public String toString() {
		return "PostDTO [menuCode=" + menuCode + ", menuName=" + menuName + ", menuBrand=" + menuBrand + ", menuPrice="
				+ menuPrice + ", menuRank=" + menuRank + ", title=" + title + ", content=" + content + ", categoryCode="
				+ categoryCode + "]";
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}	