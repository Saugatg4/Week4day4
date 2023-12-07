package com.skillstorm.thurs;

public class InvalidSizeException extends IllegalArgumentException{

	public InvalidSizeException() {
		super("Invalid size: Size must be a positive number.");

	}

	public InvalidSizeException(String message) {
		super(message);

	}
}
