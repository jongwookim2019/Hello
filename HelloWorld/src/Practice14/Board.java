package Practice14;

public class Board {
	private int BoardNo;
	private String title;
	private String content;
	private String writer;
	private String creationdate;
	private int origNo;

	public int getBoardNo() {
		return BoardNo;
	}

	public void setBoardNo(int boardNo) {
		BoardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public int getOrigNo() {
		return origNo;
	}

	public void setOrigNo(int origNo) {
		this.origNo = origNo;
	}

}
