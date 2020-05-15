package com.mybook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybook.domain.Book;
import com.mybook.domain.ImageLinks;
import com.mybook.domain.IndustryIdentifiers;
import com.mybook.domain.RegisterBookInfo;
import com.mybook.domain.VolumeInfo;
import com.mybook.repository.BookRepository;

@RestController
@RequestMapping("")
public class BookApiController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping("/search-all")
	public List<Book> searchAll() {
		
		List<Book>bookList = bookRepository.findAll();
		
		return bookList;
	}
	
	@GetMapping("/search-by-user-id/{id}")
	@CrossOrigin
	public List<RegisterBookInfo> searchByUserId(@PathVariable("id") String id) {
		
		List<Book>bookList = bookRepository.findByUserId(id);
		List<RegisterBookInfo> registerbookInfoList = new ArrayList<>();
		bookList.forEach(book -> {
			RegisterBookInfo registerBookInfo = new RegisterBookInfo();
			VolumeInfo vi = new VolumeInfo();
			vi.setTitle(book.getTitle());
			List<String>authorsList = new ArrayList<>();
			authorsList.add(book.getAuthor());
			vi.setAuthors(authorsList);
			vi.setPublishedDate(book.getPublishedDate());
			vi.setDescription(book.getDescription());
			ImageLinks il = new ImageLinks();
			il.setThumbnail(book.getThumbnailPath());
			vi.setImageLinks(il);
			vi.setPageCount(book.getPageCount());
			List<IndustryIdentifiers>iiList = new ArrayList<>();
			IndustryIdentifiers ii = new IndustryIdentifiers();
			ii.setIdentifier(book.getIsbnId());
			iiList.add(ii);
			vi.setIndustryIdentifiers(iiList);
			
			registerBookInfo.setBookId(book.getBookId());
			registerBookInfo.setUserId(book.getUserId());
			registerBookInfo.setVolumeInfo(vi);
			registerbookInfoList.add(registerBookInfo);
		});
		
		return registerbookInfoList;
	}
	
	@RequestMapping(value="/save-book",method = {RequestMethod.POST})
//	@ResponseBody
	@CrossOrigin
	public Book receiveData(@RequestBody RegisterBookInfo registerBookInfo) {
		Book book = new Book();
		book.setUserId(registerBookInfo.getUserId());
		if(registerBookInfo.getVolumeInfo().getIndustryIdentifiers()==null) {
			book.setIsbnId("none");
		}else {
			book.setIsbnId(registerBookInfo.getVolumeInfo().getIndustryIdentifiers().get(0).getIdentifier());
		}
		book.setCategoryId(0);
		book.setTitle(registerBookInfo.getVolumeInfo().getTitle());
		if(registerBookInfo.getVolumeInfo().getAuthors()==null) {
			book.setAuthor("none");
		}else {
			book.setAuthor(registerBookInfo.getVolumeInfo().getAuthors().get(0));
		}
		book.setPublishedDate(registerBookInfo.getVolumeInfo().getPublishedDate());
		book.setDescription(registerBookInfo.getVolumeInfo().getDescription());
		book.setPageCount(registerBookInfo.getVolumeInfo().getPageCount());
		book.setThumbnailPath(registerBookInfo.getVolumeInfo().getImageLinks().getThumbnail());
		book.setStatus(0);
		book.setComment(null);
		bookRepository.insert(book);
		System.out.println("登録完了→"+book);
		return book;
	}
	
	@GetMapping("/delete/{id}")
	@CrossOrigin
	public Book delete(@PathVariable("id") Integer id) {
		Book book = bookRepository.findByBookId(id);
		book.setStatus(9);
		bookRepository.update(book);
		System.out.println("削除完了→"+book);
		return book;
	}

}
