/*
package com.example.javaexam;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	MainService mainService;
	
	@PostMapping("/signup")//클라이언트쪽에서 서버쪽으로 전달
	public String signupdata(@RequestParam ("id") String id,
							 @RequestParam ("pw") String pw
			) {
		
		System.out.println("컨트롤러로 넘어온 id = " + id);
		System.out.println("컨트롤러로 넘어온 pw = " + pw);
		
		//MainService mainService = new MainService();
		
		mainService.servicecreate(id,pw);
		return "index";
	}

	@GetMapping("/boardhome")
	public String boardhome() {
		return "boardhome";
	}
	
	@PostMapping("/boardhome")
	public String boardhome(@RequestParam ("title") String title,
						@RequestParam ("content") String content
			) {
		System.out.println(title);
		System.out.println(content);
		
		return "index";
	}

}
*/
