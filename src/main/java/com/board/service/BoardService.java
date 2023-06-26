package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	//글 리스트
	public List<BoardDTO> listProcess(){
		return dao.list();
	}
	
	//게시판 종류
	public List<BoardDTO> groupProcess(String group){
		return dao.group(group);
	}
	
	//글 보기
	public List<BoardDTO> viewProcess(int idx){
		return dao.view(idx);
	}
	
	//글 저장
	public void insertProcess(BoardDTO dto) {
		dao.insert(dto);
	}

	//글 수정
	public void updateProcess(BoardDTO dto) {
		dao.update(dto);
	}
	
	//글 삭제
	public void deleteProcess(int idx) {
		dao.delete(idx);
	}
}
