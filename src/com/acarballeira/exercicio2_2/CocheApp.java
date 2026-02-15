package com.acarballeira.exercicio2_2;

import java.util.Arrays;

/**
 * Clase driver para probar el sistema de Coches con Enums.
 * Crea varios coches y los ordena usando Comparable.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 */
public class CocheApp {

    public static void main(String[] args) {
        
        // Crear coches usando el constructor simplificado (4 ruedas por defecto)
        Coche c1 = new Coche("Toyota", 120, TipoMotor.GASOLINA, 17, TipoRueda.VERANO);
        Coche c2 = new Coche("Audi", 420, TipoMotor.DIESEL, 18, TipoRueda.INVIERNO);
        Coche c3 = new Coche("BMW", 90, TipoMotor.HIBRIDO, 16, TipoRueda.ALLSEASON);
        Coche c4 = new Coche("Mercedes", 200, TipoMotor.GLP, 19, TipoRueda.VERANO);
        
        // Crear coche con objetos Motor y Ruedas personalizados (3 ruedas)
        Rueda[] vRueda = {
            new Rueda(19, TipoRueda.VERANO), 
            new Rueda(19, TipoRueda.VERANO), 
            new Rueda(19, TipoRueda.VERANO)
        };
        Coche c5 = new Coche("Volkswagen", new Motor(200, TipoMotor.GASOLINA), vRueda);
        
        
        // Poblamos array/vector de forma estática
        Coche[] coches = {c1, c2, c3, c4, c5};
        
        
        // ============ MOSTRAR ANTES DE ORDENAR ============
        
        System.out.println("=== COCHES ANTES DE ORDENAR ===");
        for (Coche c : coches) {
            System.out.println(c);
        }
        
        
        // ============ ORDENAR ============
        
        Arrays.sort(coches);
        
        
        // ============ MOSTRAR DESPUÉS DE ORDENAR ============
        
        System.out.println("\n\n=== COCHES DESPUÉS DE ORDENAR ===");
        System.out.println("(Por CV > Nº ruedas > Tamaño rueda > Marca)");
        for (Coche c : coches) {
            System.out.println(c);
        }
    }
}
