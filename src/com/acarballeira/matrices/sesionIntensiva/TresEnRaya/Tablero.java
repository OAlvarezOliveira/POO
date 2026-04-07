package com.acarballeira.matrices.sesionIntensiva.TresEnRaya;

public class Tablero {

	private char[][] casillas;
	private static final int FILAS = 3;
	private static final int COLUMNAS = 3;

	public Tablero() {

		// 1. Crear matriz
		this.casillas = new char[FILAS][COLUMNAS];

		// 2. Llenar con '-' usando for anidado
		for (int fila = 0; fila < FILAS; fila++) {
			for (int col = 0; col < COLUMNAS; col++) {
				this.casillas[fila][col] = '-';
			}

		}

	}
	
	
	public void mostrar() {
	    for (int fila = 0; fila < FILAS; fila++) {
	        for (int col = 0; col < COLUMNAS; col++) {
	            System.out.print(this.casillas[fila][col] + " ");
	        }
	        System.out.println();  // Salto de línea después de cada fila
	    }
	}
	
	public void colocarFicha(int fila, int columna, char ficha) {
	    // Validación 1: fila válida (0 a 2)
	    if (fila < 0 || fila >= FILAS) {
	        System.out.println("Error: Fila debe estar entre 0 y 2");
	        return;
	    }
	    
	    // Validación 2: columna válida (0 a 2)
	    if (columna < 0 || columna >= COLUMNAS) {
	        System.out.println("Error: Columna debe estar entre 0 y 2");
	        return;
	    }
	    
	    // Validación 3: casilla vacía
	    if (this.casillas[fila][columna] != '-') {
	        System.out.println("Error: Casilla ocupada");
	        return;
	    }
	    
	    // Colocar ficha
	    this.casillas[fila][columna] = ficha;
	}

}
