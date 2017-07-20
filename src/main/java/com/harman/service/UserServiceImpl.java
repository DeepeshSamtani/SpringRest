package com.harman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harman.dao.UserDao;
import com.harman.model.User;

@Service
public class UserServiceImpl implements UserService {

	UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public List<User> getlistUser() {
		return userDao.getlistUser();
	}
	@Transactional
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}
	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
	@Transactional
	public User findByUser(int id) {
		return userDao.findByUser(id);
	}

}
