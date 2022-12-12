package com.java.zumair.demo.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.zumair.demo.model.User;

@Repository
public class UserRepositaryImpl implements UserRepository{

	
	 User u1= new User(1,"Amit","sales",28,"123");
	 User u2= new User(2,"Nitin","Marketing",21,"abc");
	 User u3= new User(3,"vishal","sales",22,"456");
	 User u4= new User(4,"jatin","finance",27,"xyz");
	 User u5= new User(5,"Neha","marketing",25,"1789");
	 User u6= new User(1,"inder","sales",26,"111");
	 List<User> users=(List<User>)Arrays.asList(u1,u2,u3,u4,u5,u6);
	@Override
	public List<User> getAllUsers(String username) {
		// TODO Auto-generated method stub
		return users;
	}

}
