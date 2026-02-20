package com.acarballeira.exercicio3.drivers;

import com.acarballeira.exercicio3.exercicio3_1.Computadora;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_01 {

	public static void main(String[] args) {

		Computadora pc01;
		pc01= new Computadora("DELL","XPS15","Intel I9 15th",32762,2048);
		
		System.out.println(pc01);
		
		pc01.encender();
		pc01.ejecutar("InkScape");
		pc01.apagar();
	}

}
