package com.phoenix.services;

import java.util.List;

import com.phoenix.entities.User;
import com.phoenix.exceptions.UserNotFoundException;
/*
 * @author dharmaraj.pawale@stl.tech
 * @version 1.0
 * @creation_date 2-Aug-2021
 * @copyright Sterlite Technologies Ltd.
 * @description Service Interface for User in Business Layer
 * 
 */
public interface UserService {
	
	User findByUsername(String username) throws UserNotFoundException;
	List<User> findAllUsers();
	void add(User user);
	void edit(User user);
	void remove(User user);

}
