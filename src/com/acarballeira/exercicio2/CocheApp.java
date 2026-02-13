package com.acarballeira.exercicio2;

import java.util.Arrays;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class CocheApp {

	public static void main(String[] args) {

		final int NUM_COCHES = 5;

		Coche coches[] = new Coche[NUM_COCHES];

		coches[0] = new Coche("Toyota", 120, "Gasolina", 17, "Verano");

		coches[1] = new Coche("Audi", 120, "Diesel", 18, "Invierno");

		coches[2] = new Coche("BMW", 90, "Hibrido", 16, "Verano");

		coches[3] = new Coche("Mercedes", 200, "Gasolina", 19, "Invierno");
		
		Rueda [] vRueda = {new Rueda("Verano",19),new Rueda("Verano",19),new Rueda("Verano",19)};
		
		coches[4] = new Coche("Volkswagen", new Motor(200,"GLP"),vRueda);

		

//		Arrays.sort(coches);

		

		for (Coche coche : coches) {

			System.out.println(coche);

		}

		

	}



}
