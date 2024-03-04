package com.codewithej.campuscause;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.Map;

@SpringBootApplication
public class CampuscauseApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		System.getProperties().putAll((Map<?, ?>) dotenv.entries());
		SpringApplication.run(CampuscauseApplication.class, args);
	}

}
