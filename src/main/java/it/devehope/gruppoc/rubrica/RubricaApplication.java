package it.devehope.gruppoc.rubrica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "it.devehope.gruppoc.rubrica")
public class RubricaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubricaApplication.class, args);
	}

}
