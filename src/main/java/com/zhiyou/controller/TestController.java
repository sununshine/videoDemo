package com.zhiyou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test")
	public String ts() {
		System.out.println("=========>fasf");
		return "asdfad";
	}
}
