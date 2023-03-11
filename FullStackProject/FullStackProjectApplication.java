package com.example.FullStackProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/* @SpringBootApplication- it has 3 annotations:
 * 1.@ComponentScan- This annotation is used to specify the base packages to scan for spring beans/components.
 * 2.@EnableAutoConfiguration- enables the magical auto configuration which can automatically configure.
 * 3.@SpringBootConfiguration- This annotation indicates that a configuration class declares one or more @Bean methods.
 * */
@SpringBootApplication

public class FullStackProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackProjectApplication.class, args);
	}

}
