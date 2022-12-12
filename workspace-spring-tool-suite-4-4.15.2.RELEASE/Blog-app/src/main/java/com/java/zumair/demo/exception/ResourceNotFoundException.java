package com.java.zumair.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourceNotFoundException extends RuntimeException{
	private String fieldname;
	private String resourcename;
	private long fieldvalue;
	public ResourceNotFoundException(String fieldname, String resourcename, long fieldvalue) {
		super(String.format("%s not found with %s :%l", fieldname,resourcename,fieldvalue));
		this.fieldname = fieldname;
		this.resourcename = resourcename;
		this.fieldvalue = fieldvalue;
	}

}
