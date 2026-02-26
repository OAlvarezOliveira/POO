package com.acarballeira.boletin3.bicicleta;

public class Bicicleta {

	private int[] presion = new int[2]; // [0]= delantera [1]= trasera
	private int color; // Valores de 1-10
	private String tipo;
	private int kmsCadena;

	public Bicicleta(int presionDelantera, int presionTrasera, int color, String tipo, int kmsCadena) {
		this.presion = new int[2];
		this.presion[0] = presionDelantera;
		this.presion[1] = presionTrasera;
		this.color = color;
		this.tipo = tipo;
		this.kmsCadena = kmsCadena;
	}

	public int getPresionDelantera() {
		return this.presion[0];
	}

	public int getPresionTrasera() {
		return this.presion[1];
	}

	public void setPresionDelantera(int presion) {
		this.presion[0] = presion;
	}

	public void setPresionTrasera(int presion) {
		this.presion[1] = presion;
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
		return kmsCadena;
	}

	public void setKmsCadena(int kmsCadena) {
		this.kmsCadena = kmsCadena;
	}

	public void comprobarEstadoCadena() {

		if (this.kmsCadena >= 500 && this.kmsCadena <= 2000) {
			System.out.println("La cadena está demasiado gastada");
		} else if (this.kmsCadena > 2000) {
			System.out.println("SUSTITUIR INMEDIATAMENTE LA CADENA");

		} else {
			System.out.println("La cadena está OK");

		}

	}

}
