package com.harman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harman.model.User;
import com.harman.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/user/", method=RequestMethod.GET, headers="Accept=Application/json")
	public @ResponseBody List<User> getListUser(){
		List<User> user = userService.getlistUser();
		return user;
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public @ResponseBody User add(@RequestBody User user){
		userService.saveOrUpdate(user);
		return user;
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public @ResponseBody User update(@PathVariable("id") int id, @RequestBody User user){
		user.setId(id);
		userService.saveOrUpdate(user);
		return user;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public @ResponseBody User delete(@PathVariable("id") int id){
		User user = userService.findByUser(id);
		userService.deleteUser(id);
		return user;
		
	}
}
