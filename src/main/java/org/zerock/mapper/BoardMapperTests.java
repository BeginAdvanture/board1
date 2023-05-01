package org.zerock.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	
	@Autowired
	@Setter(onMethod_ = { @Autowired })
	private BoardMapper mapper;
	
	private static final org.mybatis.logging.Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
	
	
	@Test
	public void testEnroll() {
		BoardVO vo = new BoardVO();
		vo.setTitle("mapper test");
		vo.setContent("mapper test");
		vo.setWriter("mapper test");
		mapper.enroll(vo);
	}


	
	////////////////

	
	/*
	
		
			
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("������");
		board.setContent("�ȳ��֤�");
		board.setWriter("������");
		
		boardMapper.insert(board);
	}
	/*
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("������ 1");
		board.setContent("�ȳ��֤� 1");
		board.setWriter("������ 1 ");
		
		boardMapper.insertSelectKey(board);
	}
	@Test
	public void testRead() {
		BoardVO board = boardMapper.read(5L);

	}
	
	
	@Test
	public void testDelete() {
		
		log.info(boardMapper.delete(3L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		
		board.setBno(5L);
		board.setTitle("�Ƹ���");
		board.setContent("�̷縶�ǽ�");
		board.setWriter("��������");
		
		int count = boardMapper.update(board);
		log.info(count);
	}
	*/
	
}
