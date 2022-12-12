package com.java.zumair.demo.service;

import com.java.zumair.demo.exception.UsernameNotFoundExpection;
import com.java.zumair.demo.model.User;

public interface UserService {
public User getUserWithMaxAge();
public User getValidLogin();
boolean isUserValid(String username,String password) throws UsernameNotFoundExpection;
}
