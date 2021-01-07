package org.gyeonq.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("api/hello")
	public HashMap<String, Object> hello(){
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("message", "테스트입니다 안녕하세요");
		return result;
	}
	
}
