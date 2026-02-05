package com.acarballeira.exercicio1;

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

	
	//propiedades
		private String titulo;
		private String autor;
		private int numeroPaginas;
		
		
		//metodos
		//1º Constructor
		
		public Libro(String l , String a , int numP) {
			
			this.titulo = l;
			this.autor =  a;
			this.numeroPaginas = numP;
		}
		
		public String getTitulo() {
			return this.titulo;
			}
		
		public void setTitulo(String t) {
			this.titulo = t;
		}
		
		public int getNumeroPaginas() {
			
			return this.numeroPaginas;
			
		}
		
		public void setNumeropaginas(int numeroPaginas ) throws Exception {
			if(numeroPaginas >=0 ) {
				
				this.numeroPaginas = numeroPaginas;
			}else {
				
				throw new Exception("No se puede asignar un número negativo para el número de páginas");
			}
		}
		
			public void mostrarInformacion() {
			
			System.out.printf("Titulo:\t%s\nAutor:\t%s\nNúmero de páginas:\t%d\n",this.titulo,this.autor,this.numeroPaginas  );
			
		}
			
			class LibroDigital extends Libro{
				
				public LibroDigital(String l, String a, int numP, double tamanoArchivo, String formato) {
					super(l, a, numP);
					this.tamanoArchivo = tamanoArchivo;
					this.formato = formato;
				}
				
				private double tamanoArchivo; //MB
				private String formato;
				
			}

}

public class LibroApp{
	
	public static void main(String[] args) {

		Libro libro = new Libro("mortadelo","Ibañez",245);
		Libro libro2 = new Libro("Zipi y Zape","Escpbar",150);
		libro.mostrarInformacion();
		libro2.mostrarInformacion();
}
	
}