package com.github.sample.sampleGitHub.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endpointController {

	@RequestMapping("/user")
	@ResponseBody
      // Method
    public String helloGFG()
    {
        return "Hello There";
    }
}
