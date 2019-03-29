package com.online.banking.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
}
