package com.acarballeira.boletin3.bicicleta;

public class BicicletaCarretera extends Bicicleta {
	private boolean dropManillar;

	// Constructor con super()
	public BicicletaCarretera(int presionDelantera, int presionTrasera, int color, String tipo, int kmsCadena,
			boolean dropManillar) {
		super(presionDelantera, presionTrasera, color, tipo, kmsCadena);
		this.dropManillar = dropManillar;
	}

	// Getters/setters
	public boolean isDropManillar() {
		return dropManillar;
	}

	public void setDropManillar(boolean dropManillar) {
		this.dropManillar = dropManillar;
	}

	@Override
	public void comprobarEstadoCadena() {

		if (this.getKmsCadena() >= 1500 && this.getKmsCadena() <= 3000) {
			System.out.println("La cadena está demasiado gastada");
		} else if (this.getKmsCadena() > 3000) {
			System.out.println("SUSTITUIR INMEDIATAMENTE LA CADENA");

		} else {
			System.out.println("La cadena está OK");

		}

	}

}