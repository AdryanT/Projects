package com.example.spt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
public class SpringBootApplicationTest {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationTest.class, args);
	}

}
