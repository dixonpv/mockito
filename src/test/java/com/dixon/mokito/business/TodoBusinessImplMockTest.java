/**
 * 
 */
package com.dixon.mokito.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.dixon.mockito.api.TodoService;
import com.dixon.mockito.api.TodoServiceStub;

/**
 * @author dixon
 *
 */
public class TodoBusinessImplMockTest {

	@Test
	public void test() {
		
		TodoService todoServiceStub = new TodoServiceStub();
		TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoServiceStub);
		List<String> filteredTodos = todoServiceImpl.retrieveTodos("Dummy");
		assertEquals(2, filteredTodos.size());
		
	}

}
