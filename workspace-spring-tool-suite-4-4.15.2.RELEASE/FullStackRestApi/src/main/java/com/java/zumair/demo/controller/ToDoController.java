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
import com.java.zumair.demo.payloads.TodoDto;
import com.java.zumair.demo.payloads.UserDto;
import com.java.zumair.demo.service.TodoService;
import com.java.zumair.demo.service.UserService;

@RestController
@RequestMapping("/api/v1/todo")
public class ToDoController {

	@Autowired
	TodoService todoService;

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public ResponseEntity<TodoDto> createUser(@RequestBody TodoDto tododto) {
		TodoDto tododt = todoService.createuser(tododto);
		return new ResponseEntity<TodoDto>(tododt, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{todoId}")
	public ResponseEntity<TodoDto> getUserById(@PathVariable("todoId") int todoId) {
		return new ResponseEntity<TodoDto>(todoService.getUserById(todoId), HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ResponseEntity<List<TodoDto>> getAllUsers() {
		return new ResponseEntity<List<TodoDto>>(todoService.getAllUsers(), HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{todoId}")
	public ResponseEntity<TodoDto> updateUser(@RequestBody TodoDto tododto, @PathVariable("userId") int todoId) {
		return new ResponseEntity<TodoDto>(todoService.updateUser(tododto, todoId), HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{todoId}")
	public ResponseEntity<ApiResponce> deleteUser(@PathVariable("todoId") int todoId) {
		todoService.deleteById(todoId);
		return new ResponseEntity<ApiResponce>(new ApiResponce("User", String.valueOf(todoId)), HttpStatus.OK);

	}
}
