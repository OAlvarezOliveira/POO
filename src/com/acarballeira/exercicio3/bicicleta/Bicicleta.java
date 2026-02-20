package com.acarballeira.exercicio3.bicicleta;

import java.util.Arrays;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Bicicleta {

	private int[] presion; //primer elemento presion delatera segundo elemento presion trasera
	
	private int color;
	private String tipo;
	private int KmsCadena;
	
	
	public Bicicleta() {
		
		this.presion= new int [2]; 

	}

	public Bicicleta(int[] presion, int color, String tipo, int kmsCadena) {
		super();
		this.presion = presion;
		this.color = color;
		this.tipo = tipo;
		KmsCadena = kmsCadena;
	}

	public int[] getPresion() {
		return presion;
	}
	
	public int getPresion(int IdRueda) {
		return this.presion[IdRueda];
	}

	public void setPresion(int[] presion) {
		this.presion = presion;
	}
	

	public void setPresion(int IdRueda ,int presion) {
		this.presion[IdRueda] = presion;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getKmsCadena() {
		return KmsCadena;
	}

	public void setKmsCadena(int kmsCadena) {
		KmsCadena = kmsCadena;
	}
	
	public void comprobarEstadoCadena() {
		
		if(this.KmsCadena  <= 1800 ){
			
			System.out.println("La cadena está en buen estado.");

			
		}else if(this.KmsCadena  >1800 && this.KmsCadena  <=2000 ){
			
			System.out.println("La cadena está demasiado gastada.");

			
		}else {
			
			System.out.println("SUSTITUIR INMEDIATAMENTE LA CADENA.");

		}
		
	}


	@Override
	public String toString() {
	    return String.format("Bicicleta: \n"
	    		
	    		+ "presionDelantera=%d,\n"
	    		+ "presionTrasera=%d, \n"
	    		+ "color=%d, \n"
	    		+ "tipo=%s,\n"
	    		+ "KmsCadena%d, \n", 
	    		this.presion[0],
	    		this.presion[0],
	            color, 
	            tipo, 
	            KmsCadena);
	}	

}
