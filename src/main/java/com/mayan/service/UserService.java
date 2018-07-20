package com.mayan.service;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;

import com.mayan.dao.UserDao;
import com.mayan.entity.User;

public class UserService {
	@Resource
	private UserDao userDao;
	public User getUser(@Param("userName")String userName,@Param("password")String password){
		User user = userDao.getUser(userName, password);
		return user;
	}
	public void updateInfoByID(User user){
		userDao.updateInfoByID(user);
	}
	public void deleteByID(@Param("userID")int userID){
		userDao.deleteByID(userID);
	}
	public void upUserByID(@Param("userID")int userID){
		userDao.upUserByID(userID);
	}
	public void downUserByID(@Param("userID")int userID){
		userDao.downUserByID(userID);
	}
	public User getUserByName(String userName){
		User user = userDao.getUserByName(userName);
		return user;
	}

}
