package com.hg.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hg.rest.webservices.restfulwebservices.bean.Todo;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter = 0;
	
	static 
	{
		todos.add(new Todo(++idCounter, "hg", "Learn to dance", new Date(), false));
		todos.add(new Todo(++idCounter, "hg", "Learn about Microservices 2", new Date(), false));
		todos.add(new Todo(++idCounter, "hg", "Learn about Angular", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(Long id) {
		Todo todo = findById(id);
		
		if(todo==null) return null;
		if(todos.remove(todo))	return todo;
		
		return null;
	}

	public Todo findById(Long id) {
		for(Todo todo: todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
}
