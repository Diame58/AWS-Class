package com.example.javaexam;

import org.springframework.stereotype.Repository;

@Repository
public class MainRepository {

	public void repositorycreate(String id, String pw) {
		System.out.println("레파지토리로 넘어온 id = " + id);
		System.out.println("레파지토리로 넘어온 pw = " + pw);
	}
}
