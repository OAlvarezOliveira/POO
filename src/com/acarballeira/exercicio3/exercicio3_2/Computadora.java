package com.acarballeira.exercicio3.exercicio3_2;

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

public class Computadora {

	private String marca;
	private String modelo;
	private boolean encencido = false;
	private Procesador cpu;
	private Disco hd;
	private Memoria memoria;

	public Computadora(String marca, String modelo, Procesador cpu, Disco hd, Memoria memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cpu = cpu;
		this.hd = hd;
		this.memoria = memoria;
	}
	
	public Computadora() {

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

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Disco getHd() {
		return hd;
	}

	public void setHd(Disco hd) {
		this.hd = hd;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public void encender() {

		if (!this.encencido) {
			System.out.printf("El ordenador %s %s se está encenciedo \n", this.marca, this.modelo);
		}
		this.encencido = true;
	}

	public void apagar() {

		if (this.encencido) {
			System.out.printf("El ordenador %s %s se está apagando \n", this.marca, this.modelo);
		}

		this.encencido = false;
	}

	public void ejecutar(String programa) {

		if (this.encencido) {
			System.out.printf("Se está ejecutando el progrma %s en el ordenador %s %s \n", programa, this.marca,
					this.modelo);
		} else {
			System.out.printf("El ordenador %s %s no puede ejecutar el programa %s por que  está apagado \n", programa,
					this.marca, this.modelo);
		}
	}

	@Override
	public String toString() {
		return String.format(
				"Computadora: \n"
				+ "marca:%s \n"
				+ "modelo:%s \n"
				+ "Cpu:%s \n"
				+ "Hd:%s \n"
				+ "Memoria:%s \n",
				marca,
				modelo, 
				this.cpu,
				this.memoria,
				this.hd);
	}


	
	

}
