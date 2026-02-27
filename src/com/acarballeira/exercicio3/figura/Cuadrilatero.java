package com.acarballeira.exercicio3.figura;
/**
 * Resolución de la tarea xx
 * 
 * Curso 2025-26
 * @author Julio Mosquera
 * @version 1.0
 */

public abstract class Cuadrilatero implements Figura {
    protected Punto origen;
    protected double base;
    protected double altura;
    protected int color; 
    protected boolean visible;

    public Cuadrilatero(Punto origen, double base, double altura) {
        this.origen = origen;
        this.base = base;
        this.altura = altura;
        this.color = 1; // por defecto "Rojo"
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
        System.out.println(getClass().getSimpleName() + " girado " + grados + " grados.");
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
    public void mostrar() {
        visible = true;
    }

    @Override
    public void ocultar() {
        visible = false;
    }
    
    

    @Override
    public void imprimirEstado() {
        System.out.println(getClass().getSimpleName() + 
            " en " + origen + 
            ", base=" + base + 
            ", altura=" + altura +
            ", color=" + Figura.COLORES[color - 1] +
            ", visible=" + visible);
    }
}