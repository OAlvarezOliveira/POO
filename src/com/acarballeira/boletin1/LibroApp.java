package com.acarballeira.boletin1;

import java.util.Objects;

class Libro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private static int contadorLibros = 0;

	public Libro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		contadorLibros++; // ← Añade esto
	}

	// Getter estático:
	public static int getContadorLibros() {
		return contadorLibros;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String mostrarInformacion() {

		return String.format(
				"Los datos del Libro son :\n" + "Titulo: %s \n" + "Autor: %s \n" + "Numero de Paginas: %d\n",
				this.titulo, this.autor, this.numeroPaginas);

	}

}

class LibroDigital extends Libro { // ← Hereda de Libro

	private double tamanoArchivo;
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

	@Override
	public String mostrarInformacion() {
		return super.mostrarInformacion()
				+ String.format("Tamano de Archivo: %.2f MB\nFormato: %s\n", this.tamanoArchivo, this.formato);
	}

	@Override
	public String toString() {
		return String.format("LibroDigital: \n" + "tamanoArchivo:%.2f\n," + "formato:%s\n" + "Titulo:%s\n"
				+ "Autor:%s\n" + "Numero de Paginas:%d", tamanoArchivo, formato, getTitulo(), getAutor(),
				getNumeroPaginas());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTitulo(), getAutor());
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;

		if (obj == null)
			return false; // excepcion obligatoria
		if (!(obj instanceof LibroDigital)) // excepcion obligatoria
			return false;

		LibroDigital other = (LibroDigital) obj;

		if (this == obj) {
			sonIguales = true;
		} else if (this.getTitulo().equals(other.getTitulo()) && this.getAutor().equals(other.getAutor())) {
			sonIguales = true;
		}

		return sonIguales;
	}

}

class LibroImpreso extends Libro {

	private int peso;
	private String encuadernacion;

	public LibroImpreso(String titulo, String autor, int numeroPaginas, int peso, String encuadernacion) {
		super(titulo, autor, numeroPaginas);
		this.peso = peso;
		this.encuadernacion = encuadernacion;
	}

	@Override
	public String mostrarInformacion() {
		return super.mostrarInformacion()
				+ String.format("Peso: %d gramos \n" + "Encuadernacion: %s\n", this.peso, this.encuadernacion);
	}

	@Override
	public String toString() {
		return String.format(
				"LibroImpreso: \n Peso:%d \n,Encuadernacion: %s \n,Titulo: %s\n,Autor:%s,NumeroPaginas:%d \n", peso,
				encuadernacion, getTitulo(), getAutor(), getNumeroPaginas());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTitulo(), getAutor(), peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof LibroImpreso)) {
			return false;
		}
		LibroImpreso other = (LibroImpreso) obj;

		return this.getTitulo().equals(other.getTitulo()) && this.getAutor().equals(other.getAutor())
				&& peso == other.peso;
	}

}

class Biblioteca {
    private Libro[] catalogo;
    private int numLibros;

    public Biblioteca() {
        this.catalogo = new Libro[100];
        this.numLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        if (numLibros < 100) {
            catalogo[numLibros] = libro;
            numLibros++;
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < numLibros; i++) {
            System.out.println(catalogo[i].mostrarInformacion());
        }
    }
}


public class LibroApp {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarLibro(new Libro("Mortadelo", "Ibañez", 245));
		biblioteca.agregarLibro(new LibroDigital("Clean Code", "Martin", 431, 2.5, "PDF"));
		biblioteca.agregarLibro(new LibroImpreso("Don Quijote", "Cervantes", 863, 450, "Tapa dura"));

		System.out.println("=== CATÁLOGO ===");
		biblioteca.mostrarCatalogo();

		System.out.println("Total libros creados: " + Libro.getContadorLibros());

	}

}
