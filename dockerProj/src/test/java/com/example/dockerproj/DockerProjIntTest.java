package com.example.dockerproj;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.dockerproj.controller.DockerHelloWorldController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(DockerHelloWorldController.class)
public class DockerProjIntTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test 
	public void hello() throws Exception {
		RequestBuilder req=MockMvcRequestBuilders.get("/hello");
		MvcResult result = mvc.perform(req).andReturn();
		assertEquals("Hello Jafar from Docker container", result.getResponse().getContentAsString());
	
	}
	

}
