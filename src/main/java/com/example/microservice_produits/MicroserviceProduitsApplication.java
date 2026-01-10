package com.example.microservice_produits;
import com.example.microservice_produits.Config.MesConfigs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@SpringBootApplication
@ConfigurationPropertiesScan
public class MicroserviceProduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProduitsApplication.class, args);
	}

}
