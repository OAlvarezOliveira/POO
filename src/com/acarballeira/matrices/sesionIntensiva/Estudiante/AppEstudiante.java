package com.acarballeira.matrices.sesionIntensiva.Estudiante;


public class AppEstudiante {
    
    public static void main(String[] args) {
        
        // Crear estudiante con 4 evaluaciones
        Estudiante e1 = new Estudiante("Óscar", 4);
        
        // Poner algunas notas
        e1.setNota(6, 1);
        e1.setNota(7, 2);
        e1.setNota(8, 4);
        
        // Mostrar
        System.out.println(e1);
        System.out.printf("Nota media: %.2f\n", e1.calcularMedia());
        System.out.printf("Nota máxima: %.2f\n", e1.obtenerNotaMaxima());
    }
}
