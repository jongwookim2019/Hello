package Practice14;

import java.util.List;

public class BoardServiceImpl implements BoardService {
	BoardDAO dao = new BoardDAO();

	@Override
	public String loginCheck(String id, String passwd) {

		return null;
	}

	@Override
	public void insertBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public List<Board> getBoardList() {

		return null;
	}

	@Override
	public void getBoard(int boardNo) {

	}

	@Override
	public List<Board> getReply(int boardNo) {

		return null;
	}

	@Override
	public void insertReply(Board board) {

	}

	@Override
	public void deleteReply(Board board) {

	}

	@Override
	public void updateBoard(Board board) {

	}

	@Override
	public void deleteBoard(Board board) {

	}

}
