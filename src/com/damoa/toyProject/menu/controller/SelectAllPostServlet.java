package com.damoa.toyProject.menu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.damoa.toyProject.menu.ResultView;
import com.damoa.toyProject.menu.model.dto.PostDTO;
import com.damoa.toyProject.menu.model.service.PostService;

@WebServlet("/post/allPost")
public class SelectAllPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PostService postService = new PostService();
		ResultView resultView = new ResultView();
		
		System.out.println(SelectAllPostServlet.class.getName() + "is successfully called.");
		
		List<PostDTO> postList = postService.selectAllPost();
		
		for(PostDTO post : postList) {
			System.out.println(post);
		}
		String forwardingPath = "";
		if(!postList.isEmpty()) {
			forwardingPath = "/WEB-ONF/post/postList.jsp";
			request.setAttribute("postList", postList);
		} else {
			resultView.printErrorMessage("selectList");
		}
		request.getRequestDispatcher(forwardingPath).forward(request, response);
	}

}
