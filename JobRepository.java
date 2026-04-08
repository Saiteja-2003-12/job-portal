package com.org.job_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.job_portal.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {
}
