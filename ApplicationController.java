package com.org.job_portal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.job_portal.repository.ApplicationRepository; 
import com.org.job_portal.model.Application;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin
public class ApplicationController {

    private final ApplicationRepository repo;

    // Correct constructor
    public ApplicationController(ApplicationRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Application apply(@RequestBody Application app) {
      app.setStatus("APPLIED");
        return repo.save(app);
    }
}