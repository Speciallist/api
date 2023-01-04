package io.github.Speciallist.api.services;

import java.util.List;

import io.github.Speciallist.api.domain.User;
import io.github.Speciallist.api.domain.dto.UserDTO;

public interface UserService {

	public User findById(Integer id);

	public List<User> findAll();

	public User create(UserDTO userDTO);

	public User update(UserDTO userDTO);

}
