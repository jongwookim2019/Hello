package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
//import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
//import com.board.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];
	List<Board> boardAry = new ArrayList<>();
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();

	
	
	public void execute() {
		login_check();
		
		while (true) {
			System.out.println("메뉴 선택 하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.삭제 5.변경 6.종료");
			int menu =0;
			try {
				menu = sc.nextInt(); //error 발생 가능한 곳.
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
				sc.nextLine();
//				e.printStackTrace();
			}
		
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				delBoard();
			} else if (menu == 5) {
				updateBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}

	public void writeBoard() {
		System.out.println("글작성");
		System.out.println("게시글 번호 입력:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목 입력:");
		String title = sc.nextLine();
		System.out.println("내용 입력:");
		String contents = sc.nextLine();
		System.out.println("작성자 입력:");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//
//		}
	}

	public void getBoard() {
		System.out.println("한건조회");
		System.out.println("조회할 번호를 입력");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getBoardNo() + ","+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}
//	List<Board> boardAry = new ArrayList<>();
	public void getBoardList() {
		System.out.println("전체글조회");
		List<Board> resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			if (brd != null) {
				System.out.println(brd);
			}
		}
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getBoardNo() + ","
//						+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}

	public void delBoard() {
		System.out.println("한건삭제");
		System.out.println("삭제할 번호를 입력");
		int boardNo = sc.nextInt();
		service.delBoard(boardNo, boardAry);
		System.out.println(boardNo + ": 번이 삭제되었습니다.");

//			for (int i = 0; i < boardAry.length; i++) {
//				if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//					System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getBoardNo() + ","+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//				}
//			}
	}

	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 제목 :");
		String title = sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		System.out.println("변경할 작성자:");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, content, writer);
		service.updateBoard(board, boardAry);
	}
	public void login_check() {
			while(true) {
				System.out.println("id 입력.");
				String id = sc.nextLine();
				System.out.println("password 입력.");
				String passwd = sc.nextLine();
				
				if(id.equals())
				
			}
	}
}
