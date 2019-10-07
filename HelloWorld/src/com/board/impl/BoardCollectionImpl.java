package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);

	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for (Board brd : boards) {
			if (brd.getBoardNo() == boardNo) {
				boardTemp = brd;
			}
		}
		return boardTemp;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> listTemp = new ArrayList<>();
		for (Board brd : boards) {
			listTemp.add(brd);
		}
		return listTemp;
	}

	@Override
	public void delBoard(int boardNo, List<Board> boards) {
		try {
			for (Board brd : boards) {
				if (brd.getBoardNo() == boardNo) {
					boards.remove(brd);
				}

			}
		} catch (Exception e) {
			System.out.println("다시 입력해주세요");

		}

	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for (Board brd : boards) {
			if (brd.getBoardNo() == board.getBoardNo()) {
				brd.setTitle(board.getTitle());
				brd.setContents(board.getContents());
				brd.setWriter(board.getWriter());
			}
		}

	}

}
