package com.nttdata.microservicios.app.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.nttdata.microservicios.commons.examenes.models.entity"})
public class MicroservicioExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioExamenesApplication.class, args);
	}

}
