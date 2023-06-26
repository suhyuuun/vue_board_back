package com.board.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

	private int idx;
	private String group;
	private String title;
	private String contents;
	private Date create_date;
	private Date update_date;
	
}
