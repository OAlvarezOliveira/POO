package com.acarballeira.exercicio2;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Motor {

	private int caballos;

	private String tipoGasolina;

	

	public Motor(int caballos, String tipoGasolina) {

		this.caballos = caballos;

		this.tipoGasolina = tipoGasolina;

	}

	

	public String getTipoGasolina() {

		return this.tipoGasolina;

	}

	public int getCaballos() {

		return this.caballos;

	}

	void encender() {

		System.out.println("encendiendo");

	}

	void apagar() {

		System.out.println("apagando");

	}

}
