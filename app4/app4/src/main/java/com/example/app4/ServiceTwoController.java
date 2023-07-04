package com.example.app4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

	@RequestMapping("service2")
	public String service2() {
		System.out.println("this message to service Two");
		return "why are you not came";
	}
}
