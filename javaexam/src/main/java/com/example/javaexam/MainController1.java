package com.example.javaexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController1 {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/board")
	public String board() {
		return "board";
	}
	
	
	@PostMapping("/board")
	public String boarddata(@RequestParam ("title") String bti,
							@RequestParam ("content") String bcon) {
		MainService1 mainService = new MainService1();
		mainService.servicecreate(bti,bcon);
		
		return "index";
	}
}
