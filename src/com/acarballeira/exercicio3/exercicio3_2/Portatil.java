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

public class Portatil extends Computadora {

	private String resolucion;
	private boolean cargadorIncluido;
	private double tamanoPantalla; // pulgadas
	private int capacidadBateria; // mAh
	private double autonomiaHoras; // h

	public Portatil(String marca, String modelo, Procesador cpu, Disco hd, Memoria memoria, String resolucion,
			boolean cargadorIncluido, double tamanoPantalla, int capacidadBateria, double autonomiaHoras) {
		super(marca, modelo, cpu, hd, memoria);
		this.resolucion = resolucion;
		this.cargadorIncluido = cargadorIncluido;
		this.tamanoPantalla = tamanoPantalla;
		this.capacidadBateria = capacidadBateria;
		this.autonomiaHoras = autonomiaHoras;
	}
	
	public Portatil() {
		super();

	}


	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isCargadorIncluido() {
		return cargadorIncluido;
	}

	public void setCargadorIncluido(boolean cargadorIncluido) {
		this.cargadorIncluido = cargadorIncluido;
	}

	public double getTamanoPantalla() {
		return tamanoPantalla;
	}

	public void setTamanoPantalla(double tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	public double getAutonomiaHoras() {
		return autonomiaHoras;
	}

	public void setAutonomiaHoras(double autonomiaHoras) {
		this.autonomiaHoras = autonomiaHoras;
	}

	@Override
	public String toString() {
	    return String.format(
	            "Portatil : \n"
	            + "resolucion :%s \n"
	            + "cargadorIncluido :%b \n"
	            + "tamanoPantalla :%.2f \n"
	            + "capacidadBateria :%d \n"
	            + "autonomiaHoras :%.2f\n"
	            + "\nDatos General :%s\n", 
	            resolucion, cargadorIncluido, tamanoPantalla, capacidadBateria, autonomiaHoras, super.toString());
	}

}