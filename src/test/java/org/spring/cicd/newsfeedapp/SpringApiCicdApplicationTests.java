package org.spring.cicd.newsfeedapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.cicd.newsfeedapp.constant.HtmlTemplateConstants;
import org.spring.cicd.newsfeedapp.controller.NewsFeedController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringApiCicdApplicationTests {

	@Autowired
	private NewsFeedController newsFeedController;

	@Test
	public void contextLoads() {

		Assert.assertEquals(HtmlTemplateConstants.NEWS_TEMPLATE, newsFeedController.getFeed());
	}

	@Test
	public void main() {
		
		SpringApiCicdApplication.main(new String[] {});
	
	}

}
