package org.spring.cicd.newsfeedapp.controller;

import org.spring.cicd.newsfeedapp.constant.HtmlTemplateConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsFeedController {
	
	@GetMapping("/")
	public String getFeed() {
        return HtmlTemplateConstants.NEWS_TEMPLATE;
    }

}
