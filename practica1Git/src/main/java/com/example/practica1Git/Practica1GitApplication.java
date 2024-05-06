package com.example.practica1Git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Practica1GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica1GitApplication.class, args);


		System.out.println("hola usuario, ¿Cómo te llamas?");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();

		System.out.println("Bienvenido " + nombre +" Por favor seleccione una opción");
		System.out.println("Seleccione 1 para mostrar la tabla del 1");
		System.out.println("Seleccione 2 para mostrar las tablas del 2 al 5");
		System.out.println("Seleccione 3 para salir del programa");
		int opcion = scanner.nextInt();

		switch (opcion) {
			case 1:
				mostrarTabla();
				break;

			case 2:
				tablas25();
				break;
			case 3:
				Salir();
				break;
			default:
				break;
		}
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
