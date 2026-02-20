package com.acarballeira.exercicio3.drivers;

import com.acarballeira.exercicio3.exercicio3_2.Computadora;
import com.acarballeira.exercicio3.exercicio3_2.Disco;
import com.acarballeira.exercicio3.exercicio3_2.Memoria;
import com.acarballeira.exercicio3.exercicio3_2.Portatil;
import com.acarballeira.exercicio3.exercicio3_2.Procesador;
import com.acarballeira.exercicio3.exercicio3_2.Raton;
import com.acarballeira.exercicio3.exercicio3_2.Sobremesa;
import com.acarballeira.exercicio3.exercicio3_2.Teclado;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_02 {

	public static void main(String[] args) {
		
		Procesador pr = new Procesador ("intel I9",4.2);
		Memoria mem = new Memoria(16);
		Disco disc = new Disco (1024,"SSD");

        // Crear Teclado y Ratón
        Teclado teclado = new Teclado("Logitech", "K120", "USB", "ES", false, false, 104, 0.5, false);
        Raton raton = new Raton("Logitech", "M185", "Inalámbrico", 1000, 3, true, 0.08, false, true);
        
        // Crear Sobremesa
        Sobremesa sobremesa = new Sobremesa("HP", "Pavilion", pr, disc,mem,  
                                            teclado, raton, 799.99, true, true, 4, 2);
        
        // Crear Portátil
        Portatil portatil = new Portatil("Dell", "XPS 15",  pr, disc,mem,
                                         "1920x1080", true, 15.6, 5000, 8.5);
        
        System.out.println("=== SOBREMESA ===");
        System.out.println(sobremesa);
        
        System.out.println("\n=== PORTÁTIL ===");
        System.out.println(portatil);
    }
		
}


