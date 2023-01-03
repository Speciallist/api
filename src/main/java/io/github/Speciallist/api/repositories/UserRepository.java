package io.github.Speciallist.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.Speciallist.api.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
