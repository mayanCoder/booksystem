package com.mayan.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.mayan.entity.BookReview;

@Repository
public interface BookReviewDao {

	BookReview getBookReviewById(@Param("reviewID") int reviewID);
	List<BookReview> getBookReviewByTitle(@Param("title") String title);
	List<BookReview> getBookReviewByUserID(@Param("userID") int userID);
	List<BookReview> getBookReviewByBookName(@Param("bookName") String bookName);
	void deleteByID(@Param("reviewID") int reviewID);
	void updateByID(BookReview bookReview);
	void writeReview(BookReview bookReview);
	
}
