package mvcTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mvcTest.model.Todo;
import mvcTest.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoAPIController {
	@Autowired
	private TodoService todoService;
	@GetMapping
	public List<Todo> getTodos(){
		return todoService.getTodos();
	}
	
	@PostMapping
	public Todo addTodo(@RequestBody Todo todo) {
		todoService.addTodo(todo);
		return todo;
	}
	@PutMapping
	public void updateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo.getId());
	}
	@DeleteMapping
	public void deleteTodo(@RequestBody Todo todo) {
		todoService.delTodo(todo.getId());
	}
}
