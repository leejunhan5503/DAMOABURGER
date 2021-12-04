package com.damoa.toyProject.menu.model.dto;

import java.io.Serializable;

public class SearchOption implements Serializable{

	private static final long serialVersionUID = 3635473133072904165L;

	private String option;
	private String value;
	
	public SearchOption() {
	}

	public SearchOption(String option, String value) {
		this.option = option;
		this.value = value;
	}

	@Override
	public String toString() {
		return "SearchOption [option=" + option + ", value=" + value + "]";
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
