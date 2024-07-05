package com.example.jpaexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	
	
	@PostMapping("/create")
		public String createdata(@RequestParam ("btitle") String ti,
								 @RequestParam ("bcontent") String con) {
			
	
		BoardService boardService = new BoardService();
		boardService.servicecreate(ti,con);
			return "index";
}
	

	
}
