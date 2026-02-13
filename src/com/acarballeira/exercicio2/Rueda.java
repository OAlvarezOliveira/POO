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

public class Rueda {

	private String tipoRueda;

	private int diametroRueda;

	

	public Rueda(String tipoRueda, int diametroRueda) {

		this.tipoRueda = tipoRueda;

		this.diametroRueda = diametroRueda;

	}

	

	public String getTipoRueda() {

		return this.tipoRueda;

	}

	public int getDiametroRueda() {

		return this.diametroRueda;

	}

	void rodar(){

		System.out.println("rodando");

	}

}
