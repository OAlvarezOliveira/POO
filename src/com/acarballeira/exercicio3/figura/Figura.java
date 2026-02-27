package com.acarballeira.exercicio3.figura;
/**
 * Resolución de la tarea xx
 * 
 * Curso 2025-26
 * @author Julio Mosquera
 * @version 1.0
 */

public interface Figura {
    // Colores válidos
    String[] COLORES = {
        "Rojo", "Verde", "Azul", "Amarillo", "Naranja",
        "Morado", "Negro", "Blanco", "Gris", "Rosa"
    };

    // Métodos que toda figura debe implementar
    void pintar(int color);     // color en rango 1–10
    void girar(double grados);
    void desplazar(double dx, double dy);
    void redimensionar(double factor);

    double calcularArea();
    double calcularPerimetro();

    void mostrar();
    void ocultar();
    void imprimirEstado();
}
