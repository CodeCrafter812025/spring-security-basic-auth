package com.example.springsecuritydemo;

import com.example.springsecuritydemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringsecuritydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritydemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder encoder) {
		return args -> {
			if (userRepository.findByUsername("admin").isEmpty()) {
				userRepository.save(
						com.example.springsecuritydemo.model.User.builder()
								.username("admin")
								.password(encoder.encode("admin"))
								.role("ADMIN")
								.build()
				);
				userRepository.save(
						com.example.springsecuritydemo.model.User.builder()
								.username("user")
								.password(encoder.encode("1234"))
								.role("USER")
								.build()
				);
			}
		};
	}


}
