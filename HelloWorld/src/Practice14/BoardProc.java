package Practice14;

import java.util.Scanner;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
	BoardService service = new BoardServiceImpl();

	public void execute() {
//		logincheck();
		while (true) {
			int menu = 0;
			System.out.println("메뉴를 선택 하세요.");
			System.out.println("1.게시글 작성 2. 게시글 리스트 3. 게시글 조회 4. 게시글 수정 5 게시글 삭제 6. 종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
//				getBoardList();
			} else if (menu == 3) {
//				getBoard();
			} else if (menu == 4) {
//				updateBoard();
			} else if (menu == 5) {
//				deleteBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}
	}

	public void writeBoard() {
		System.out.println("제목 입력:");
		String title = sc.nextLine();
		System.out.println("내용 입력:");
		String content = sc.nextLine();
		Board board = new Board();
		board.setTitle(title);
		board.setContent(content);
		service.insertBoard(board);

	}
}
