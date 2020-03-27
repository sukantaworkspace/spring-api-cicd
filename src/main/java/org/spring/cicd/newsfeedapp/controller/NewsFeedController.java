package org.spring.cicd.newsfeedapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsFeedController {
	
	@GetMapping("/")
	public String getFeed() {
        return "Hello World from India";
    }

}
