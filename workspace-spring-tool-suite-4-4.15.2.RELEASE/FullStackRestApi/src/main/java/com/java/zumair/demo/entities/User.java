package com.java.zumair.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private int age;
private String mobile;
private String password;

@OneToMany(mappedBy = "user" ,cascade=CascadeType.ALL)
List<ToDo> todos=new ArrayList<ToDo>();

}
