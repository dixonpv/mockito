/**
 * 
 */
package com.dixon.mockito.api;

import java.util.Arrays;
import java.util.List;

/**
 * @author dixon
 *
 */
public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		
		return Arrays.asList("Learn Spring","Learn Hibernate","Learn Spring Boot");
	}

}
