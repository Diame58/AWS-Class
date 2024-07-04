package com.example.javaexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/signup") //서버쪽에서 클라이언트쪽으로 전달
	public String signup() {
		return "signup";
	}
	@PostMapping("/signup")//클라이언트쪽에서 서버쪽으로 전달
	public String signupdata(@RequestParam ("id") String id,
							 @RequestParam ("pw") String pw
			) {
		
		System.out.println(id);
		System.out.println(pw);
		return "index";
	}
}
