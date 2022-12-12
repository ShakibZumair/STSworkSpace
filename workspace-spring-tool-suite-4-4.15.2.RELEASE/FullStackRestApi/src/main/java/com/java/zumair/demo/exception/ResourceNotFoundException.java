package com.java.zumair.demo.exception;

import com.java.zumair.demo.payloads.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
	
private String cname;
private String fname;
private int value;
}
