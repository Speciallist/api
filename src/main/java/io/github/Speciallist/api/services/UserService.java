package io.github.Speciallist.api.services;

import java.util.List;

import io.github.Speciallist.api.domain.User;

public interface UserService {

	public User findById(Integer id);

	public List<User> findAll();

}
