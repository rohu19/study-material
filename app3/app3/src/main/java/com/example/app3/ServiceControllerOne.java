package com.example.app3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceControllerOne {

	@Autowired
	private ProxcyForApp4 proxcyForApp4;

	@RequestMapping("service1")
	public String service1() {
		System.out.println("Hey come service1");
		String results = proxcyForApp4.test2();
		return "come babe-" + results;
	}
}
