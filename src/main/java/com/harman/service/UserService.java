package com.harman.service;

import java.util.List;

import com.harman.model.User;

public interface UserService {
	public List<User> getlistUser();
	public void saveOrUpdate(User user);
	public void deleteUser(int id);
	public User findByUser(int id);
}
