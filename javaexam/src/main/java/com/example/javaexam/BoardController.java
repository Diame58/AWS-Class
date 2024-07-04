package com.example.javaexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

	@GetMapping("/boardlist")
	public String boardlist() {
		return "boardlist";
	}
	
	@PostMapping("/board")
	public String board(@RequestParam ("title") String title,
						@RequestParam ("content") String content
			) {
		System.out.println(title);
		System.out.println(content);
		
		return "index";
	}
	
	
	@GetMapping("/boarddetail/{no}")
	public String boarddetail(@PathVariable("no") String no) {
		System.out.println("넘어온 번호는 "+ no);
		return "redirect:/boardlist";
	}
	
	
}
