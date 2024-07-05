package com.example.jpaexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardReposiroty;
	
	public void servicecreate(String ti, String con) {
		System.out.println(ti);
		System.out.println(con);
	}
		
	public void servicecreate(Board board) {
		boardReposiroty.save(board);
		
	}
	
}
