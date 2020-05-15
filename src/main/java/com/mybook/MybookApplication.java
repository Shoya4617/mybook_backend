package com.mybook;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mybook.repository.BookRepository;

@SpringBootApplication
public class MybookApplication {
	
	@Autowired
	private static BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(MybookApplication.class, args);
		
	}

}
