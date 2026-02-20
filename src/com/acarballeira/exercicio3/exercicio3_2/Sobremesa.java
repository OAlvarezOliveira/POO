package com.acarballeira.exercicio3.exercicio3_2;


public class Sobremesa extends Computadora {

	private Teclado teclado;
	private Raton raton;
	private double precio;
	private boolean wifi;
	private boolean bluetooth;
	private int puertosUSB;
	private int puertosHDMI;



	public Sobremesa(String marca, String modelo, Procesador cpu, Disco hd, Memoria memoria, Teclado teclado,
			Raton raton, double precio, boolean wifi, boolean bluetooth, int puertosUSB, int puertosHDMI) {
		super(marca, modelo, cpu, hd, memoria);
		this.teclado = teclado;
		this.raton = raton;
		this.precio = precio;
		this.wifi = wifi;
		this.bluetooth = bluetooth;
		this.puertosUSB = puertosUSB;
		this.puertosHDMI = puertosHDMI;
	}
	
	public Sobremesa() {
		super();

	}


	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public int getPuertosUSB() {
		return puertosUSB;
	}

	public void setPuertosUSB(int puertosUSB) {
		this.puertosUSB = puertosUSB;
	}

	public int getPuertosHDMI() {
		return puertosHDMI;
	}

	public void setPuertosHDMI(int puertosHDMI) {
		this.puertosHDMI = puertosHDMI;
	}

	@Override
	public String toString() {
	    return super.toString() +
	           String.format("\nTeclado: %s %s\nRatón: %s %s\nPrecio: %.2f€\nWiFi: %b",
	                         teclado.getNumTeclas(),
	                         raton.getModelo(),
	                         precio, wifi);
	}
	
	
	

}






