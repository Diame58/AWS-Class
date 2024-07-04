package com.example.javaexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index"; //index.html을 호출한다. html은 생략한다
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	
	@GetMapping("/exam")
	public String exam() {
		return "exam";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
}
