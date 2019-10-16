package Practice14;

import java.util.List;

public interface BoardService {

	public String loginCheck(String id, String passwd);

	public void insertBoard(Board board);

	public List<Board> getBoardList();

	public void getBoard(int boardNo);

	public List<Board> getReply(int boardNo);

	public void insertReply(Board board);

	public void deleteReply(Board board);

	public void updateBoard(Board board);

	public void deleteBoard(Board board);

}
