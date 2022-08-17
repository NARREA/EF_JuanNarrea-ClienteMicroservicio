package com.idat.clienteservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfJuanNarreaClienteMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJuanNarreaClienteMicroservicioApplication.class, args);
	}

}
