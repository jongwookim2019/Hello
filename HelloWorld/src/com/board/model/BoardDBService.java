package com.board.model;

import java.util.List;

public interface BoardDBService {

	public String loginCheck(String id, String passwd); // 로그인 체크

	public void insertBoard(BoardDB board); // 게시글 작성

	public List<BoardDB> getBoardList(); // 게시글 리스트.

	public BoardDB getBoard(int boardNo);// 한건조회.
	public List<BoardDB> getReply(int boardNo); // 댓글조회

	public void insertReply(BoardDB board); // 댓글 추가
	
	public void deleteReply(BoardDB board); //댓글 삭제

	public void updateBoard(BoardDB board); // 수정

	public void deleteBoard(BoardDB boardNo); // 삭제
	

}
