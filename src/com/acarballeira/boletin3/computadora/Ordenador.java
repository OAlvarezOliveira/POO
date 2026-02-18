package com.acarballeira.boletin3.computadora;

;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Ordenador {

	private String marca;
	private Boolean encencido;
	private String modelo;
	private String procesador;
	private int memoria; // MB
	private int disco; // GB

	public Ordenador(String marca, String modelo, String procesador, int memoria, int disco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.memoria = memoria;
		this.disco = disco;
		this.encencido = false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getDisco() {
		return disco;
	}

	public void setDisco(int disco) {
		this.disco = disco;
	}

	public void encender() {
		if (!this.encencido) {
			System.out.printf("El ordenador %s %s se está encendiendo\n", this.marca, this.modelo);
			this.encencido = true; // ← AÑADE ESTO
		}
	}

	public void apagar() {
		if (this.encencido) {
			System.out.printf("El ordenador %s %s se está apagando\n", this.marca, this.modelo);
			this.encencido = false; // ← AÑADE ESTO
		}
	}

	public void ejecutar(String programa) {

		if (this.encencido) {
			System.out.printf("Se está ejecutando el progrma %s en el ordenador %s %s \n", this.marca, this.modelo,
					programa);
		} else {
			System.out.printf("El ordenador %s %s no puede ejecutar el programa %s por que  está apagado \n",
					this.marca, this.modelo, programa);
		}
	}

	@Override
	public String toString() {
		return String.format("Ordenador: \n"
				+ "marca: %s \n"
				+ "encencido: %b \n"
				+ "modelo: %s \n"
				+ "procesador: %s \n"
				+ "memoria: %d \n"
				+ "disco: %d \n",
				marca, encencido, modelo, procesador, memoria, disco);
	}

}

