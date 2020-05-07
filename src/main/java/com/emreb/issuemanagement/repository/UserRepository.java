package com.emreb.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emreb.issuemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
