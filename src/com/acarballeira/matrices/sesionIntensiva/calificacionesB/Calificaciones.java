package com.acarballeira.matrices.sesionIntensiva.calificacionesB;

public class Calificaciones {

	private final int NUMALUMNOS = 4;
	private final int NUMASIGNATURAS = 3;

	private double[][] notas;

	public Calificaciones() {
		this.notas = new double[NUMALUMNOS][NUMASIGNATURAS];

	}

	public void setCalificacion(int alumno, int asignatura, double nota) {

		if ((alumno >= 0 && alumno < NUMALUMNOS) && (asignatura >= 0 && asignatura < NUMASIGNATURAS)
				&& (nota >= 0 && nota <= 10)) {

			notas[alumno][asignatura] = nota;
		} else {

			System.out.printf("Los valores introducidos no son validos \n");
			System.out.printf("Recuerda: \n");
			System.out.printf("Alumno  desde cero a %d \n", NUMALUMNOS);
			System.out.printf("Asignaturas  desde cero a %d \n", NUMASIGNATURAS);
			System.out.printf("Nota desde 0.0 a 10.0 \n");

		}

	}

	public double getCalificacion(int alumno, int asignatura) {
		
		double nota;
		
		if ((alumno >= 0 && alumno < NUMALUMNOS ) && (asignatura >= 0 && asignatura < NUMASIGNATURAS))  {
			
		 nota = notas[alumno][asignatura];
			
		}	 else {
			
			System.out.printf("Los indices de busqueda proporcionados no son validos , por integridad se devuelve el valor 0.0 \n");
			nota = 0.0;
		}	
		
		return nota;
		
	}

	public double mediaAlumno(int alumno) {
		double suma = 0;

		for (int asignatura = 0; asignatura < notas[alumno].length; asignatura++) {

			suma += notas[alumno][asignatura];

		}

		return (suma / notas[alumno].length);
	}

	public double mediaAsignatura(int asignatura) {

		double suma = 0;

		for (int alumno = 0; alumno < notas.length; alumno++) {

			suma += notas[alumno][asignatura];

		}

		return (suma / notas.length);
	}

	public double mejorNota() {

		double notaMaxima = notas[0][0];

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {

				if (notas[i][j] > notaMaxima) {
					notaMaxima = notas[i][j];
				}

			}

		}

		return notaMaxima;
	}
}
