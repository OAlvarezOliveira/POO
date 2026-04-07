package com.acarballeira.matrices.sesionIntensiva.calificacionesB;

public class CalificacionesAPP {

	public static void main(String[] args) {
		
		Calificaciones cal = new Calificaciones();

		cal.setCalificacion(0, 0, 8.5);  // Alumno 0, Asig 0
		cal.setCalificacion(0, 1, 7.0);  // Alumno 0, Asig 1
		cal.setCalificacion(0, 2, 9.5);  // Alumno 0, Asig 2

		cal.setCalificacion(1, 0, 6.5);  // Alumno 1, Asig 0
		cal.setCalificacion(1, 1, 8.0);  // Alumno 1, Asig 1
		cal.setCalificacion(1, 2, 7.5);  // Alumno 1, Asig 2

		// Probar:
		System.out.println("Media alumno 0: " + cal.mediaAlumno(0));
		System.out.println("Media asignatura 0: " + cal.mediaAsignatura(0));
		System.out.println("Mejor nota: " + cal.mejorNota());
	}

}
