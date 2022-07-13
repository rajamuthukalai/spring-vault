package com.sannu.vault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class VaultApp implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(Credential.class);

	private final Credential credential;

	public VaultApp(Credential credential) {
		this.credential = credential;
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("secret is retrieved");
		logger.info("username: " + credential.getUsername());
		logger.info("password: " + credential.getPassword());
	}
}
