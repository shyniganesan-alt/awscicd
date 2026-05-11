package com.cicdaws.awscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	
	@GetMapping("/health")
    public String healthCheck() {
        return "UP";
    }


    @GetMapping("/welcome")
    public String greetings() {
        return "Hello Software Engineer , AWS CICD Example working fine !";
    }


}
