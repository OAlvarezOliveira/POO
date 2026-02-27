package com.acarballeira.exercicio3.figura;
/**
 * Resolución de la tarea xx
 * 
 * Curso 2025-26
 * @author Julio Mosquera
 * @version 1.0
 */

public class Cuadrado extends Cuadrilatero {
    public Cuadrado(Punto origen, double lado) {
        super(origen, lado, lado);
    }

    @Override
    public double calcularArea() {
        return base * base;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * base;
    }
}