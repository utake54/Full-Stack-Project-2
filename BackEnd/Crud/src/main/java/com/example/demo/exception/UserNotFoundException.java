package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {


public UserNotFoundException(Long id) {
	super("this id is not present" +id);
}
}
