package com.mc.gis.pon.geoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StartGeoPonService {

	public static void main(String[] args) {
		SpringApplication.run(StartGeoPonService.class, args);
	}
	
}
