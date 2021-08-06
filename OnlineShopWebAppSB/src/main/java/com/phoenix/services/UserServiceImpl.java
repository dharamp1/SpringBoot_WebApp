package com.phoenix.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoenix.entities.User;
import com.phoenix.exceptions.UserNotFoundException;
/*
 * @author dharmaraj.pawale@stl.tech
 * @version 1.0
 * @creation_date 2-Aug-2021
 * @copyright Sterlite Technologies Ltd.
 * @description Service Interface Implementor for User in Business Layer
 * 
 */
import com.phoenix.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User findByUsername(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		/*
		 * Optional<User> op = userRepo.findById(username); if(op.isPresent()) return
		 * op.get(); else throw new UserNotFoundException("Sorry! User "+ username
		 * +" is not found");
		 */
	
		return userRepo.findById(username)
				.orElseThrow(()->new UserNotFoundException("Sorry! User "+ username+" not found"));
	
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		Optional<User> op = userRepo.findById(user.getUsername());
		if(op.isPresent()) {
			userRepo.save(user);
		}else
			System.out.println("Sorry! user not found");
	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		Optional<User> op = userRepo.findById(user.getUsername());
		if(op.isPresent()) {
			userRepo.delete(user);
		}else
			System.out.println("Sorry! user not found");
	}

}
