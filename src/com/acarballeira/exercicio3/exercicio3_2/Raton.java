package com.acarballeira.exercicio3.exercicio3_2;

public class Raton {
	
    private String marca;
    private String modelo;
    private String tipoConexion;
    private int dpi;
    private int numBotones;
    private boolean inalambrico;
    private double peso;
    private boolean encendido;
    private boolean ergonomico;
    
	public Raton(String marca, String modelo, String tipoConexion, int dpi, int numBotones, boolean inalambrico,
			double peso, boolean encendido, boolean ergonomico) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoConexion = tipoConexion;
		this.dpi = dpi;
		this.numBotones = numBotones;
		this.inalambrico = inalambrico;
		this.peso = peso;
		this.encendido = encendido;
		this.ergonomico = ergonomico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoConexion() {
		return tipoConexion;
	}

	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	public int getNumBotones() {
		return numBotones;
	}

	public void setNumBotones(int numBotones) {
		this.numBotones = numBotones;
	}

	public boolean isInalambrico() {
		return inalambrico;
	}

	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public boolean isErgonomico() {
		return ergonomico;
	}

	public void setErgonomico(boolean ergonomico) {
		this.ergonomico = ergonomico;
	}

	@Override
	public String toString() {
		return String.format(
				"Raton : "
				+ "marca :%s \n "
				+ "modelo :%s\n "
				+ "tipoConexion :%s \n "
				+ "dpi :%d \n "
				+ "numBotones :%d \n "
				+ "inalambrico :%b \n "
				+ "peso :%.2f \n "
				+ "encendido :%b \n "
				+ "ergonomico :%b \n ",
				marca, modelo, tipoConexion, dpi, numBotones, inalambrico, peso, encendido, ergonomico);
	}
    
	
    
}   
