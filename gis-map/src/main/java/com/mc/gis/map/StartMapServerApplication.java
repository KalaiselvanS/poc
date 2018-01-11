package com.mc.gis.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mc.gis.common.spec.GeoPonRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class StartMapServerApplication {
	
	public static final String GIS_PON_SERVICE_URL = "http://GIS-PON-SERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(StartMapServerApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public GeoPonRepository geoPonRepository(){
		return new RemoteGeoPonRepository(GIS_PON_SERVICE_URL);
	}
}
