package com.example.practica1Git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Practica1GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica1GitApplication.class, args);


		System.out.println("hola");
		mostrarTabla();
		tablas25();
		Salir();
	}


	public static String mostrarTabla () {

		for (int index = 0; index <= 10; index++) {
			System.out.println("1 x "+index+" = "+index);
		}
		return null;
	}
	
	public static String tablas25() {

		for (int index = 0; index <= 10; index++) {
			
			System.out.println("2 x "+index+" = "+index*2+"        "+"3 x "+index+" = "+index*3+"        "+"4 x "+index+" = "+index*4+"        "+"5 x "+index+" = "+index*5);
		}
		return null;
	}

	public static void Salir () {
		System.exit(0);
	}

}
