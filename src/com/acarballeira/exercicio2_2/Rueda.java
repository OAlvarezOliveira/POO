package com.acarballeira.exercicio2_2;

/**
 * Clase que representa una rueda de un coche.
 * Usa enum TipoRueda para los tipos de neumático.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 */
public class Rueda {
    
    // ============ ATRIBUTOS ============
    
    private int tamanho;        // Tamaño del diámetro en pulgadas
    private TipoRueda tipo;     // Tipo de neumático (enum)
    
    
    // ============ CONSTRUCTOR ============
    
    /**
     * Constructor de Rueda.
     * 
     * @param tamanho Tamaño del diámetro en pulgadas
     * @param tipo Tipo de neumático (enum)
     */
    public Rueda(int tamanho, TipoRueda tipo) {
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
    
    
    // ============ GETTERS ============
    
    public int getTamanho() {
        return tamanho;
    }
    
    public TipoRueda getTipo() {
        return tipo;
    }
    
    
    // ============ MÉTODOS ============
    
    /**
     * Simula que la rueda está rodando.
     */
    public void rodar() {
        System.out.printf("La rueda de tamaño %d pulgadas ( %s ) está rodando.%n", 
                          this.tamanho, this.tipo);
    }
}