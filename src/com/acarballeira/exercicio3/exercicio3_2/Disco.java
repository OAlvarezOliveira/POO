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

public class Disco {
	
	private int  capacidad;    //en GB
	private String tipo;       // SSD ,HDD
	
	public Disco(int capacidad, String tipo) {
		super();
		this.capacidad = capacidad;
		this.tipo = tipo;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("capacidad=%d, tipo=%s", capacidad, tipo);
	}
	
	
	


}
