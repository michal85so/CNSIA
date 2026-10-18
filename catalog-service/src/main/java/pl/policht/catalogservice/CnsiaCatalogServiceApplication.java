package pl.policht.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CnsiaCatalogServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(CnsiaCatalogServiceApplication.class, args);
	}

}
