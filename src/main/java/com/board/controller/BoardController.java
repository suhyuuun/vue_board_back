package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.dto.BoardDTO;
import com.board.service.BoardService;

@CrossOrigin(origins= {"http://localhost:8080"})
@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//글 리스트
	@GetMapping("/list")
	public List<BoardDTO> listMethod(){
		List<BoardDTO> boardList = boardService.listProcess();
		return boardList;
	}
	
	//게시판 종류(자유게시판, 공지사항)
	@GetMapping("/category/{group}")
	public List<BoardDTO> GroupMethod(@PathVariable("group") String group){
		List<BoardDTO> boardList = boardService.groupProcess(group);
		return boardList;
	}

	//글 보기
	@GetMapping("/view/{idx}")
	public List<BoardDTO> viewMethod(@PathVariable("idx")int idx){
		List<BoardDTO> view = boardService.viewProcess(idx);
		return view;
	}
		
	//글 저장
	@PostMapping("/write")
	public void writeMethod(@RequestBody BoardDTO dto) {
		boardService.insertProcess(dto);
	}
	
	//글 수정
	@PutMapping("/update")
	public void updateMethod(@RequestBody BoardDTO dto) {
		boardService.updateProcess(dto);
	}
	
	//글 삭제
	@DeleteMapping("/delete/{idx}")
	public void deleteMethod(@PathVariable("idx")int idx) {
		boardService.deleteProcess(idx);
	}



	
	

}
