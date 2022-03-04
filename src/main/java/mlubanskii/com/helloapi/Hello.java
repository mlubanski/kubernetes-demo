package mlubanskii.com.helloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {

	@GetMapping("/hello")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello v2 " + name;
	}
	
	@GetMapping("/")
	public String greeting() {
		return "OK v2";
	}
}
