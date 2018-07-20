package com.mayan.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayan.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	User getUser(@Param("userName") String userName, @Param("password") String password);
	void updateInfoByID(User user);
	void deleteByID(@Param("userID") int userID);
	void upUserByID(@Param("userID") int userID);
	void downUserByID(@Param("userID") int userID);
	User getUserByName(String userName);
}
