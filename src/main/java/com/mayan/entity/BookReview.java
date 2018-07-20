package com.mayan.entity;
/**
 * 读后感
 * @author mayan
 *
 */
public class BookReview {
	private int reviewID;
	private String content;//读后感内容
	private String title;//读后感标题
	public int getReviewID() {
		return reviewID;
	}
	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
