package com.mybook.service;

import java.util.List;

import com.mybook.domain.Book;

public interface BookService {
	
	public List<Book>searchAllBooks();
	
	public List<Book>searchByUserId(Integer id);

}
