package com.wipro.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cicd")
public class WelcomeController {
@GetMapping
public String show()
{
	return "welcome";
}
}
