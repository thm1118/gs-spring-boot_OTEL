package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		String value = genMessage("index");
		return "消息: " +  value;
	}

	private String genMessage(String url) {
		if (Objects.equals(url, "index")) {
			return "欢迎来到首页";
		}
		else {
			return "欢迎继续浏览!";
		}
	}

}
