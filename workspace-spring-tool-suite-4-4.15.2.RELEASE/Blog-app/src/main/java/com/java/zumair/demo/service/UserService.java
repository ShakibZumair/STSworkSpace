package com.java.zumair.demo.service;

import java.util.List;

import com.java.zumair.demo.payloads.UserDto;

public interface UserService {
 public List<UserDto> getAllUsers();
 public UserDto getById(int Id);
 public UserDto createUser(UserDto userdto);
 public UserDto updateUser(UserDto userdto, int id);
 public void deleteUser(int id);
 
}
