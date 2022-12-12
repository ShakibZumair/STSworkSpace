package com.java.zumair.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.java.zumair.demo.exception.UsernameNotFoundExpection;
import com.java.zumair.demo.model.User;
@Service
public class UserServiceImpl  implements UserService{
	 User u1= new User(1,"Amit","sales",28,"123");
	 User u2= new User(2,"Nitin","Marketing",21,"abc");
	 User u3= new User(3,"vishal","sales",22,"456");
	 User u4= new User(4,"jatin","finance",27,"xyz");
	 User u5= new User(5,"Neha","marketing",25,"1789");
	 User u6= new User(1,"inder","sales",26,"111");
	 List<User> users=(List<User>)Arrays.asList(u1,u2,u3,u4,u5,u6);
	@Override
	public User getUserWithMaxAge() {
		// TODO Auto-generated method stub
		return users.stream().sorted((u1,u2)->u2.getAge()-u1.getAge()).limit(1).collect(Collectors.toList()).get(0);
	}
	@Override
	public User getValidLogin() {
		// TODO Auto-generated method stub
		return users.stream().filter(u1->u1.getName().equals(users)&& u1.getPassword().equals(users)).collect(Collectors.toList()).get(0);
	}
	
	
	@Override
	public boolean isUserValid(String username, String password) throws UsernameNotFoundExpection {
		// TODO Auto-generated method stub
		if(users.stream().filter(e->e.getName().equals(username)).collect(Collectors.toList()).size()==0)
			throw new UsernameNotFoundExpection("the user does not exists");
		
		return users.stream().filter(u1->{return u1.getName().equals(username) && u1.getPassword().equals(password);}).collect(Collectors.toList()).size()==1;
	}
	 
}
