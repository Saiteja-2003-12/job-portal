package com.org.job_portal.controller;

	import org.springframework.web.bind.annotation.*;
	import com.org.job_portal.repository.UserRepository;
	import com.org.job_portal.model.User;

	@RestController
	@RequestMapping("/api/users")
	@CrossOrigin
	public class UserController {

	    private final UserRepository repo;

	    public UserController(UserRepository repo) {
	        this.repo = repo;
	    }

	    @PostMapping("/register")
	    public User register(@RequestBody User user) {
	        return repo.save(user);
	    }


}
