package br.com.rkz98.ilustrandoUFM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.rkz98.ilustrandoUFM.")
@EnableJpaRepositories("br.com.rkz98.ilustrandoUFM.repository")
public class IlustrandoUfmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IlustrandoUfmApplication.class, args);
	}
}