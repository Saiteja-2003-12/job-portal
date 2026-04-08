package com.org.job_portal.service;

	import org.springframework.stereotype.Service;
	import java.util.List;
	import com.org.job_portal.repository.JobRepository;
	import com.org.job_portal.model.Job;

	@Service
	public class JobService {

	    private final JobRepository repo;

	    public JobService(JobRepository repo) {
	        this.repo = repo;
	    }

	    public Job saveJob(Job job) {
	        return repo.save(job);
	    }

	    public List<Job> getAllJobs() {
	        return repo.findAll();
	    }

	    public void deleteJob(int id) {
	        repo.deleteById(id);
	    }
	}
