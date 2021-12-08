package com.damoa.toyProject.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.reflection.SystemMetaObject;

import com.damoa.toyProject.menu.controller.PostController;
import com.damoa.toyProject.menu.model.dto.SearchOption;

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
			int num = sc.nextInt();
			
			switch(num) {
			case 1: postController.selectAllPost();break;
			case 2: postController.selectPostBySearchOption(getSearchOption());break;
			case 3: postController.registMenuPost(getPostInfo());break;
			case 4: postController.modifyMenuPost(updatePost());break;
			case 5: postController.deleteMenuPost(deleteMenuPost());break;
			case 9: System.out.println("게시글 단위 테스트 종료."); return;
			default: System.out.println("올바르지 않은 번호를 입력하였습니다! : " + num);
			}
		} while(true);
		
	}
	/* name을 호출할 때 menuName이 호출되고, HashMap에 담겨 나온다. */
	private static SearchOption getSearchOption() {
		Scanner sc= new Scanner(System.in);
		SearchOption searchOption = new SearchOption();
		
		System.out.println("게시글을 검색할 옵션을 입력해 주세요" + "선택 가능한 검색 옵션을 다음과 같습니다.");
		System.out.println("버거 이름 -> \'menuCode\' 입력");
		System.out.println("버거 브랜드 -> \'menuBrand\'입력");
		System.out.println("버거 가격 -> \'menuPrice\'입력");
		System.out.println("버거 별점 -> \'menuRank\'입력");
		System.out.print("검색옵션 : ");
		searchOption.setOption(sc.nextLine());
		System.out.println("검색할 게시물의 " + searchOption.getOption() + "을 입력하세요 : ");
		searchOption.setValue(sc.nextLine());
		
		return searchOption;
		
	}
	
	private static Map<String, String> getPostInfo() {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		
		System.out.println("게시글을 등록하기 위해 등록할 게시글의 정보가 필요합니다.");
		System.out.print("게시글의 제목을 입력해 주세요:");
		String title = sc.nextLine();
		System.out.print("게시글의 내용을 입력해 주세요:");
		String content = sc.nextLine();
		System.out.print("햄버거 브랜드를 입력해 주세요:");
		String menuBrand = sc.nextLine();
		System.out.print("헴버거 이름을 입력해주세요:");
		String menuName = sc.nextLine();
		System.out.print("햄버거의 가격을 입력해주세요:");
		String menuPrice = sc.nextLine();
		System.out.print("헴버거의 별점을 입력해주세요:");
		String menuRank = sc.nextLine();
		
		parameter.put("title", title);
		parameter.put("content", content);
		parameter.put("menuBrand", menuBrand);
		parameter.put("menuName", menuName);
		parameter.put("menuPrice", menuPrice);
		parameter.put("menuRank", menuRank);
		
		return parameter;
	}
	private static Map<String, Object> updatePost() {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Object> parameter = new HashMap<>();
		
		System.out.println("게시글을 수정하기 위해 정보를 수집합니다.");
		System.out.println("수정할 게시글의 코드를 입력해 주세요");
		int menuCode = sc.nextInt();
		sc.nextLine();
		System.out.println("게시글의 제목을 수정하려면, 수정 후로 결정될 게시글의 제목을 입력하세요(수정을 원치 않을 경우 Enter를 눌러주세요.");
		String title = sc.nextLine();
		System.out.println("게시글의 내용을 수정하려면, 수정 후로 결정될 게시글의 내용을 입력하세요(수정을 원치 않을 경우 Enter를 눌러주세요 ");
		String content = sc.nextLine();
		System.out.println("햄버거의 이름을 수정하려면, 수정 후로 결정될 햄버거의 이름을 입력하세요(수정을 원치 않을 경우 Enter를 눌러주세요 ");
		String menuName = sc.nextLine();
		System.out.println("햄버거의 브랜드를 수정하려면, 수정 후로 결정될 햄버거의 브랜드를 입력하세요(수정을 원치 않을 경우 Enter를 눌러주세요 ");
		String menuBrand = sc.nextLine();
		System.out.println("햄버거의 가격을 수정하려면, 수정 후로 결정될 햄버거의 가격을 입력하세요(수정을 원치 않을 경우 Enter를 눌러주세요 ");
		double menuPrice = sc.nextInt();
		System.out.println("햄버거의 별점을 수정하려면, 수정 후로 결정될 햄버거의 별점을 입력하세요(수정을 원치 않을 경우 Enter를 눌러주세요 ");
		int menuRank = sc.nextInt();
		sc.nextLine();
		
		parameter.put("menuCode", menuCode);
		parameter.put("title", title);
		parameter.put("content", content);
		parameter.put("menuName", menuName);
		parameter.put("menuBrand", menuBrand);
		parameter.put("menuPrice", menuPrice);
		parameter.put("menuRank", menuRank);
		
		return parameter;
	
	}
	
	private static Map<String, String> deleteMenuPost() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		
		System.out.println("게시글을 삭제하기 위해 게시글의 번호가 필요합니다.");
		System.out.print("삭제하고 싶은 게시글의 번호를 입력해주세요");
		String menuCode = sc.nextLine();
		
		parameter.put("menuCode", menuCode);
		
		return parameter;
		
		
		
		
		
	}
		
	
}
