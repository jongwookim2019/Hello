package Practice14;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
