package com.java.zumair.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.zumair.demo.entities.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Integer >{
	@Query("select u.name from User u where u.name like :s||'%' ")
	List <String> findNameStartWith (@Param ("s") String s);
}
