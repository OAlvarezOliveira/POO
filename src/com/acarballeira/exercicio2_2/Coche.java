package com.acarballeira.exercicio2_2;

import java.util.Arrays;

public class Coche implements Comparable {

	private String marca;
	private Motor motor;
	private Rueda[] ruedas;
	
	public Coche(String marca, Motor motor, Rueda[] ruedas) {
		super();
		this.marca = marca;
		this.motor = motor;
		this.ruedas = ruedas;
	}
	
	public Coche(String marca, int caballos, TipoMotor tipoMotor, int tamanhoRueda, TipoRueda tipoRueda ) {
		this.marca = marca;
		this.motor = new Motor(caballos, tipoMotor);
		this.ruedas = new Rueda[4];
		for (int i = 0; i < ruedas.length; i++) {
			this.ruedas[i] = new Rueda(tamanhoRueda, tipoRueda);
		}
	}
	
	public Coche(String marca, int caballos, TipoMotor tipoMotor, int tamanhoRueda, TipoRueda tipoRueda, int numRuedas ) {
		this.marca = marca;
		this.motor = new Motor(caballos, tipoMotor);
		this.ruedas = new Rueda[numRuedas];
		for (int i = 0; i < numRuedas; i++) {
			this.ruedas[i] = new Rueda(tamanhoRueda, tipoRueda);
		}
	}	
	
	public int getCaballosMotor() {
		return this.motor.getCaballos();
	}
	
	public TipoMotor getTipoMotor() {
		return this.motor.getTipo();
	}

	public String getMarca() {
		return marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}
	
	public void arrancar() {
		System.out.println(" ... arrancando coche ...");
	}

	@Override
	public int compareTo(Object o) {
		
		Coche otro = (Coche) o;
		
		//Comparamos CV
		if(this.motor.getCaballos() < otro.motor.getCaballos()) {
			return -1;			
		} else if(this.motor.getCaballos() > otro.motor.getCaballos()) {
			return 1;
		}
		
		//Comparamos número de ruedas
		if(this.ruedas.length < otro.ruedas.length) {
			return -1;
		} if(this.ruedas.length > otro.ruedas.length) {
			return 1;
		}
		
		//Comparamos tamaño de rueda
		if(this.ruedas[0].getTamanho() < otro.ruedas[0].getTamanho()) {
			return -1;
		} else if(this.ruedas[0].getTamanho() < otro.ruedas[0].getTamanho()) {
			return 1;
		}
		//Comparamos marca
		return this.marca.compareTo(otro.marca);
		
	}

	@Override
	public String toString() {
		
		TipoRueda tipoRueda = this.ruedas[0].getTipo();
		
		TipoMotor motor= this.motor.getTipo();
		
	    // Capitalizamos la primera letra
	    String motorCapitalizado = capitalizar(motor);
	    String ruedaCapitalizado = capitalizar(tipoRueda);

	    return String.format("\n------------------\n"
	            + "Marca: %s \n"
	            + "Motor. CV: %d. %s\n"
	            + "Ruedas. Número: %d. Diámetro: %d. Tipo: %s", 
	            this.getMarca(), 
	            this.motor.getCaballos(), 
	            motorCapitalizado,
	            this.ruedas.length, 
	            this.ruedas[0].getTamanho(), 
	            ruedaCapitalizado); // Usamos la variable ya modificada
	}

	private String capitalizar(TipoMotor motor2) {
		String tipoCapitalizado = motor.getTipo.toString().substring(0, 1).toUpperCase() + motor.getTipo.toString().substring(1).toLowerCase();
		return tipoCapitalizado;
	}

	private String capitalizar(TipoRueda tipoRueda) {
		String tipoCapitalizado = tipoRueda.toString().substring(0, 1).toUpperCase() + tipoRueda.toString().substring(1).toLowerCase();
		return tipoCapitalizado;
	}

	
	

	
	
}
