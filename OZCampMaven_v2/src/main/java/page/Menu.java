package page;
import search.*;

import javax.swing.*;

import com.dto.CampDTO;
import com.dto.CommentDTO;
import com.dto.UserDTO;
import com.dto.WishlistDTO;

import menu.Comment;
import menu.User;
import menu.Wishlist;

import java.awt.event.*;
import java.util.List;
import java.util.Scanner;
import java.awt.*;

public class Menu {

	// 메인화면 로고
	public static void mainPrint() {

		System.out.println("                                                                               \r\n"
				+ "                                                                                        \r\n"
				+ "       ☾ ⋆*･ﾟ:⋆*･ﾟ:⠀ *⋆.*:･ﾟ .: ⋆*･ﾟ: .⋆☾ ⋆*･ﾟ:⋆*･ﾟ:⠀ *⋆.*:･ﾟ .: ⋆*･ﾟ: .⋆☾ ⋆*･ﾟ:⋆*･ﾟ:⠀ *⋆.*:･ﾟ .: ⋆*･ﾟ: .⋆  \r\n"
				+ "                                                                                        \r\n"
				+ "                     ██████╗ ███████╗     ██████╗ █████╗ ███╗   ███╗██████╗     ██╗     \r\n"
				+ "                    ██╔═══██╗╚══███╔╝    ██╔════╝██╔══██╗████╗ ████║██╔══██╗    ██║     \r\n"
				+ "                    ██║   ██║  ███╔╝     ██║     ███████║██╔████╔██║██████╔╝    ██║     \r\n"
				+ "                    ██║   ██║ ███╔╝      ██║     ██╔══██║██║╚██╔╝██║██╔═══╝     ╚═╝     \r\n"
				+ "                    ╚██████╔╝███████╗    ╚██████╗██║  ██║██║ ╚═╝ ██║██║         ██╗     \r\n"
				+ "                     ╚═════╝ ╚══════╝     ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝         ╚═╝     \r\n"
				+ "      ▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀ \r\n"
				+ "     \r\n"
				+ "                                                                                             \r\n"
				+ "                                              @@@@@@@@@%////@@                               \r\n"
				+ "                                         @@*******@@////////////@                            \r\n"
				+ "                                      @@*************@@///////////@&                         \r\n"
				+ "                                    @#*****************%@///////////@,                       \r\n"
				+ "                                  &@*********************@&///////////@                      \r\n"
				+ "                                 @*************************@///////////@                     \r\n"
				+ "                                @*********@@@@@&@@**********@///////////@                    \r\n"
				+ "                               @********@@@@@@&&&&&(*********@///////////@                   \r\n"
				+ "                              @********@@@@@&&&&&&&@**********@///////////@                  \r\n"
				+ "                             @*********@@&&&&&&&&&&&@**********@///////////@    @@@          \r\n"
				+ "                     @@@    @*********#@@@&&&&&&&&&&@***********@//////////@   @@@           \r\n"
				+ "                   # @@@, ,,@*********@&@&&&&&&&&&%&@***********@*/@@@@@/*,,, ,    #         \r\n"
				+ "                      @@,@/  ,,,,,**/////////////(/(((///////////@@@@@,,,,                   \r\n"
				+ "                                                                     #@@    					    ");
	}


	// 새로운 메뉴를 위한 공백
	public static void spaceForNew() {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                   ___________________________oz_camp___________________________");
		System.out.println();
		System.out.println();
		System.out.println();
	}


	// 메뉴 타이틀 
	public static void menuTitle(String menuName) {
		spaceForNew();
		System.out.println("                                                                                ");
		System.out.println("                                    ╭╼|════════════════════|╾╮                  ");
		System.out.println("                                             "+ menuName + "                           ");
		System.out.println("                                    ╰╼|════════════════════|╾╯                  ");
		System.out.println("                                                                                ");
	}



	// 게스트 로그인/회원가입 메뉴
	public static void guestMenu(List<CampDTO> resultList) {

		// 사용자 입력받기
		Scanner input = new Scanner(System.in);
		String menuInput;
		User user = new User();
		do {
			System.out.println("                                     sign in(0) | sign up(1)");
			System.out.print("                                     ▶          ");
			menuInput = input.nextLine();
		}while(!menuInput.equals("0") && !menuInput.equals("1") );

		// 로그인/회원가입 분기처리
		if (menuInput.equals("0"))
		{
			// 로그인 페이지
			user.login();
			userMenu(resultList);

		}
		else if(menuInput.equals("1"))
		{
			// 회원가입 페이지
			user.register();
			user.login();
			userMenu(resultList);
		}

	}

	// 사용자 메뉴
	public static void userMenu(List<CampDTO> resultList) {
		menuTitle("# menu");
		// 사용자 입력받기
		Scanner input = new Scanner(System.in);
		String menuInput;
		do {
			System.out.println("                                          # 1. 캠핑장 검색");
			System.out.println("                                          # 2. 캠핑장 추천");
			System.out.println("                                          # 3. 마이페이지");
			System.out.println("                                          # 0. 프로그램 종료");
			System.out.print("                                     ▶          ");
			menuInput = input.nextLine();
		}while(!menuInput.equals("1") && !menuInput.equals("2") && !menuInput.equals("3") &&  !menuInput.equals("0") );

		// 메뉴선택 분기처리
		switch (Integer.parseInt(menuInput))
		{
			case 1:
			{
				// 캠핑장 검색 페이지
				CampSearch.search(resultList);
				break;
			}
			case 2:
			{
				// 캠핑장 추천 페이지
				CampRecommend.campChoice(resultList);
				break;
			}
			case 3:
			{
				// 마이페이지
				myPage();
				break;
			}
			case 0:
			{
				// 시스템 종료
				System.out.println();
				System.out.println("                                         프로그램이 종료되었습니다");
				System.out.println("                                         다음에 또 이용해 주세요:)");
				System.exit(0);
				break;
			}
		}
	}

