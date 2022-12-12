package com.java.zumair.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.zumair.demo.payloads.ApiResponce;
import com.java.zumair.demo.payloads.UserDto;
import com.java.zumair.demo.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userdto) {
		UserDto userdt = userService.createuser(userdto);
		return new ResponseEntity<UserDto>(userdt, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") int userId) {
		return new ResponseEntity<UserDto>(userService.getUserById(userId), HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		return new ResponseEntity<List<UserDto>>(userService.getAllUsers(), HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userdto, @PathVariable("userId") int userId) {
		return new ResponseEntity<UserDto>(userService.updateUser(userdto, userId), HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
	public ResponseEntity<ApiResponce> deleteUser(@PathVariable("userId") int userId) {
		userService.deleteById(userId);
		return new ResponseEntity<ApiResponce>(new ApiResponce("User", String.valueOf(userId)), HttpStatus.OK);

	}
}
