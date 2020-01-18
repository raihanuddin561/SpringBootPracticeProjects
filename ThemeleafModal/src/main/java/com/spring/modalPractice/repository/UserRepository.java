package com.spring.modalPractice.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.modalPractice.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findById(int id);

}
