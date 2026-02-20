package com.acarballeira.exercicio3.Prueba;

import java.util.Arrays;
import java.util.Random;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Prueba {

	private int[] lista;
	private String nombre;
	private int factor;
	private static final int TAM = 100;

	public Prueba(String nombre, int factor) {
		super();
		this.nombre = nombre;
		this.factor = factor;
		this.lista = new int[TAM];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFactor() {
		return factor;
	}

	public void rellenarLista() {
		Random aleatorio = new Random();

		for (int i = 0; i < lista.length; i++) {

			this.lista[i] = aleatorio.nextInt(0, this.factor + 1);

		}

	}

	public void imprimirLista() {

		System.out.printf("\n.:: IMPRESION DE LISTA ::.\n");

		System.out.printf("%s. Factor : %d \n", this.nombre, this.factor);

		for (int i : this.lista) {
			System.out.printf("%d - ", i);

		}

		System.out.printf("\n*************************\n");

	}

	public void vaciarLista() {

		for (int i = 0; i < lista.length; i++) {

			this.lista[i] = 0;

		}

	}

	public int devolverValorMasAlto() {

		return Arrays.stream(this.lista).max().getAsInt();
	}

	public int devolverValoresMasBajo() {

		return Arrays.stream(this.lista).min().getAsInt();

	}

	public int contiene(int valor, int primera) {
		int resultado = -1;

		if (primera == 0) {
			for (int i = 0; i < lista.length; i++) {
				if (this.lista[i] == valor) {
					resultado = i;
					break;
				}
			}
		} else {
			for (int i = lista.length - 1; i >= 0; i--) {
				if (this.lista[i] == valor) {
					resultado = i;
					break;
				}
			}
		}

		return resultado;
	}

	public int[] devolverValoresMayoryMenor() {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0, j = 0; i < lista.length; i++, j++) {

			if (this.lista[i] > max) {
				max = this.lista[i];

			} else {
				min = this.lista[i];

			}
		}

		return new int[] { max, min };

	}

}
