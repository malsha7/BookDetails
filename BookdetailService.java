package com.example.Bookdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bookdetails.domain.Bookdetail;
import com.example.Bookdetails.repository.BookdetailRepository;

@Service
public class BookdetailService {

	@Autowired
	private BookdetailRepository repo;
	
	public List<Bookdetail> listAll(){
		return repo .findAll();
		
		
	}
	
	public void save(Bookdetail book) {
		repo.save(book);
	}
	
	public Bookdetail get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id ) {
		repo.deleteById(id);
	}
}
