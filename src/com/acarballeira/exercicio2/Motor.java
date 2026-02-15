package com.acarballeira.exercicio2;

/**
 * Clase que representa el motor de un coche.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 */
public class Motor {

    // ============ ATRIBUTOS ============
    
    private int caballos;          // Potencia en CV
    private String tipoGasolina;   // Tipo: "Gasolina", "Diesel", "Hibrido", "GLP", "Electrico"
    
    
    // ============ CONSTRUCTOR ============
    
    /**
     * Constructor de Motor.
     * 
     * @param caballos Potencia del motor en CV
     * @param tipoGasolina Tipo de combustible
     */
    public Motor(int caballos, String tipoGasolina) {
        this.caballos = caballos;
        this.tipoGasolina = tipoGasolina;
    }
    
    
    // ============ GETTERS ============
    
    public String getTipoGasolina() {
        return this.tipoGasolina;
    }
    
    public int getCaballos() {
        return this.caballos;
    }
    
    
    // ============ MÉTODOS ============
    
    /**
     * Simula encender el motor.
     */
    void encender() {
        System.out.println("encendiendo");
    }
    
    /**
     * Simula apagar el motor.
     */
    void apagar() {
        System.out.println("apagando");
    }
}