package com.java.zumair.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.zumair.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer >{

}
