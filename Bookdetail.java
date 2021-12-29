package com.example.Bookdetails.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookdetail")
public class Bookdetail {

	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	
	
	private long id;
	
	@Column(name = "bookname")
	private String bookname;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "price")
	private int price;
	
	public Bookdetail() {
		
		
		
	}
	public Bookdetail(long id, String bookname, String author, int price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
