package com.uas.eis;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configurable
@SpringBootApplication
public class UasEisApplication {

	public static void main(String[] args) {
		SpringApplication.run(UasEisApplication.class, args);
	}
	
}
