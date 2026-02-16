package com.acarballeira.boletin2.coche;

public class Coche implements Comparable {  

	private String marca;
	private Motor motor; // ← UN objeto Motor
	private Rueda[] ruedas; // ← ARRAY de objetos Rueda (3 o 4)

	public Coche(String marca, Motor motor, Rueda[] ruedas) {
		this.marca = marca;
		this.motor = motor;
		this.ruedas = ruedas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public void arrancar() {
		motor.encender();
	}

	public void conducir() {

		for (int i = 0; i < this.ruedas.length; i++) {
	        this.ruedas[i].rodar();
	    }

//		for (Rueda rueda : this.ruedas) {  // ← Por cada rueda en el array
//		    rueda.rodar();
//		}

	}

	public void detener() {
		motor.apagar();
	}
	
	@Override
	public int compareTo(Object obj) {
	    Coche otro = (Coche) obj;  
	    
	    // 1. Comparar por caballos
	    if (this.motor.getCaballos() != otro.motor.getCaballos()) {
	        return this.motor.getCaballos() - otro.motor.getCaballos();
	    }
	    
	    // 2. Comparar por número de ruedas
	    if (this.ruedas.length != otro.ruedas.length) {
	        return this.ruedas.length - otro.ruedas.length;
	    }
	    
	    // 3. Comparar por tamaño de rueda (primera rueda)
	    if (this.ruedas[0].getTamano() != otro.ruedas[0].getTamano()) {
	        return this.ruedas[0].getTamano() - otro.ruedas[0].getTamano();
	    }
	    
	    // 4. Comparar por marca (orden alfabético)
	    return this.marca.compareTo(otro.marca);
	}
	
	
	@Override
	public String toString() {
	    return String.format("Coche [marca=%s, caballos=%d, ruedas=%d, tamaño rueda=%d]",
	                         this.marca, 
	                         this.motor.getCaballos(),
	                         this.ruedas.length,
	                         this.ruedas[0].getTamano());
	}

}
