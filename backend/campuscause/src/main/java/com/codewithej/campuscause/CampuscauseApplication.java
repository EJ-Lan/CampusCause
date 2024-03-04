package com.codewithej.campuscause;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.Map;

@SpringBootApplication
public class CampuscauseApplication {

	static {
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));
	}

	public static void main(String[] args) {
		SpringApplication.run(CampuscauseApplication.class, args);
	}
}

