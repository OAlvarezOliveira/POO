package com.acarballeira.exercicio3.drivers;

import java.util.ArrayList;

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

public class App02 {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList();
		
		figuras.add(new Cuadrado(new Punto (0, 0),5));
		figuras.add(new Rectangulo(new Punto (0, 0),5, 6));
		figuras.add(new Circulo(new Punto (0, 0),20));
		
		
		figuras.add(0, new Triangulo(new Punto(0,0),10,23.5));
		figuras.remove(2);
		figuras.remove(figuras.get(0));
		
		for (int i = 0; i < figuras.size(); i++) {
			
			Figura f = figuras.get(i);
			
			String sub = f.getClass().toString().substring(f.getClass().toString().lastIndexOf(".")+1);
			
			System.out.printf("\nTipo de figura: %s. Area:%.2f",sub,f.calcularArea());
			
		} 
		
		System.exit(0);
		
		for (Figura figura : figuras) {
			
//			String sub = figura.getClass().toString().substring(figura.getClass().toString().lastIndexOf(".")+1);
//			
//			System.out.printf("\nTipo de figura: %s. Area:%.2f",sub,figura.calcularArea());
			
		}
		
	
	
	}
	
}
