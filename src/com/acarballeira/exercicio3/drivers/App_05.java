package com.acarballeira.exercicio3.drivers;

import com.acarballeira.exercicio3.Prueba.Prueba;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_05 {

	public static void main(String[] args) {


		Prueba p = new Prueba ("Lista de Oscar Alvarez",200);
		
		System.out.println("Imprimo lista recien creada");
		p.imprimirLista();
		p.rellenarLista();
		System.out.println("Imprimo lista recien rellenada");
		p.imprimirLista();
		p.vaciarLista();
		System.out.println("Imprimo lista recien vaciada");
		p.imprimirLista();


	}

}
