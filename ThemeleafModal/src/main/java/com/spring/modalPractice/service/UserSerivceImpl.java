package com.spring.modalPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.modalPractice.model.User;
import com.spring.modalPractice.repository.UserRepository;
@Service
public class UserSerivceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getOne(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

}
