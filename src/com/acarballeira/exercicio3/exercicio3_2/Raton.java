package com.acarballeira.exercicio3.exercicio3_2;

public class Raton {
	

    private String modelo;

    
	public Raton(String modelo) {
		super();
		this.modelo = modelo;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	@Override
	public String toString() {
		return String.format(
				"Raton : "
				+ "modelo :%s\n "
				, modelo);
	}
    
	
    
}   
