package com.damoa.toyProject.menu;

import java.util.Scanner;

import com.damoa.toyProject.menu.controller.PostController;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PostController postController = new PostController();
		
		do {
			System.out.println("==============햄버거 메뉴 게시글 단위 테스트============");
			System.out.println("1. 햄버거 게시글 전체 조회 ");
			System.out.println("2. 햄버거 게시글 검색 조회" );
			System.out.println("3. 햄버거 게시글 등록하기");
			System.out.println("4. 햄버거 게시글 수정하기");
			System.out.println("5. 햄버거 게시글 삭제하기");
			System.out.println("9. 게시글 단위 테스트 종료");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : postController.selectAllPost();break;
			}
		} while(true);
		
	}

}
