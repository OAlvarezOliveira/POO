package com.acarballeira.boletin3.bicicleta;

public class BTT extends Bicicleta {

	private int recorridoSuspensionDelantera;
	private int recorridoSuspensionTrasera;

	// Constructor con super()

	public BTT(int presionDelantera, int presionTrasera, int color, String tipo, int kmsCadena,
			int recorridoSuspensionDelantera, int recorridoSuspensionTrasera) {
		super(presionDelantera, presionTrasera, color, tipo, kmsCadena);
		this.recorridoSuspensionDelantera = recorridoSuspensionDelantera;
		this.recorridoSuspensionTrasera = recorridoSuspensionTrasera;
	}
	
	// Getters/setters
	public int getRecorridoSuspensionDelantera() {
		return recorridoSuspensionDelantera;
	}

	public void setRecorridoSuspensionDelantera(int recorridoSuspensionDelantera) {
		this.recorridoSuspensionDelantera = recorridoSuspensionDelantera;
	}

	public int getRecorridoSuspensionTrasera() {
		return recorridoSuspensionTrasera;
	}

	public void setRecorridoSuspensionTrasera(int recorridoSuspensionTrasera) {
		this.recorridoSuspensionTrasera = recorridoSuspensionTrasera;
	}

}