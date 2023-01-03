package io.github.Speciallist.api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.Speciallist.api.domain.User;
import io.github.Speciallist.api.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(userService.findById(id));
	}

}