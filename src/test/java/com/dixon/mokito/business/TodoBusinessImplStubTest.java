/**
 * 
 */
package com.dixon.mokito.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.dixon.mockito.api.TodoService;
import com.dixon.mockito.api.TodoServiceStub;

/**
 * @author dixon
 *
 */
public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring","Learn Hibernate","Learn Spring Boot");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoServiceMock);
	
		List<String> filteredTodos = todoServiceImpl.retrieveTodos("Dummy");
		assertEquals(2, filteredTodos.size());
		
	}

}
