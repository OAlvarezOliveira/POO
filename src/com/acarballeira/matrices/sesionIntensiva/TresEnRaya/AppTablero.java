package com.acarballeira.matrices.sesionIntensiva.TresEnRaya;


public class AppTablero {
    
    public static void main(String[] args) {
        
        // Crear tablero vacío
        Tablero t = new Tablero();
        
        System.out.println("Tablero inicial:");
        t.mostrar();
        
        // Colocar algunas fichas
        t.colocarFicha(0, 0, 'X');
        t.colocarFicha(1, 1, 'O');
        t.colocarFicha(2, 2, 'X');
        t.colocarFicha(0, 2, 'O');
        
        System.out.println("\nTablero con fichas:");
        t.mostrar();
        
        // Probar error: casilla ocupada
        System.out.println("\nIntentando colocar en casilla ocupada:");
        t.colocarFicha(0, 0, 'O');
        
        // Probar error: posición inválida
        System.out.println("\nIntentando colocar en posición inválida:");
        t.colocarFicha(5, 5, 'X');
    }
}
