/**
 * 
 */
package com.dixon.mokito.business;

import java.util.ArrayList;
import java.util.List;

import com.dixon.mockito.api.TodoService;

/**
 * @author dixon
 *
 */
public class TodoServiceImpl {

	private TodoService todoService;

	public TodoServiceImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodos(String user) {

		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);

		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
