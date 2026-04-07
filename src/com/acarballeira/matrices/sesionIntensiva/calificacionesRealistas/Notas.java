package com.acarballeira.matrices.sesionIntensiva.calificacionesRealistas;

public class Notas {
    
    private double[][] calificaciones;
    private static final int NUM_ALUMNOS = 4;
    private static final int NUM_EXAMENES = 3;
    
    
    
    public Notas() {
        this.calificaciones = new double[NUM_ALUMNOS][NUM_EXAMENES];
        
        // Inicializar todo a 0.0
        for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
            for (int examen = 0; examen < NUM_EXAMENES; examen++) {
                this.calificaciones[alumno][examen] = 0.0;
            }
        }
    }
    
    public void setNota(int alumno, int examen, double nota) {
        // Validar alumno
        if (alumno < 0 || alumno >= NUM_ALUMNOS) {
            System.out.println("Error: Alumno debe estar entre 0 y " + (NUM_ALUMNOS - 1));
            return;
        }
        
        // Validar examen
        if (examen < 0 || examen >= NUM_EXAMENES) {
            System.out.println("Error: Examen debe estar entre 0 y " + (NUM_EXAMENES - 1));
            return;
        }
        
        // Validar nota
        if (nota < 0 || nota > 10) {
            System.out.println("Error: Nota debe estar entre 0 y 10");
            return;
        }
        
        // Asignar nota
        this.calificaciones[alumno][examen] = nota;
    }  
    
    
    public double calcularMediaAlumno(int alumno) {
        double suma = 0;
        for (int examen = 0; examen < NUM_EXAMENES; examen++) {
            suma += this.calificaciones[alumno][examen];
        }
        return suma / NUM_EXAMENES;
    }
    
    
    public double calcularMediaExamen(int examen) {
        double suma = 0;
        for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
            suma += this.calificaciones[alumno][examen];
        }
        return suma / NUM_ALUMNOS;
    }
    
    public double obtenerNotaMaxima() {
        double max = 0;
        for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
            for (int examen = 0; examen < NUM_EXAMENES; examen++) {
                if (this.calificaciones[alumno][examen] > max) {
                    max = this.calificaciones[alumno][examen];
                }
            }
        }
        return max;
    }
    
    public void mostrar() {
        System.out.println("\n===== TABLA DE NOTAS =====");
        System.out.println("        Ex0   Ex1   Ex2");
        
        for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
            System.out.print("Alum" + alumno + ":  ");
            for (int examen = 0; examen < NUM_EXAMENES; examen++) {
                System.out.printf("%.1f  ", this.calificaciones[alumno][examen]);
            }
            System.out.println();
        }
    }
}
