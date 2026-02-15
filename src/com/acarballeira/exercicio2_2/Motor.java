package com.acarballeira.exercicio2_2;

/**
 * Clase que representa el motor de un coche.
 * Usa enum TipoMotor para los tipos de combustible.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez  
 * @version 1.0
 */
public class Motor {
    
    // ============ ATRIBUTOS ============
    
    private int caballos;       // Potencia en CV
    private TipoMotor tipo;     // Tipo de motor (enum)
    
    
    // ============ CONSTRUCTOR ============
    
    /**
     * Constructor de Motor.
     * 
     * @param caballos Potencia del motor en CV
     * @param tipo Tipo de motor (enum)
     */
    public Motor(int caballos, TipoMotor tipo) {
        this.caballos = caballos;
        this.tipo = tipo;
    }
    
    
    // ============ GETTERS ============
    
    public int getCaballos() {
        return caballos;
    }
    
    public TipoMotor getTipo() {
        return tipo;
    }
    
    
    // ============ MÉTODOS ============
    
    /**
     * Simula encender el motor.
     */
    public void encender() {
        System.out.println("Motor encendido");
    }
    
    /**
     * Simula apagar el motor.
     */
    public void apagar() {
        System.out.println("... apagando motor ...");
    }
}