package com.java.zumair.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.zumair.demo.exception.ResourceNotFoundException;
import com.java.zumair.demo.model.User;
import com.java.zumair.demo.payloads.UserDto;
import com.java.zumair.demo.repository.UserRepo;
import com.java.zumair.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo irepo;
	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto createUser(UserDto userdto) {
          User user=this.dtoToUser(userdto);
         User save= irepo.save(user);
		return this.userToDto(save);
	} 

	@Override
	public UserDto updateUser(UserDto userdto, int id) {
		  User user=irepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","id",id));
	      user.setName(userdto.getName());
	      user.setAbout(userdto.getAbout());
	      user.setPassword(userdto.getPassword());
	      user.setEmail(userdto.getEmail());
	      User update=irepo.save(user);
	      UserDto udto=this.userToDto(update);
			return udto;		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}
	
	public User dtoToUser (UserDto userdto) {
		User user=new User();
		user.setId(userdto.getId());
		user.setName(userdto.getName());
		user.setEmail(userdto.getAbout());
		user.setPassword(userdto.getPassword());
		user.setAbout(userdto.getAbout());
		return user;
		
	}
	
	public UserDto userToDto (User user) {
		UserDto userdto=new UserDto();
		userdto.setId(user.getId());
		userdto.setName(user.getName());
		userdto.setEmail(user.getAbout());
		userdto.setPassword(user.getPassword());
		userdto.setAbout(user.getAbout());
		return null;
		
	}

}
