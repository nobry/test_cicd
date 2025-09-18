package org.myhome.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestingApp{
	
	public static void main(String[] args) {
		SpringApplication.run(TestingApp.class, args);
	}
    

    @GetMapping("/") 
    public String getMessage()
    {
        return "Spring Boot Application running on Tomcat server!!";
    }
}