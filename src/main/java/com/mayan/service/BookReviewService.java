package com.mayan.service;

import java.util.List;

import javax.annotation.Resource;

import com.mayan.dao.BookReviewDao;
import com.mayan.entity.BookReview;

public class BookReviewService {
	@Resource
	private BookReviewDao bookReviewDao;
	public BookReview getBookReviewById(int reviewID){
		BookReview bookReview = bookReviewDao.getBookReviewById(reviewID);
		return bookReview;
	}
	public List<BookReview> getBookReviewByTitle(String title){
		List<BookReview> list = bookReviewDao.getBookReviewByTitle(title);
		return list;
	}
	public List<BookReview> getBookReviewByUserID(int userID){
		List<BookReview> list = bookReviewDao.getBookReviewByUserID(userID);
		return list;
	}
	public List<BookReview> getBookReviewByBookName(String bookName){
		List<BookReview> list = bookReviewDao.getBookReviewByBookName(bookName);
		return list;
	}
	public void deleteByID(int reviewID){
		bookReviewDao.deleteByID(reviewID);
	}
	public void updateByID(BookReview bookReview){
		bookReviewDao.updateByID(bookReview);
	}
	public void writeReview(BookReview bookReview){
		bookReviewDao.writeReview(bookReview);
	}

}
