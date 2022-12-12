package com.java.zumair.demo.exception;

public class UsernameNotFoundExpection extends Exception  {
private String message;
public UsernameNotFoundExpection (String message) { this.message=message;}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
	

}
