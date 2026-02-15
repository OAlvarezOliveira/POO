package com.acarballeira.exercicio2;

import java.util.Arrays;

/**
 * Clase driver para probar el sistema de Coches.
 * Crea varios coches y los ordena usando Comparable.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.1 - CORREGIDA
 */
public class CocheApp {

    public static void main(String[] args) {

        final int NUM_COCHES = 5;
        
        Coche coches[] = new Coche[NUM_COCHES];
        
        // Crear coches usando el constructor simplificado (4 ruedas automáticas)
        coches[0] = new Coche("Toyota", 120, "Gasolina", 17, "Verano");
        coches[1] = new Coche("Audi", 120, "Diesel", 18, "Invierno");
        coches[2] = new Coche("BMW", 90, "Hibrido", 16, "Verano");
        coches[3] = new Coche("Mercedes", 200, "Gasolina", 19, "Invierno");
        
        // Crear coche con objetos personalizados (3 ruedas)
        Rueda[] vRueda = {
            new Rueda("Verano", 19),
            new Rueda("Verano", 19),
            new Rueda("Verano", 19)
        };
        coches[4] = new Coche("Volkswagen", new Motor(200, "GLP"), vRueda);

        
        // ============ MOSTRAR ANTES DE ORDENAR ============
        
        System.out.println("=== COCHES ANTES DE ORDENAR ===");
        for (Coche coche : coches) {
            System.out.println(coche);
        }
        
        
        // ============ ORDENAR ============
        
        Arrays.sort(coches);  // ✅ CORREGIDO: Descomentado para activar ordenamiento
        
        
        // ============ MOSTRAR DESPUÉS DE ORDENAR ============
        
        System.out.println("\n\n=== COCHES DESPUÉS DE ORDENAR ===");
        System.out.println("(Por CV > Nº ruedas > Diámetro > Marca)");
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}
