package com.example.treninsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class TreninshApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreninshApplication.class, args);
	}

	@RestController
	static class API {

		@GetMapping("/")
		public String getTime() {
			return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
		}

	}

}
