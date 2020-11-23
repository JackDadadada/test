package com.jt.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/page/{modulName}")
	public String add(@PathVariable String modulName) {
		return modulName;
	}
}
