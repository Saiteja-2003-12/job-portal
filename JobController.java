package com.org.job_portal.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.org.job_portal.service.JobService;
import com.org.job_portal.model.Job;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobController {

    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    @PostMapping
    public Job addJob(@RequestBody Job job) {
        return service.saveJob(job);
    }

    @GetMapping
    public List<Job> getJobs() {
        return service.getAllJobs();
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable int id) {
        service.deleteJob(id);
    }
}
