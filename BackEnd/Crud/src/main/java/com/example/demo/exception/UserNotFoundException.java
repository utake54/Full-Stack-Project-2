package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public UserNotFoundException(Long id) {
	super("this id is not present" +id);
}
}
