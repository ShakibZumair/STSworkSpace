package com.example.demo.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.MyUserDetails;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {
    UserRepository urepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//Optional<T>to-generated method stub
		Optional <User> user=urepo.findByUserName(username);
		user.orElseThrow(()->new  UsernameNotFoundException("UserName does not Exists"));
		
		return new MyUserDetails(user.get());
	}

}
