package com.example.springBoot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.springBoot.controller.HelloWordController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	
	
	public MockMvc getMockMvc() {
		return mockMvc;
	}


	@Before
	public void setMockMvc() {
//		this.mockMvc = MockMvcBuilders.standaloneSetup(webApplicationContext).build();
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloWordController()).build();
	}



	@Test
	public void contextLoads() {
	}

}
