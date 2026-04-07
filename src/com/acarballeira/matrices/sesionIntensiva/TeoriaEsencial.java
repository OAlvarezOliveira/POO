package com.acarballeira.matrices.sesionIntensiva;
import java.util.Arrays;


public class TeoriaEsencial {

	public static void main(String[] args) {
		
	//	1. DECLARACIÓN E INICIALIZACIÓN:

		// Array simple (1 dimensión)
		double[] notas = new double[5];  // 5 elementos, todos 0.0
		boolean[] asignadas = new boolean[5];  // 5 elementos, todos false

		// Con valores iniciales
		double[] notas2 = {7.5, 8.0, 6.5, 9.0, 5.5};

		// Array 2D (matriz)
		int[][] matriz = new int[3][4];  // 3 filas, 4 columnas
		int[][] matriz2 = {
		    {1, 2, 3, 4},
		    {5, 6, 7, 8},
		    {9, 10, 11, 12}
		};

		
		//2. RECORRER ARRAYS:

		// FOR NORMAL (cuando necesitas índice)
		for (int i = 0; i < notas.length; i++) {
		    System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}

		// FOR-EACH (cuando solo lees valores)
		for (double nota : notas) {
		    System.out.println(nota);
		}

		// MATRIZ 2D
		for (int fila = 0; fila < matriz.length; fila++) {
		    for (int col = 0; col < matriz[fila].length; col++) {
		        System.out.print(matriz[fila][col] + " ");
		    }
		    System.out.println();
		}
		
		
		//3. OPERACIONES COMUNES:

		
		// Longitud
		int tamanho = notas.length;

		// Acceso
		double primera = notas[0];  // Primera posición (índice 0)
		double ultima = notas[notas.length - 1];  // Última posición

		// Modificar
		notas[2] = 8.5;  // Cambiar tercera nota

		// Media (con Arrays.stream)
		double media = Arrays.stream(notas).average().getAsDouble();

		// Máximo
		double max = Arrays.stream(notas).max().getAsDouble();

		// Mínimo
		double min = Arrays.stream(notas).min().getAsDouble();
		
		
		

	}

}
