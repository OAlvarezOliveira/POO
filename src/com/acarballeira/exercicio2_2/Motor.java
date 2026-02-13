package com.acarballeira.exercicio2_2;

public class Motor {
	
	private int caballos;
	private TipoMotor tipo;
	
	public Motor(int caballos, TipoMotor tipo) {
		this.caballos = caballos;
		this.tipo = tipo;
	}

	public int getCaballos() {
		return caballos;
	}

	public TipoMotor getTipo() {
		return tipo;
	}
	
	public void encender() {
		System.out.println("Motor encendido");
	}
	
	public void apagar() {
		System.out.println("... apagando motor ...");
	}
	
	

}
