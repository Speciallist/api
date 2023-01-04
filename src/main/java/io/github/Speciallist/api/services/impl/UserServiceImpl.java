package io.github.Speciallist.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.Speciallist.api.domain.User;
import io.github.Speciallist.api.domain.dto.UserDTO;
import io.github.Speciallist.api.repositories.UserRepository;
import io.github.Speciallist.api.services.UserService;
import io.github.Speciallist.api.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ModelMapper mapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Integer id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User create(UserDTO userDTO) {
		return userRepository.save(mapper.map(userDTO, User.class));
	}

}
