package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	@GetMapping("/sample")
	public String main(  ) {
		return "sample";
	}
	

}
