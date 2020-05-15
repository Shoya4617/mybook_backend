package com.mybook.domain;

public class RegisterBookInfo {
	
	private Integer bookId;
	private String userId;
	private VolumeInfo volumeInfo;
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
	public VolumeInfo getVolumeInfo() {
		return volumeInfo;
	}
	public void setVolumeInfo(VolumeInfo volumeInfo) {
		this.volumeInfo = volumeInfo;
	}
	@Override
	public String toString() {
		return "RegisterBookInfo [bookId=" + bookId + ", userId=" + userId + ", volumeInfo=" + volumeInfo + "]";
	}

}
