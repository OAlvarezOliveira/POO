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


public class Coche implements Comparable{

	private final static int NUM_RUEDAS = 4;

	private Motor motor;

	private Rueda[] ruedas;

	String marca;

	

	public Coche(String marca,int caballos, String tipoGasolina, int diametroRueda, String tipoRueda) {

		this.marca = marca;

		this.motor = new Motor(caballos,tipoGasolina);

		this.ruedas = new Rueda[NUM_RUEDAS];

		for (int i = 0 ; i < NUM_RUEDAS ; i++) {

			this.ruedas[i] = new Rueda(tipoRueda,diametroRueda);

		}

	}

//	public Coche(String marca, Motor motor, Rueda[] ruedas) {

//		this.marca = marca;

//		this.motor = motor;

//		this.ruedas = ruedas;

//	}

	public String getMarca() {

		return this.marca;

	}

	public int getCaballos() {

		return this.motor.getCaballos();

	}

	public String getTipoGasolina() {

		return this.motor.getTipoGasolina();

	}

	public int getDiametroRueda(){

		return this.ruedas[0].getDiametroRueda();

	}

	public String getTipoRueda() {

		return this.ruedas[0].getTipoRueda();

	}

	@Override

	public String toString() {

		return "Coche [" + (getMarca() != null ? "Marca =" + getMarca() + ", " : "") + "Caballos ="

				+ getCaballos() + ", "

				+ (getTipoGasolina() != null ? "Tipo de Gasolina =" + getTipoGasolina() + ", " : "")

				+ "Diametro de Rueda =" + getDiametroRueda() + ", "

				+ (getTipoRueda() != null ? "Tipo de Rueda =" + getTipoRueda() : "") + "]";

	}

	void arrancar(){

		

	}

	void conducir(){

		

	}

	void detener(){

		

	}

	@Override

	public int compareTo(Object o) {

		Coche coche = (Coche) o;

		

		return 0;

	}

	

}