package com.hubei.www.wuhan.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hubei.www.wuhan.model.Person;

@RestController
@RequestMapping("/first")
public class FirstWuhanController {

	private static final Logger logger = LoggerFactory.getLogger(FirstWuhanController.class);

	@PostMapping("/hello")
	public Object hello(@RequestBody Person param) {
		logger.info(param.toString());
		Map<String, Object> result = new HashMap<>();
		result.put("id", param.getId());
		result.put("name", "您好123，世界！");
		return result;
	}
}
