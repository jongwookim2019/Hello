package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();
	
	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUserName(id,  passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
		
	}

	@Override
	public List<BoardDB> getEmpList() {
		List<BoardDB> list = dao.getEmpList();
		return list;
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		dao.getBoard(boardNo);
		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.insertReply(board);
		
	}

	@Override
	public void updateBoard(BoardDB board) {
		dao.updateBoard(board);
	}

	@Override
	public void deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		
	}

}
