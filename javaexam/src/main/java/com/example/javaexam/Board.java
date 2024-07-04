package com.example.javaexam;

public class Board {

	//variable
	
	String title;
	
	String content;

	//setter method
	public void setTitle(String title) {
		this.title=title;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
	//getter method

	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	
	//constructor
	public Board() {
		
	}
	public Board(String title, String content) {
		this.title=title;
		this.content=content;
	}
	
}
