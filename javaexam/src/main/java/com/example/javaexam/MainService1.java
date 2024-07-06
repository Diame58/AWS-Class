package com.example.javaexam;

import org.springframework.stereotype.Service;

@Service
public class MainService1 {

	public void servicecreate(String bti, String bcon) {
		System.out.println(bti);
		System.out.println(bcon);
	}
}
