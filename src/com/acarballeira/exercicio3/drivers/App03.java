package com.acarballeira.exercicio3.drivers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.acarballeira.exercicio3.figura.Circulo;
import com.acarballeira.exercicio3.figura.Cuadrado;
import com.acarballeira.exercicio3.figura.Figura;
import com.acarballeira.exercicio3.figura.Punto;
import com.acarballeira.exercicio3.figura.Rectangulo;
import com.acarballeira.exercicio3.figura.Triangulo;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App03 {

	public static void main(String[] args) {
		
		Set<Figura> figuras = new HashSet<>();
		Cuadrado c = new Cuadrado(new Punto (0, 0),5);

		figuras.add(c);
		figuras.add(c);
		figuras.add(c);
		figuras.add(c);
		figuras.add(c);
		figuras.add(c);
		figuras.add(new Cuadrado(new Punto (0, 0),5));
		figuras.add(new Rectangulo(new Punto (0, 0),5, 6));
		figuras.add(new Circulo(new Punto (0, 0),20));
		figuras.add(new Triangulo(new Punto(0,0),10,23.5));
		
		System.out.println(figuras.size());
		
		
		for (Figura figura : figuras) {
			
			
			System.out.printf("\nTipo de figura: %s. Area:%.2f",figura.getClass().toString().substring(figura.getClass().toString().lastIndexOf(".")+1),figura.calcularArea());
			
		} 
		


	}

}
