package com.acarballeira.exercicio3.figura;
/**
 * Resolución de la tarea xx
 * 
 * Curso 2025-26
 * @author Julio Mosquera
 * @version 1.0
 */

public class Triangulo implements Figura {
    private Punto origen;
    private double base;
    private double altura;
    private int color;
    private boolean visible;

    public Triangulo(Punto origen, double base, double altura) {
        this.origen = origen;
        this.base = base;
        this.altura = altura;
        this.color = 1;
        this.visible = false;
    }

    @Override
    public void pintar(int color) {
        if (color >= 1 && color <= 10) this.color = color;
    }

    @Override
    public void girar(double grados) {
        System.out.println("Triángulo girado " + grados + " grados.");
    }

    @Override
    public void desplazar(double dx, double dy) {
        origen.mover(dx, dy);
    }

    @Override
    public void redimensionar(double factor) {
        base *= factor;
        altura *= factor;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Triángulo isósceles (simplificación)
        double lado = Math.sqrt(Math.pow((base/2), 2) + Math.pow(altura, 2));
        return base + 2 * lado;
    }

    @Override
    public void mostrar() { visible = true; }
    @Override
    public void ocultar() { visible = false; }

    @Override
    public void imprimirEstado() {
        System.out.println("Triángulo en " + origen +
            ", base=" + base +
            ", altura=" + altura +
            ", color=" + Figura.COLORES[color - 1] +
            ", visible=" + visible);
    }
}
