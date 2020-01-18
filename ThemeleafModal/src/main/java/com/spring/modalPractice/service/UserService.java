package com.spring.modalPractice.service;

import java.util.List;

import com.spring.modalPractice.model.User;

public interface UserService {
	public User addUser(User user);
	public List<User> getAllUser();
	public User getOne(int id);
}
