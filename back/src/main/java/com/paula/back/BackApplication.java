
package com.paula.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		SpringApplication.run(BackApplication.class, args);
	}

}
