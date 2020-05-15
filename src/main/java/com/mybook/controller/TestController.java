package com.mybook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybook.domain.Book;
import com.mybook.repository.BookRepository;

@Controller
@RequestMapping("")
public class TestController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping("text")
	public String test() {
		
		List<Book>bookList = bookRepository.findAll();
		System.out.println(bookList);
		
		return "";
	}

}
