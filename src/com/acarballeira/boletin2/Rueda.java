package com.acarballeira.boletin2;

public class Rueda {

	private TipoRueda  tipo;
	private int tamano;

	public Rueda(TipoRueda tipo, int tamano) {
		this.tipo = tipo;
		this.tamano = tamano;
	}

	public TipoRueda getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoRueda tipo) {
		this.tipo = tipo;
	}

	public int getTamano() {
		return this.tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public void rodar() {

		System.out.println("La rueda está rodando");
	}

}
