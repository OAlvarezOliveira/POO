package com.acarballeira.matrices.sesionIntensiva.Estudiante;

import java.util.Arrays;

public class Estudiante {
	
    private String nombre;
    private double[] calificaciones;
    private boolean[] calAsignadas;
    private static final int N_AVA = 3;
    
    
    
    // Constructor 1: sin parámetros (usa N_AVA)
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new double[N_AVA];
        this.calAsignadas = new boolean[N_AVA];
    }
    
    // Constructor 2: con número de evaluaciones
    public Estudiante(String nombre, int numAva) {
        this.nombre = nombre;
        this.calificaciones = new double[numAva];
        this.calAsignadas = new boolean[numAva];
    }
    
	public void setNota(double nota, int evaluacion) {

		if (nota < 0 || nota > 10) {

			System.out.println("La nota facilitada no cumple los parametros adecuados \n");
			return;
		} else if (evaluacion < 1 || evaluacion > this.calificaciones.length) {

		    System.out.printf("El numero de evaluacion debe estar comprendido entre 1 y %d \n", this.calificaciones.length);
		    return;
		} else {

			calificaciones[evaluacion - 1] = nota;			
			calAsignadas[evaluacion - 1] = true;
		}

	}
	
	public double calcularMedia() {
	    return Arrays.stream(this.calificaciones).average().getAsDouble();
	}
	
	public double obtenerNotaMaxima() {
	    return Arrays.stream(this.calificaciones).max().getAsDouble();
	}

	@Override
	public String toString() {
	    StringBuilder cadena = new StringBuilder();
	    cadena.append("\n........ Calificaciones .........");
	    cadena.append("\nNombre: " + this.nombre + "\n");

		for (int i = 0; i < calificaciones.length; i++) {
		    if (calAsignadas[i] == true) {
		        cadena.append("\tNota (" + (i + 1) + "): " + calificaciones[i] + "\n");
		    }
		}
		
	    return cadena.toString();

	}
	
	

}