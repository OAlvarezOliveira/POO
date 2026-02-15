package com.acarballeira.exercicio2;

/**
 * Clase que representa una rueda de un coche.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.1 - CORREGIDA
 */
public class Rueda {

    // ============ ATRIBUTOS ============
    
    private String tipoRueda;      // Tipo: "Verano", "Invierno", "Allseason"
    private int diametroRueda;     // Diámetro en pulgadas
    
    
    // ============ CONSTRUCTOR ============
    
    /**
     * Constructor de Rueda.
     * 
     * @param tipoRueda Tipo de neumático (Verano, Invierno, Allseason)
     * @param diametroRueda Diámetro en pulgadas
     */
    public Rueda(String tipoRueda, int diametroRueda) {
        this.tipoRueda = tipoRueda;
        this.diametroRueda = diametroRueda;
    }
    
    
    // ============ GETTERS ============
    
    public String getTipoRueda() {
        return this.tipoRueda;
    }
    
    public int getDiametroRueda() {
        return this.diametroRueda;
    }
    
    
    // ============ MÉTODOS ============
    
    /**
     * Simula que la rueda está rodando.
     */
    void rodar() {
        System.out.println("rodando");
    }
}
