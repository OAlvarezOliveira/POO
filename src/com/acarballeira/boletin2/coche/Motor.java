package com.acarballeira.boletin2.coche;

public class Motor {
	
	
	private TipoMotor tipo;
	private int caballos;

	public Motor(TipoMotor tipo, int caballos) {
		this.tipo = tipo;
		this.caballos = caballos;
	}
	public TipoMotor getTipo() {
		return tipo;
	}
	public void setTipo(TipoMotor tipo) {
		this.tipo = tipo;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public void encender() {
		System.out.println("El coche está encendido");

	}
	
	public void apagar() {
		System.out.println("El coche está apagado");

	}
	
}
