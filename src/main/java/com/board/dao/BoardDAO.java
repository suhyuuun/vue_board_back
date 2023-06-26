package com.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.board.dto.BoardDTO;

@Repository
@Mapper
public interface BoardDAO {

	//글 리스트
	public List<BoardDTO> list();
	
	//게시판 종류
	public List<BoardDTO> group(String group);
	
	//글 보기
	public List<BoardDTO> view(int idx);
	
	//글 저장
	public void insert(BoardDTO dto);
	
	//글 수정
	public void update(BoardDTO dto);
	
	//글 삭제
	public void delete(int idx);


}
