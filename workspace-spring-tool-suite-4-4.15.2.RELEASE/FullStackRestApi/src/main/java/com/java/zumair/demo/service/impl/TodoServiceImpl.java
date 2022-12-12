package com.java.zumair.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.zumair.demo.entities.ToDo;
import com.java.zumair.demo.exception.ResourceNotFoundException;
import com.java.zumair.demo.payloads.TodoDto;
import com.java.zumair.demo.repository.TodoRepository;
import com.java.zumair.demo.service.TodoService;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoRepository trepo;
	@Autowired
	ModelMapper modelmapper;

	@Override
	public TodoDto createuser(TodoDto tododto) {
		// TODO Auto-generated method stub
		ToDo todo = this.modelmapper.map(tododto, ToDo.class);
		ToDo savedtodo = trepo.save(todo);
		return this.modelmapper.map(savedtodo, TodoDto.class);
	}

	public TodoDto getUserById(int todoId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<ToDo> todo = trepo.findById(todoId);
		todo.orElseThrow(() -> new ResourceNotFoundException("User", "ID", todoId));
		return this.modelmapper.map(todo, TodoDto.class);
	}

	@Override
	public List<TodoDto> getAllUsers() {
		// TODO Auto-generated method stub
		return trepo.findAll().stream().map(u -> this.modelmapper.map(u, TodoDto.class)).collect(Collectors.toList());
	}

	@Override
	public TodoDto updateUser(TodoDto tododto, int todoId) {
		ToDo todo = trepo.findById(todoId).orElseThrow(() -> new ResourceNotFoundException("User", "ID", todoId));
		todo.setName(tododto.getName());
		todo.setCompletionDate(tododto.getCompletionDate());
		todo.setId(tododto.getId());
		todo.setDescription(tododto.getDescription());
		todo.setDone(tododto.isDone());

		return this.modelmapper.map(trepo.save(todo), TodoDto.class);
	}

	@Override
	public void deleteById(int todoId) {
		// TODO Auto-generated method stub
		ToDo todo = trepo.findById(todoId).orElseThrow(() -> new ResourceNotFoundException("User", "ID", todoId));
		trepo.deleteById(todoId);
	}

}
