package com.acarballeira.matrices.sesionIntensiva.calificacionesRealistas;

public class AppNotas {
    public static void main(String[] args) {
        
        Notas notas = new Notas();
        
        // Poner notas
        notas.setNota(0, 0, 7.5);
        notas.setNota(0, 1, 8.0);
        notas.setNota(0, 2, 6.5);
        
        notas.setNota(1, 0, 9.0);
        notas.setNota(1, 1, 8.5);
        notas.setNota(1, 2, 9.5);
        
        notas.setNota(2, 0, 5.0);
        notas.setNota(2, 1, 6.0);
        notas.setNota(2, 2, 5.5);
        
        notas.setNota(3, 0, 7.0);
        notas.setNota(3, 1, 7.5);
        notas.setNota(3, 2, 8.0);
        
        // Mostrar
        notas.mostrar();
        
        System.out.printf("\nMedia alumno 0: %.2f\n", notas.calcularMediaAlumno(0));
        System.out.printf("Media alumno 1: %.2f\n", notas.calcularMediaAlumno(1));
        System.out.printf("\nMedia examen 0: %.2f\n", notas.calcularMediaExamen(0));
        System.out.printf("Nota máxima: %.2f\n", notas.obtenerNotaMaxima());
    }
}
