package com.mc.gis.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartRegistryServer {

	public static void main(String[] args) {
		SpringApplication.run(StartRegistryServer.class, args);
	}
}
