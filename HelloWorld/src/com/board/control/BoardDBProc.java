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
			System.out.println("1.게시글 작성 2.게시글 리스트 3.한건 조회 4.수정  5.삭제  6.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoardList();
			} else if (menu == 3) {
				getBoard();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				deleteBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}
	public void deleteBoard() {
		System.out.println("삭제할 글 번호:");
		int boardNo = sc.nextInt(); sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setWriter(loginId);
		service.deleteBoard(board);
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
		board.setWriter(loginId);
		service.updateBoard(board);
		
	}

	public void getBoardList() {
		System.out.println("-------[전체글]-------");
		System.out.println("==============================================");
		System.out.println("글번호 |  제목   |    내용     |  작성자   | 작성일자 ");
		System.out.println("==============================================");
		List<BoardDB> list = service.getBoardList();
		for (BoardDB b : list) {
			System.out.println(b.getBoardNo() + " | " + b.getTitle() + " | " + b.getContent() + " | " + b.getWriter()
					+ " | " + b.getCreationdate());
		}
		System.out.println("==============================================");
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
			System.out.println("1. 댓글작성 2. 댓글삭제  3. 이전메뉴");
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
			} else if (subMenu == 2){
				System.out.println("댓글 삭제:");
				int boardNo1 = sc.nextInt(); sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setWriter(loginId);
				board1.setBoardNo(boardNo1);
				service.deleteReply(board1);
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
