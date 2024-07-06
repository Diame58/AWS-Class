package com.example.javaexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

	@GetMapping("/boardlist")
	public String boardlist() {
		return "boardlist";
	}
	
	
	@GetMapping("/boarddetail/{no}")
	public String boarddetail(@PathVariable("no") String no) {
		System.out.println("넘어온 번호는 "+ no);
		return "redirect:/boardlist";
	}
	
	
}
