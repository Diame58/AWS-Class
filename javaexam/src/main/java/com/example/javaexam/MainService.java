package com.example.javaexam;

import org.springframework.stereotype.Service;


@Service
//@RequiredArgsConstructor
public class MainService {
	
	private final MainRepository mainRepository;
	
	
	//@Autowired
	//private MainRepository mainRepository;

	public void servicecreate(String id, String pw) {
		
		System.out.println("서비스로 넘어온 id = " + id);
		System.out.println("서비스로 넘어온 pw = " + pw);
		
		//MainRepository mainRepository =new MainRepository();
		
		mainRepository.repositorycreate(id,pw);
		
	}
}
