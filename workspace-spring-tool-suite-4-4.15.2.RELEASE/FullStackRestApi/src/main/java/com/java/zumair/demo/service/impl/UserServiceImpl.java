package com.java.zumair.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.zumair.demo.entities.User;
import com.java.zumair.demo.exception.ResourceNotFoundException;
import com.java.zumair.demo.payloads.TodoDto;
import com.java.zumair.demo.payloads.UserDto;
import com.java.zumair.demo.repository.UserRepository;
import com.java.zumair.demo.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository urepo;
	@Autowired
	ModelMapper modelmapper;

	@Override
	public UserDto createuser(UserDto userdto) {
		// TODO Auto-generated method stub
		User user = this.modelmapper.map(userdto, User.class);
		User saveduser = urepo.save(user);
		return this.modelmapper.map(saveduser, UserDto.class);
	}

//	@Override
//	public UserDto getUserById(int userId) throws ResourceNotFoundException  {
//		// TODO Auto-generated method stub
//		Optional<User> user=urepo.findById(userId);
//		user.orElseThrow(()-> new ResourceNotFoundException("User", "ID",userId));
//		return this.modelmapper.map(user, UserDto.class);
//	}
	@Override
	public UserDto getUserById(int userId) throws ResourceNotFoundException  {
		// TODO Auto-generated method stub
		Optional<User> user=urepo.findById(userId);
		user.orElseThrow(()-> new ResourceNotFoundException("User", "ID",userId));
		UserDto userdto=this.modelmapper.map(user,UserDto.class);
		userdto.setTodos(user.get().getTodos().stream().map(t->this.modelmapper.map(t, TodoDto.class)).collect(Collectors.toList()));
		return userdto;
	}
	
	public List<UserDto> getAllUsers(){
		return urepo.findAll().stream().map(u->this.modelmapper.map(u, UserDto.class)).collect(Collectors.toList());
	}

	@Override
	public UserDto updateUser(UserDto userdto, int userId) {
		// TODO Auto-generated method stub
		User user=urepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "ID",userId));
		user.setName(userdto.getName());
		user.setAge(userdto.getAge());
		user.setEmail(userdto.getEmail());
		user.setMobile(userdto.getMobile());
		user.setPassword(userdto.getPassword());
		return this.modelmapper.map(urepo.save(user),UserDto.class);
	}

	@Override
	public void  deleteById(int id) {
		// TODO Auto-generated method stub
		User user=urepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID",id));
		urepo.deleteById(id);
		
	}

}
