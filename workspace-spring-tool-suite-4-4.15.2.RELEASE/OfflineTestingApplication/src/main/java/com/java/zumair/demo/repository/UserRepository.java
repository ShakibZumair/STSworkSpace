package com.java.zumair.demo.repository;

import java.util.List;

import com.java.zumair.demo.model.User;

public interface UserRepository {
List <User> getAllUsers(String username);
}
