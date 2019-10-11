package com.board.control;

import java.util.List;
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
			System.out.println("1.게시글 작성 2.게시글 리스트 3.한건 조회 4.수정  6.수정 7.삭제  8.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getEmpList();
			} else if (menu == 3) {
				getBoard();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {

			} else if (menu == 6) {

			} else if (menu == 7) {

			} else if (menu == 8) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}
	public void updateBoard() {
		System.out.println("변경할 글 번호:");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("제목 변경: ");
		String title = sc.nextLine();
		System.out.println("내용 변경: ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		
		service.updateBoard(board);
		
	}

	public void getEmpList() {
		System.out.println("게시글을 조회합니다.");
		List<BoardDB> brd = service.getEmpList();
		for (BoardDB BoardDB : brd) {
			System.out.println(BoardDB);
		}

	}

	public void getBoard() {
		System.out.println("조회할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("-------------[원본글]-----------------");
		BoardDB board = service.getBoard(boardNo);
		if (board != null && board.getBoardNo() != 0) {
			System.out.println("제목 :" + board.getTitle());
			System.out.println("내용 :" + board.getContent());
			System.out.println("작성자 :" + board.getWriter());
			System.out.println("작성일자 :" + board.getCreationdate());
			// --- 댓글
			List<BoardDB> list = service.getReply(boardNo);
			if (list.size()>0 ) {
				System.out.println("=================[댓글]===============");
				for (BoardDB brd : list) {
					System.out.println("-> " + brd.getBoardNo() + "|" + brd.getContent() + "|" + brd.getCreationdate());

				}
				System.out.println("---------------------------------------------");
			} else {
				System.out.println("[댓글]이 없습니다.");
			}
			System.out.println("1. 댓글작성 2. 이전메뉴");
			int subMenu = 0;
			subMenu = sc.nextInt();
			sc.nextLine();
			if (subMenu == 1) {
				System.out.println("댓글 입력:");
				String reply = sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setContent(reply);
				board1.setOrigNo(boardNo);
				board1.setWriter(loginId);
				service.insertReply(board1);
			} else {
				return;
			}
		} else {

			System.out.println("없는 글 번호입니다.");
			return;
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
