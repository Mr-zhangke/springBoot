package com.example.springBoot;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class HelloWordControllerJunitTest extends ApplicationTests {

	@Test
	public void testHelloWord() throws Exception{
		System.out.println("===========================================");
//		getMockMvc().perform(get);
		getMockMvc().perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
         .andExpect(MockMvcResultMatchers.status().isOk())
         .andDo(MockMvcResultHandlers.print())
         .andReturn();
		System.out.println("aaaaaaa");
	}
	
	
	@Test
	public void testHelloword1() throws Exception{
		System.out.println("-------------------------------------------------");
		 ResultActions ra = getMockMvc()
	                .perform(
	                        get("/hello")
//	                                .param("notRevisit", "true")
//	                                .param("deptId", "44")
	                                .header("content-type", "application/json")
//	                                .header("user-agent", USER_AGENT)
//	                                .header("host", HOST)
//	                                .content(string)
//	                                .cookie(COOKIES)
	                )
	                .andExpect(MockMvcResultMatchers.status().isOk())
	                .andDo(MockMvcResultHandlers.print());
	        MvcResult result = ra.andReturn();
	        String c = result.getResponse().getContentAsString();
	        System.out.println("result:" + c);
	}
}
