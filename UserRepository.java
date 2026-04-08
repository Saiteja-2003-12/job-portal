package com.org.job_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.job_portal.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	}

