package com.java.zumair.demo.payloads;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
	  private int id;
	  private String name;
	  private String about;
	  private String email;
	  private int password;
}
