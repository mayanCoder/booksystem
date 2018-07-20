package com.mayan.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * user实体类
 * author mayan
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = true, unique = true)
	private String profile;
	@Column(nullable = false)
	private String regTime;
	@Column(nullable = false)
	private String sex;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public String getEmail() {
		return email;
	}

	public String getProfile() {
		return profile;
	}

	public String getRegTime() {
		return regTime;
	}

	public String getSex() {
		return sex;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}

