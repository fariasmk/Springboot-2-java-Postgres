package com.maikon.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maikon.course.entities.User;

@RestController //Informa que esta classe é um recurso web implementada por controlador Rest.
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
