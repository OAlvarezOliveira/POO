package com.acarballeira.exercicio3.exercicio3_2;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Procesador {
	
	private String modelo;
	private double frecuencia; //en GHz
	
	public Procesador(String modelo, Double frecuencia) {
		super();
		this.modelo = modelo;
		this.frecuencia = frecuencia;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	public void iniciar() {
			System.out.printf("El procesador %s se está encenciedo \n",this.modelo);
	}
	
	public void detener() {
		System.out.printf("El ordenador %s %s se está deteniendo \n",this.modelo);
}

	@Override
	public String toString() {
		return String.format("modelo: %s, frecuencia: %.2f ", modelo, frecuencia);
	}
	


}
