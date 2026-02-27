package com.acarballeira.exercicio3.figura;

import java.util.Random;

/**
 * Resolución de la tarea xx
 * 
 * Curso 2025-26
 * @author Julio Mosquera
 * @version 1.0
 */

public class App {

	public static void main(String[] args) {
		Figura f1 = new Rectangulo(new Punto(0,0), 5, 3);
        Figura f2 = new Cuadrado(new Punto(2,2), 4);
        Figura f3 = new Circulo(new Punto(1,1), 3);
        Figura f4 = new Triangulo(new Punto(0,0), 6, 4);

        f1.pintar(2);
        f2.pintar(5);
        f3.pintar(8);
        f4.pintar(10);

        f1.mostrar();
        f2.mostrar();
        f3.mostrar();
        f4.mostrar();

        f1.imprimirEstado();
        f2.imprimirEstado();
        f3.imprimirEstado();
        f4.imprimirEstado();
		
	}
	
}
