package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.SampleForm;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public String index(@ModelAttribute SampleForm sampleForm) {
		return "hello";
	}

}