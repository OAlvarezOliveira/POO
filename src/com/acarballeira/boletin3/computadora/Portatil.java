package com.acarballeira.boletin3.computadora;

public class Portatil extends Ordenador {

	private String resolucion;
	private boolean cargadorIncluido;
	private double tamanoPantalla; // pulgadas
	private int capacidadBateria; // mAh
	private double autonomiaHoras; // h

	public Portatil(String marca, String modelo, String procesador, int memoria, int disco, String resolucion,
			boolean cargadorIncluido, double tamanoPantalla, int capacidadBateria, double autonomiaHoras) {
		super(marca, modelo, procesador, memoria, disco);
		this.resolucion = resolucion;
		this.cargadorIncluido = cargadorIncluido;
		this.tamanoPantalla = tamanoPantalla;
		this.capacidadBateria = capacidadBateria;
		this.autonomiaHoras = autonomiaHoras;
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