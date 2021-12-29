package com.example.Bookdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Bookdetails.domain.Bookdetail;


@Repository
public interface BookdetailRepository extends JpaRepository <Bookdetail, Long> {
	
	 
    @Query("select bk from Bookdetail bk where bk.bookname=?1")
    List<Bookdetail> findUserByName(String bookname);
    
 
}
