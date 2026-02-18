package com.acarballeira.boletin3.computadora;

public class Teclado {
    private String marca;
    private String modelo;
    private String tipoConexion;
    private String idioma;
    private boolean mecanico;
    private boolean retroiluminado;
    private int numTeclas;
    private double peso;
    private boolean encendido;
    
	public Teclado(String marca, String modelo, String tipoConexion, String idioma, boolean mecanico,
			boolean retroiluminado, int numTeclas, double peso, boolean encendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoConexion = tipoConexion;
		this.idioma = idioma;
		this.mecanico = mecanico;
		this.retroiluminado = retroiluminado;
		this.numTeclas = numTeclas;
		this.peso = peso;
		this.encendido = encendido;
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

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isMecanico() {
		return mecanico;
	}

	public void setMecanico(boolean mecanico) {
		this.mecanico = mecanico;
	}

	public boolean isRetroiluminado() {
		return retroiluminado;
	}

	public void setRetroiluminado(boolean retroiluminado) {
		this.retroiluminado = retroiluminado;
	}

	public int getNumTeclas() {
		return numTeclas;
	}

	public void setNumTeclas(int numTeclas) {
		this.numTeclas = numTeclas;
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

	@Override
	public String toString() {
		return String.format(
				"Teclado: \n"
				+ "marca=%s  \n"
				+ "modelo=%s \n"
				+ "tipoConexion=%s \n"
				+ "idioma=%s \n"
				+ " mecanico=%b \n "
				+ "retroiluminado=%b  \n"
				+ "numTeclas=%d \n "
				+ "peso=%.2f "
				+ "encendido=%b \n",
				marca, modelo, tipoConexion, idioma, mecanico, retroiluminado, numTeclas, peso, encendido);
	}
    
}