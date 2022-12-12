package com.java.zumair.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="USERS")
public class User {
  private int id;
  private String name;
  private String about;
  private String email;
  private int password;
}
