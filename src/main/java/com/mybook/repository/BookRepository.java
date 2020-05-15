package com.mybook.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mybook.domain.Book;

@Mapper
public interface BookRepository {
	
	@Select("SELECT * FROM books")
	@Results(id="book" , value = {
			@Result(column = "book_id", property="bookId"),
			@Result(column = "user_id", property="userId"),
			@Result(column = "isbn_id", property="isbnId"),
			@Result(column = "category_id", property="categoryId"),
			@Result(column = "title", property="title"),
			@Result(column = "author", property="author"),
			@Result(column = "published_date", property="publishedDate"),
			@Result(column = "description", property="description"),
			@Result(column = "page_count", property="pageCount"),
			@Result(column = "thumbnail_path", property="thumbnailPath"),
			@Result(column = "status", property="status"),
			@Result(column = "comment", property="comment"),})
	List<Book>findAll();
	
	@Select("SELECT * FROM books WHERE user_id = #{userId} AND status = 0 ORDER BY book_id")
	@ResultMap("book")
	List<Book>findByUserId(String id);
	
	@Select("SELECT * FROM books WHERE book_id = #{bookId} AND status = 0 ORDER BY book_id")
	@ResultMap("book")
	Book findByBookId(Integer id);
	
	@Insert("INSERT INTO books (user_id,isbn_id,category_id,title,author,published_date,"
			+ "description,page_count,thumbnail_path,status,comment)VALUES(#{userId},#{isbnId},"
			+ "#{categoryId},#{title},#{author},#{publishedDate},#{description},#{pageCount},"
			+ "#{thumbnailPath},#{status},#{comment})")
	@Options(useGeneratedKeys = true, keyProperty = "bookId")
	@ResultMap("book")
	Integer insert(Book book);
	
	@Update("UPDATE books SET user_id=#{userId},isbn_id=#{isbnId},category_id=#{categoryId},title=#{title},author=#{author},"
			+ "published_date=#{publishedDate},description=#{description},page_count=#{pageCount},thumbnail_path=#{thumbnailPath},"
			+ "status=#{status},comment=#{comment} WHERE book_id = #{bookId}")
	@ResultMap("book")
	void update(Book book);
}
