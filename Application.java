package com.org.job_portal.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity

public class Application {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private int userId;
	    private int jobId;
	    private String status;
		public void setStatus(String string) {
			// TODO Auto-generated method stub
			
		}
	}

