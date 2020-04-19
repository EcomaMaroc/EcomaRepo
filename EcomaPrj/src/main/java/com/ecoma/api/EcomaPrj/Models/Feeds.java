package com.ecoma.api.EcomaPrj.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feeds")
public class Feeds {
	@Id
	private Long id;
	private Long personId;
	private String title;
	private String content;
	private Long likes;
	public Feeds() {}
	
	public Feeds(Long id, Long personId, String title, String content, Long likes) {
		super();
		this.id = id;
		this.personId = personId;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getLikes() {
		return likes;
	}
	public void setLikes(Long likes) {
		this.likes = likes;
	}
	
	
	@Override
	public String toString() {
		return "Feeds [id=" + id + ", person=" + personId + ", title=" + title + ", content=" + content + ", likes="
				+ likes + "]";
	}
	
}
