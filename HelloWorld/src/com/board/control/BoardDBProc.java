package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.Board;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;
	public void execute() {
		loginCheck();
		while (true) {
			int menu = 0;
			System.out.println("메뉴 선택 하세요.");
			System.out.println("1.게시글 작성 2.게시글 리스트 3.한건 조회 4.댓글 조회 5.댓글 추가 6.수정 7.삭제  8.종료");
			menu = sc.nextInt(); sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else if (menu == 6) {

			} else if (menu == 7) {

			} else if (menu == 8) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

	public void loginCheck() {
		while (true) {
			System.out.println("id를 입력:");
			String id = sc.nextLine();
			System.out.println("pass를 입력:");
			String pass = sc.nextLine();
			String name = service.loginCheck(id, pass);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;

			} else {
				System.out.println("아이디와 비밀번호를 다시 입력하세요:");
			}

		}
	}

	public void writeBoard() {
		System.out.println("제목 입력:");
		String title = sc.nextLine();
		System.out.println("내용 입력:");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);

	}

//	public void getBoard() {
//		System.out.println("한건조회");
//		System.out.println("조회할 번호를 입력");
//		int boardNo = sc.nextInt();
//		Board board = service.getBoard(boardNo, boardAry);
//		System.out.println(board);
//	}
}
