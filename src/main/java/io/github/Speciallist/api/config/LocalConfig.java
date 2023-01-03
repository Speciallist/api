package io.github.Speciallist.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.Speciallist.api.domain.User;
import io.github.Speciallist.api.repositories.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private UserRepository userRepository;

	@Bean
	public void startDB() {
		User u1 = new User(null, "Fhilype", "fhilype@email.com", "123");
		User u2 = new User(null, "Luiz", "luiz@email.com", "123");
		User u3 = new User(null, "Ana", "ana@email.com", "123");
		userRepository.save(u1);
		userRepository.save(u2);
		userRepository.save(u3);
	}

}
