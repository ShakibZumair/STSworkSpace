//package com.example.demo.service;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.UserEntity;
//import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
//
//
//@Service
//public class UserServiceImpl implements UserService{
//	
//	@Autowired
//	private UserRepository userRepository;
//	@Override
//	public User save(User user) {
//		// TODO Auto-generated method stub
//		UserEntity userEntity=userRepository.findbyEmail(user.getUserName());
//		BeanUtils.copyProperties(user, userEntity);
//		userRepository.save(userEntity);
//
//		return user;
//	}
//
//}
