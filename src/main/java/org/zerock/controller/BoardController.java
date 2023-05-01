package org.zerock.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
    private static final Logger log = Logger.getLogger(BoardController.class);
    
    @Autowired
    private BoardService bservice;
    
    @GetMapping("/list")
    public void boardListGET(Model model) {
    	log.info("게시판 목록 진입");
    	model.addAttribute("list",bservice.getList());
    }
    
    @GetMapping("/enroll")
    public void boardEnrollGET() {
    	log.info("게시판 등록 페이지 진입 ");
    }
    
    
    @PostMapping("/enroll")
    public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
    	log.info("BoardVo :  " + board);
    	bservice.enroll(board);
    	rttr.addFlashAttribute("result","등록 성공");
    	return "redirect:/board/list";
    }
  
    
    
}
