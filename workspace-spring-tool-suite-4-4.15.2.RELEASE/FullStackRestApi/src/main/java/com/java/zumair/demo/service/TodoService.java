package com.java.zumair.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.zumair.demo.exception.ResourceNotFoundException;
import com.java.zumair.demo.payloads.TodoDto;
@Service
public interface TodoService {
		public TodoDto createuser(TodoDto tododto);

		TodoDto getUserById(int todoId) throws ResourceNotFoundException;

		public List<TodoDto> getAllUsers();

		TodoDto updateUser(TodoDto tododto, int todoId);

		void deleteById(int id);
	
}