package com.h2kinfosys.java.exception.userdefinedException;

public class MyOwnException extends Exception {
	private String myException;
	
	public MyOwnException(String myException) {
		this.myException = myException;
	}
	
	@Override
	public String toString() {
		return "User Defined Exception "+ myException;
	}
}