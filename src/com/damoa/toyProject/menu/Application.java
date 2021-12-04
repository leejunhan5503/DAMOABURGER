package com.damoa.toyProject.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.damoa.toyProject.menu.controller.PostController;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* MVC구조상 다음은 컨트롤러로 향한다. */
		PostController postController = new PostController();
		
		/* Menu를 만든다 */
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
//				case 2 : postController.selectMenuByCode(inputMenuCode());break;
			}
		} while(true);
		
	}
	/* name을 호출할 때 menuName이 호출되고, HashMap에 담겨 나온다. */
	private static Map<String, String> inputMenuCode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 코드를 입력하세요.");
		String code = sc.nextLine();
		/* 사용자가 입력한 값이 Map형태로 back단에 넘어가게 된다. */
		Map<String, String> parameter = new HashMap<>();
		parameter.put("code", code);
		/* 위에서 parameter.put()메소드를 호출했으므로, parameter를 반환한다. */
		return parameter;
	}
}
