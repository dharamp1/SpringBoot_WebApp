package com.phoenix.exceptions;
/*
 * @author dharmaraj.pawale@stl.tech
 * @version 1.0
 * @creation_date 2-Aug-2021
 * @copyright Sterlite Technologies Ltd.
 * 
 * 
 */
public class UserNotFoundException extends Exception {
	
	private String message;

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserNotFoundException [message=" + message + "]";
	}	
}
