package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);

	}

	@Override
	public List<BoardDB> getBoardList() {
		List<BoardDB> list = dao.getBoardList();
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
		// 해당글에 대한 권한 확인.
		if (dao.checkResponsibility(board)) {
			dao.updateBoard(board);
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("해당글에 대한 권한이 없습니다.");
		}

	}

	@Override
	public void deleteBoard(BoardDB board) {
		if (dao.checkResponsibility(board)) { // 권한 체크
			if (!dao.checkForReply(board.getBoardNo())) { // 댓글유무 체크
				dao.deleteBoard(board);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("댓글이 있습니다.");
			}
		} else {
			System.out.println("해당글에 대한 권한이 없습니다.");
		}
	}

	@Override
	public void deleteReply(BoardDB board) {
		if (dao.checkReplyResponsibility(board)) {
			dao.deleteReply(board);
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당글에 대한 권한이 없습니다.");
		}
	}
}
