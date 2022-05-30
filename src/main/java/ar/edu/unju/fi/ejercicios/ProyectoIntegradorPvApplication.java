package ar.edu.unju.fi.ejercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"ar.edu.unju.fi.controller"})
public class ProyectoIntegradorPvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoIntegradorPvApplication.class, args);
	}

}
