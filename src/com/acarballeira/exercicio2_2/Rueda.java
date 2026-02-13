package com.acarballeira.exercicio2_2;

public class Rueda {
	
	private int tamanho;
	private TipoRueda tipo;
	
	public Rueda(int tamanho, TipoRueda tipo) {
		super();
		this.tamanho = tamanho;
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public TipoRueda getTipo() {
		return tipo;
	}
	
	public void rodar() {
		System.out.printf("La rueda de tamaño %d pulgadas ( %s ) está rodando.%n", this.tamanho, this.tipo);
	}
	
	

}
