package com.acarballeira.exercicio3.figura;
/**
 * Resolución de la tarea xx
 * 
 * Curso 2025-26
 * @author Julio Mosquera
 * @version 1.0
 */

public class Circulo implements Figura {
    private Punto centro;
    private double radio;
    private int color;
    private boolean visible;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
        this.color = 1;
        this.visible = false;
    }

    @Override
    public void pintar(int color) {
        if (color >= 1 && color <= 10) {
            this.color = color;
        } else {
            System.out.println("Color no válido, usando por defecto.");
            this.color = 1;
        }
    }

    @Override
    public void girar(double grados) {
        System.out.println("Un círculo girado sigue siendo igual 😅");
    }

    @Override
    public void desplazar(double dx, double dy) {
        centro.mover(dx, dy);
    }

    @Override
    public void redimensionar(double factor) {
        radio *= factor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrar() { visible = true; }
    @Override
    public void ocultar() { visible = false; }

    @Override
    public void imprimirEstado() {
        System.out.println("Círculo en " + centro +
            ", radio=" + radio +
            ", color=" + Figura.COLORES[color - 1] +
            ", visible=" + visible);
    }
}
