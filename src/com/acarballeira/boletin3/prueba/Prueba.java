package com.acarballeira.boletin3.prueba;

public class Prueba {
	private int[] lista;
	private String nombre;
	private int factor;

	public Prueba(int[] lista, String nombre, int factor) {
		this.lista = lista;
		this.nombre = nombre;
		this.factor = factor;
	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFactor() {
		return factor;
	}

	public void setFactor(int factor) {
		this.factor = factor;
	}

	public void rellenarLista() {

		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * (factor + 1)); // 0 a factor
		}
	}

	public void vaciarLista() {

		for (int i = 0; i < lista.length; i++) {
			lista[i] = 0;
		}
	}

	public int devolverValorMasAlto() {
		int max = lista[0];
		for (int valor : lista) {
			if (valor > max) {
				max = valor;
			}
		}
		return max;
	}

	public int devolverValorMasBajo() {
		int min = lista[0];
		for (int valor : lista) {
			if (valor < min) {
				min = valor;
			}
		}
		return min;
	}

	public void imprimirLista() {
		System.out.print(nombre + ": [");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]);
			if (i < lista.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	/**
	 * 
	 * @param valor El valor a buscar en la lista
	 * @param primera 0 para buscar desde el inicio, cualquier otro valor para buscar desde el final
	 * @return La posición (índice) donde se encuentra el valor, o -1 si no se encuentra
	 */
	public int contiene(int valor, int primera) {
	    int resultado = -1;
	    
	    if (primera == 0) {
	        for (int i = 0; i < lista.length; i++) {
	            if (lista[i] == valor) {
	                resultado = i;
	                break;
	            }
	        }
	    } else {
	        for (int i = lista.length - 1; i >= 0; i--) {
	            if (lista[i] == valor) {
	                resultado = i;
	                break;
	            }
	        }
	    }
	    
	    return resultado;
	}

}















