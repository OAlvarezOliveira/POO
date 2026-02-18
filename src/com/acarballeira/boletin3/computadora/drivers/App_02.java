package com.acarballeira.boletin3.computadora.drivers;

import com.acarballeira.boletin3.computadora.Portatil;
import com.acarballeira.boletin3.computadora.Raton;
import com.acarballeira.boletin3.computadora.Sobremesa;
import com.acarballeira.boletin3.computadora.Teclado;

public class App_02 {
    public static void main(String[] args) {
        
        // Crear Teclado y Ratón
        Teclado teclado = new Teclado("Logitech", "K120", "USB", "ES", false, false, 104, 0.5, false);
        Raton raton = new Raton("Logitech", "M185", "Inalámbrico", 1000, 3, true, 0.08, false, true);
        
        // Crear Sobremesa
        Sobremesa sobremesa = new Sobremesa("HP", "Pavilion", "Intel i5", 16384, 512, 
                                            teclado, raton, 799.99, true, true, 4, 2);
        
        // Crear Portátil
        Portatil portatil = new Portatil("Dell", "XPS 15", "Intel i7", 32768, 1024,
                                         "1920x1080", true, 15.6, 5000, 8.5);
        
        System.out.println("=== SOBREMESA ===");
        System.out.println(sobremesa);
        
        System.out.println("\n=== PORTÁTIL ===");
        System.out.println(portatil);
    }
}
