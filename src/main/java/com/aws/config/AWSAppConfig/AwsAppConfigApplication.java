package com.aws.config.AWSAppConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AwsAppConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsAppConfigApplication.class, args);
	}

}
