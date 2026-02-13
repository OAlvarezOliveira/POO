package com.acarballeira.exercicio1;

import java.util.Iterator;
import java.util.Objects;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

class Libro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private static int contadorLibros;

	public Libro(String titulo, String a, int numP) {
		this.titulo = titulo;
		this.autor = a;
		this.numeroPaginas = numP;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String t) {
		titulo = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) throws Exception {
		if (numeroPaginas >= 0) {
			this.numeroPaginas = numeroPaginas;
		} else {
			throw new Exception("No se puede asignar un número negativo para el número de páginas");
		}
	}

	public void mostrarInformacion() {

		System.out.printf("\n----------------\nTítulo:\t%s\nAutor:\t%s\nNúmero de páginas:\t%d\n", this.titulo,
				this.autor, this.numeroPaginas);
	}
	
	public static int getContadorLibros() {
		return contadorLibros;
	}

}

class LibroDigital extends Libro {

	private double tamanoArchivo; // MB
	private String formato;

	public LibroDigital(String titulo, String a, int numP, double tamanoArchivo, String formato) {
		super(titulo, a, numP);
		this.tamanoArchivo = tamanoArchivo;
		this.formato = formato;
	}

	public LibroDigital(String titulo, String a, int numP, double tamanoArchivo) {
		super(titulo, a, numP);
		this.tamanoArchivo = tamanoArchivo;
	}

	public double getTamanoArchivo() {
		return tamanoArchivo;
	}

	public void setTamanoArchivo(double tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public void mostrarInformacion() {

		System.out.printf(
				"\n----------------\nTítulo:\t%s\nAutor:\t%s\nNúmero de páginas:\t%d\nTamaño archivo:\t%.2f MB\nFormato:\t%s\n",
				this.getTitulo(), this.getAutor(), this.getNumeroPaginas(), this.tamanoArchivo,
				this.formato == null ? "No definido" : this.formato);
	}

	@Override
	public String toString() {
		return "Tamaño archivo: " + tamanoArchivo + "\n" + (formato != null ? "Formato: " + formato + "\n" : "")
				+ (getTitulo() != null ? "Titulo: " + getTitulo() + "\n" : "")
				+ (getAutor() != null ? "Autor:" + getAutor() + "\n" : "") + "Número de Páginas: " + getNumeroPaginas();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroDigital other = (LibroDigital) obj;

		return this.getTitulo().equals(other.getTitulo()) && this.getAutor().equals(other.getAutor());
	}

}// LibroDigital

class LibroImpreso extends Libro {

	private int peso;
	private String encuadernacion;

	public LibroImpreso(String titulo, String a, int numP, int peso, String encuadernacion) {
		super(titulo, a, numP);
		this.peso = peso;
		this.encuadernacion = encuadernacion;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getEncuadernacion() {
		return encuadernacion;
	}

	public void setEncuadernacion(String encuadernacion) {
		this.encuadernacion = encuadernacion;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.printf("Peso gr: %d\n", this.peso);
		System.out.printf("Tipo de encuadernación: %s\n", this.encuadernacion);
	}

	@Override
	public String toString() {
		return "Peso en gr: " + this.peso + "\n"
				+ (this.encuadernacion != null ? "Encuadernación: " + this.encuadernacion + "\n" : "")
				+ (getTitulo() != null ? "Titulo: " + getTitulo() + "\n" : "")
				+ (getAutor() != null ? "Autor:" + getAutor() + "\n" : "") + "Número de Páginas: " + getNumeroPaginas();
	}

	@Override
	public boolean equals(Object obj) {

		boolean igual = false;

		LibroImpreso other = (LibroImpreso) obj;

		/*
		 * if(this.getTitulo().equals(other.getTitulo())) {
		 * if(this.getAutor().equals(other.getAutor())) { if(this.peso == other.peso) {
		 * igual = true; } } }
		 * 
		 * return igual;
		 */

		return this.getTitulo().equals(other.getTitulo()) && this.getAutor().equals(other.getAutor())
				&& this.peso == other.peso;

	}

}// LibroImpreso


class Biblioteca{
	
	private static final int NUM_LIBROS = 100;
	private Libro[] libros;
	
	public Biblioteca() {
		this.libros = new Libro [NUM_LIBROS];
	}
	
	public void agregarLibro( Libro l ) {}
	
	public void mostarcatalogo() {}
	
}



public class LibroApp {

	public static void main(String[] args) throws Exception {
		
		Libro[] vector = new Libro[6];
		
		vector[0] = new Libro("Mortadelo y Filemón", "Ibañez", 300);
		vector[1] = new LibroDigital("Zipi y Zape", "Escobar", 200, 4.5, "ePub");
		vector[2] = new Libro("Introducción a la IA", "Frías", 237);
		vector[3] = new Libro("Power BI", "Julio Mosquera", 155);
		vector[4] = new LibroDigital("Power BI CookBook", "Varios", 685, 18.5, "PDF");
		vector[5] = new LibroDigital("Power BI CookBook", "Varios", 685, 18.5, "PDF");
		
		//Comparar solo los libros digitales para ver si son iguales
		boolean esIgual = false ;
	
		for (int i = 0; i < vector.length; i++) {
			
			for (int j = 0; j < vector.length; j++) {
				
				if( vector[i].equals(vector[j])){
					
					esIgual = true;
				}
				
			}
			
			System.out.println(esIgual);
		}

		System.out.println("Numero total de libros creados: " + Libro.getContadorLibros());
		
	}
}
