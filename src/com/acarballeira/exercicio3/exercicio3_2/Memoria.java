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

public class Memoria {
	
	private int  capacidad;    //en GB

	public Memoria(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return String.format("capacidad=%d]", capacidad);
	}


}