	public static void myPage() {

		// 사용자 입력받기
		Scanner input = new Scanner(System.in);
		int menuInput;
		User user = new User();
		int CUID = User.getCUID();
		menuTitle("# mypage");

		do {
			System.out.println("                                          # 1. 위시리스트");
			System.out.println("                                          # 2. 내가 쓴 글");
			System.out.println("                                          # 3. 회원 탈퇴");
			System.out.println("                                          # 0. menu로 돌아가기");
			System.out.print("                                     ▶          ");

			menuInput = input.nextInt();
		}while(menuInput !=1 && menuInput != 2 && menuInput != 3 && menuInput != 0);

		// 마이페이지 메뉴 선택 분기처리
		switch (menuInput)
		{
			case 1:
			{

				// 위시리스트 출력
				myWishlist();
				break;
			}
			case 2:
			{
				myComment();
				break;
			}
			case 3:
			{

				user.user_delete(CUID);
				// 회원탈퇴
				break;
			}
			case 0:
			{
				Menu.userMenu(null);
				// 마이페이지로 돌아가기
				break;
			}
		}
	} // myPage end

	public static void myWishlist() {

		// 사용자 입력받기
		Scanner input = new Scanner(System.in);
		int menuInput;
		User user = new User();
		int CUID = User.getCUID();
		menuTitle("# wishlist");
		Wishlist wishlist = new Wishlist();

		do {
			System.out.println("                                          # 1. 조회하기");
			System.out.println("                                          # 2. 삭제하기");
			System.out.println("                                          # 0. My Page로 돌아가기");
			System.out.print("                                     ▶          ");

			menuInput = input.nextInt();
		}while(menuInput !=1 && menuInput != 2&& menuInput != 0);

		// 마이페이지 메뉴 선택 분기처리
		switch (menuInput)
		{
			case 1:
			{
				wishlist.findAll(CUID);
				int answer;
				System.out.println("                                          # 돌아가기 (0)");
				do {
					System.out.print("                                     ▶          ");
					answer = input.nextInt();
					if(answer == 0) {
						myWishlist();
					}
					else {
						System.out.println();
						System.out.println("                                          잘못된 입력입니다 :(");
					}
				}while(answer!=0);

				break;
			}// 조회하기   번호받아 해당 캠핑장 디테일페이지로 이동


			case 2:
			{
				wishlist.findAll(CUID);
				wishlist.delete(CUID);
				int answer;
				System.out.println("                                          # 돌아가기 (0)");
				do {
					System.out.print("                                     ▶          ");
					answer = input.nextInt();
					if(answer == 0) {
						myWishlist();
					}
					else {
						System.out.println();
						System.out.println("                                          잘못된 입력입니다 :(");
					}
				}while(answer!=0);
				break;
			}   // 삭제하기  번호 받아 삭제

			case 0:
			{

				myPage();
				// 마이페이지로 돌아가기
				break;
			}
		}
	} // myWishlist end


	public static void myComment() {

		// 사용자 입력받기
		Scanner input = new Scanner(System.in);
		int menuInput;
		User user = new User();
		int CUID = User.getCUID();
		menuTitle("# comment");
		Comment comment = new Comment();

		do {
			System.out.println("                                          # 1. 조회하기");
			System.out.println("                                          # 2. 수정하기");
			System.out.println("                                          # 3. 삭제하기");
			System.out.println("                                          # 0. My Page로 돌아가기");
			System.out.print("                                     ▶          ");

			menuInput = input.nextInt();
		}while(menuInput !=1 && menuInput != 2 && menuInput != 3 && menuInput != 0);

		// 마이페이지 메뉴 선택 분기처리
		switch (menuInput)
		{
			case 1:
			{
				comment.findAll(CUID);
				int answer;
				System.out.println("                                          # 돌아가기 (0)");
				do {
					System.out.print("                                     ▶          ");
					answer = input.nextInt();
					if(answer == 0) {
						myComment();
					}
					else {
						System.out.println();
						System.out.println("                                          잘못된 입력입니다 :(");
					}
				}while(answer!=0);
				break;
			}// 조회하기   번호받아 해당 캠핑장 디테일페이지로 이동

			case 2:
			{
				comment.findAll(CUID);
				comment.update(CUID);
				int answer;
				System.out.println("                                          # 돌아가기 (0)");
				do {
					System.out.print("                                     ▶          ");
					answer = input.nextInt();
					if(answer == 0) {
						myComment();
					}
					else {
						System.out.println();
						System.out.println("                                          잘못된 입력입니다 :(");
					}
				}while(answer!=0);
				break;
			}	// 수정하기  번호 받아 수정

			case 3:
			{
				comment.findAll(CUID);
				comment.delete(CUID);
				int answer;
				System.out.println("                                          # 돌아가기 (0)");
				do {
					System.out.print("                                     ▶          ");
					answer = input.nextInt();
					if(answer == 0) {
						myComment();
					}
					else {
						System.out.println();
						System.out.println("                                          잘못된 입력입니다 :(");
					}
				}while(answer!=0);
				break;
			}   // 삭제하기  번호 받아 삭제

			case 0:
			{

				myPage();
				// 마이페이지로 돌아가기
				break;
			}
		}
	} // myComment end


	public static void ClearTerm() {
		for(int i = 0; i<50; i++) {
			System.out.println();
		}
	}


}