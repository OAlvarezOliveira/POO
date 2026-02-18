package com.acarballeira.boletin3.prueba;

public class App_Prueba {
    public static void main(String[] args) {
        
        Prueba p = new Prueba(new int[10], "MiLista", 100);
        
        p.rellenarLista();
        p.imprimirLista();
        
        System.out.println("Máximo: " + p.devolverValorMasAlto());
        System.out.println("Mínimo: " + p.devolverValorMasBajo());
        
        System.out.println("Buscar 50 desde inicio: " + p.contiene(50, 0));
        
        p.vaciarLista();
        p.imprimirLista();
    }
}