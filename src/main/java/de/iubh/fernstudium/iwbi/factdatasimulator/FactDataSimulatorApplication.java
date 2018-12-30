package de.iubh.fernstudium.iwbi.factdatasimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class FactDataSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactDataSimulatorApplication.class, args);
	}

}

