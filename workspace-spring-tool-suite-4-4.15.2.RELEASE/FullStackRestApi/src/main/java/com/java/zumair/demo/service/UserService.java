package com.java.zumair.demo.service;

import java.util.List;

import com.java.zumair.demo.exception.ResourceNotFoundException;
import com.java.zumair.demo.payloads.UserDto;

public interface UserService {
public UserDto createuser(UserDto userdto);
UserDto getUserById(int userId) throws ResourceNotFoundException;
public List<UserDto> getAllUsers();
UserDto updateUser(UserDto userdto,int userId);
void deleteById(int id);
}
