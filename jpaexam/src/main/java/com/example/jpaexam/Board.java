package com.example.jpaexam;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Board {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer bid;
	private String btitle;
	private String bcontent;

}
