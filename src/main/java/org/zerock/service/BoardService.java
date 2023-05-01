package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
}
