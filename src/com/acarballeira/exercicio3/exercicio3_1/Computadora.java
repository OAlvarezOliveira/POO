package com.acarballeira.exercicio3.exercicio3_1;;


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
	private Boolean encencido;
	private String modelo;
	private String procesador;
	private int memoria; //MB
	private int disco; //GB
	
	
	public Computadora(String marca, String modelo, String procesador, int memoria, int disco) {
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
	
	public void encender(){
		
		if(!this.encencido) {		System.out.printf("El ordenador %s %s se está encenciedo \n",this.marca,this.modelo);
}
		this.encencido = true;
	}
	
	public void apagar(){
		
		if(this.encencido) {
		System.out.printf("El ordenador %s %s se está apagando \n",this.marca,this.modelo);
		}
		
		this.encencido = false;
	}
	
	public void ejecutar(String programa){
		
		if(this.encencido) {
		System.out.printf("Se está ejecutando el progrma %s en el ordenador %s %s \n",programa,this.marca,this.modelo);
		}
		else {	System.out.printf("El ordenador %s %s no puede ejecutar el programa %s por que  está apagado \n",programa,this.marca,this.modelo);
}
	}


	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", memoria="
				+ memoria + ", disco=" + disco + "]";
	}

	
	
	
}
