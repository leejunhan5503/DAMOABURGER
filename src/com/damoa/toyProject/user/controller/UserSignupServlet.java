package com.damoa.toyProject.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.damoa.toyProject.user.model.dto.UserDTO;
import com.damoa.toyProject.user.model.service.UserSerivce;

@WebServlet("/user/signup")
public class UserSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/user/registForm.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}

	/* 회원 가입 폼 작성 후 post 요청을 처리합니다. doPost와 doGet요청의 차이는 아시죠?*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		java.sql.Date date = java.sql.Date.valueOf(request.getParameter("date"));
		String email = request.getParameter("email");
		
		UserDTO signupUser = new UserDTO();
		signupUser.setUserName(userName);
		signupUser.setUserId(userId);
		signupUser.setUserPwd(userPwd);
		signupUser.setEnrollDate(date);
		signupUser.setEmail(email);
	
		System.out.println("memberController requestMember : " + signupUser);
		
		int result = new UserSerivce().registUser(signupUser);
		
		System.out.println("memberController result : " + result);
		
		String page = "";
		
		if(result > 0) {
			page = "/WEB-INF/view/common/success.jsp";
			request.setAttribute("successCode", "insertUser");
		} else {
			page = "/WEB-INF/views/common/failed.jsp";
			request.setAttribute("message", "회원 가입 실패!");
		}
		request.getRequestDispatcher(page).forward(request, response);
	}
}
