package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SampleController {

	@RequestMapping("/")
	public String index(@RequestParam("name") String name) {
		return "Hey " + name + ", how is your vacation?";
	}

}