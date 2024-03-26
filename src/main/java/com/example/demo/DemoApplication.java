package com.example.demo;

import com.example.demo.controller.BeerController;
import com.example.demo.services.BeerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Running the SpringBoot Project ");

	}

}
