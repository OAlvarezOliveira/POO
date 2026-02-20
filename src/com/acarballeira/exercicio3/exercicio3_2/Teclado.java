package com.acarballeira.exercicio3.exercicio3_2;

public class Teclado {
//    private String marca;
//    private String modelo;
//    private String tipoConexion;
//    private String idioma;
//    private boolean mecanico;
//    private boolean retroiluminado;
   private int numTeclas;
//    private double peso;
//    private boolean encendido;
    
	public Teclado( int numTeclas) {
		super();

		this.numTeclas = numTeclas;

	}

	public int getNumTeclas() {
		return numTeclas;
	}



	@Override
	public String toString() {
		return String.format(
				"Teclado: \n"
				+ "numTeclas=%d \n ",
				numTeclas);
	}
    
}