package com.acarballeira.boletin3.computadora.drivers;

import com.acarballeira.boletin3.computadora.Ordenador;

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

		Ordenador pc01;
		pc01= new Ordenador("DELL","XPS15","Intel I9 15th",32762,2048);
		
		System.out.println(pc01);
		
		pc01.encender();
		pc01.apagar();
		pc01.ejecutar("InkScape");
	}

}