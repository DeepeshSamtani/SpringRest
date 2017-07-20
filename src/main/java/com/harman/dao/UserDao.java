package com.harman.dao;

import java.util.List;

import com.harman.model.User;

public interface UserDao {
	public List<User> getlistUser();
	public void saveOrUpdate(User user);
	public void deleteUser(int id);
	public User findByUser(int id);
}
