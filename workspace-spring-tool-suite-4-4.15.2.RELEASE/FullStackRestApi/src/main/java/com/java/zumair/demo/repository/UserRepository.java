package com.java.zumair.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.zumair.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer >{
	@Query("select u from User u where u.age>23")
  List<User> findByAgeGreaterthan(int age);
//	@Query("select u from User u where u.age>:age")
//	List<User> findByAgeGreaterthan(@Param("age") int age);
	@Query("select u.name from User u where u.name like :s||'%' ")
	List <String> findNameStartWith (@Param ("s") String s);
}
  