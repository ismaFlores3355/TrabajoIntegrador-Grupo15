package ar.edu.unju.fi.ejercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ar.edu.unju.fi.controller","ar.edu.unju.fi.html.service","ar.edu.unju.fi.hmtl.service.imp",
		"ar.edu.unju.fi.html.util"})
public class ProyectoIntegradorPvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoIntegradorPvApplication.class, args);
	}

}
