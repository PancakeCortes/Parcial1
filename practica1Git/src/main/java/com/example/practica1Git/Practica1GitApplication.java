package com.example.practica1Git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica1GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica1GitApplication.class, args);
		System.out.println("hola");
		mostrarTabla();
	}


	public static String mostrarTabla () {

		for (int index = 0; index <= 10; index++) {
			System.out.println("1 x "+index+" = "+index);
		}
		return null;
	}
	

}
