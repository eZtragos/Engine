package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MotorApplication implements CommandLineRunner {

	@Autowired
	Engine config;

	public static void main(String[] args) {

		SpringApplication.run(MotorApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(config.getDatalake_bdneg());
		System.out.println(config.getDatalake_keytabfile());
		System.out.println(config.getPath());

	}

}
