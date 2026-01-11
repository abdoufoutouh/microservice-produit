package com.example.microservice_produits;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MicroserviceProduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProduitsApplication.class, args);
	}

}
