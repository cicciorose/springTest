package com.testspring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testspring.model.User;


@Configuration
public class UserConfiguration {
	

	

    @Bean
    User getUser() {
		return new User(0L,"root");
	}
	
}
