package com.java.zumair.demo.payloads;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.java.zumair.demo.entities.ToDo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private int age;
private String mobile;
private String password;

List<TodoDto> todos=new ArrayList<TodoDto>();

}