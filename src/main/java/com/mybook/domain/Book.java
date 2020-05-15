package com.mybook.domain;

public class Book {
	private Integer bookId;
	private String userId;
	private String isbnId;
	private Integer categoryId;
	private String title;
	private String author;
	private String publishedDate;
	private String description;
	private Integer pageCount;
	private String thumbnailPath;
	private Integer status;
	private String comment;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIsbnId() {
		return isbnId;
	}
	public void setIsbnId(String isbnId) {
		this.isbnId = isbnId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public String getThumbnailPath() {
		return thumbnailPath;
	}
	public void setThumbnailPath(String thumbnailPath) {
		this.thumbnailPath = thumbnailPath;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", userId=" + userId + ", isbnId=" + isbnId + ", categoryId=" + categoryId
				+ ", title=" + title + ", author=" + author + ", publishedDate=" + publishedDate + ", description="
				+ description + ", pageCount=" + pageCount + ", thumbnailPath=" + thumbnailPath + ", status=" + status
				+ ", comment=" + comment + "]";
	}
	
	
	
	
}
