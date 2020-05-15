package com.mybook.domain;

import java.util.List;

public class VolumeInfo {
	
	private String title;
	private String subtitle;
	private List<String> authors;
	private String publishedDate;
	private String publisher;
	private String description;
	private ImageLinks imageLinks;
	private String infoLink;
	private Integer pageCount;
	private List<IndustryIdentifiers>industryIdentifiers;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ImageLinks getImageLinks() {
		return imageLinks;
	}
	public void setImageLinks(ImageLinks imageLinks) {
		this.imageLinks = imageLinks;
	}
	public String getInfoLink() {
		return infoLink;
	}
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public List<IndustryIdentifiers> getIndustryIdentifiers() {
		return industryIdentifiers;
	}
	public void setIndustryIdentifiers(List<IndustryIdentifiers> industryIdentifiers) {
		this.industryIdentifiers = industryIdentifiers;
	}
	@Override
	public String toString() {
		return "VolumeInfo [title=" + title + ", subtitle=" + subtitle + ", authors=" + authors + ", publishedDate="
				+ publishedDate + ", publisher=" + publisher + ", description=" + description + ", imageLinks="
				+ imageLinks + ", infoLink=" + infoLink + ", pageCount=" + pageCount + ", industryIdentifiers="
				+ industryIdentifiers + "]";
	}
	
	
	
	
	
}
