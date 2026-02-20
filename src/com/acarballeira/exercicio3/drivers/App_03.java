package com.acarballeira.exercicio3.drivers;

import com.acarballeira.exercicio3.exercicio3_2.Disco;
import com.acarballeira.exercicio3.exercicio3_2.Memoria;
import com.acarballeira.exercicio3.exercicio3_2.Portatil;
import com.acarballeira.exercicio3.exercicio3_2.Procesador;
import com.acarballeira.exercicio3.exercicio3_2.Raton;
import com.acarballeira.exercicio3.exercicio3_2.Sobremesa;
import com.acarballeira.exercicio3.exercicio3_2.Teclado;

import java.util.Scanner;

import com.acarballeira.exercicio3.exercicio3_2.Computadora;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_03 {
	
	private static Computadora altaComputadora() {
		
		Computadora pc;
		char opcion;
		Scanner teclado;
		
		//valores temporales para almacenamiento
		String temCadena;
		double temReal;
		int temInt;
		
		teclado = new Scanner (System.in);
		
		do {
			
			System.out.println("Sobremesa (s) o Portatil (p) %n");
			opcion = teclado.nextLine().charAt(0);

			
		}while(opcion !='s' && opcion != 'p');
		
		
		if(opcion == 's') {
			
			pc = new Sobremesa();
			
		}else {
			
			pc = new Portatil();
		};
		
		System.out.println("Introduce Marca ");
		pc.setMarca(teclado.nextLine());
		
		System.out.println("Introduce Modelo ");
		pc.setModelo(teclado.nextLine());
		
		System.out.println("Introduce Modelo del Procesador ");
		temCadena = (teclado.nextLine());
		
		System.out.println("Introduce Velocidad del Procesador en Ghz ");
		temReal = (teclado.nextDouble());
		
		pc.setCpu(new Procesador (temCadena,temReal));
		
		System.out.println("Introduce Velocidad de la Memoria en GB ");
		temInt = (teclado.nextInt());
		pc.setMemoria(new Memoria (temInt));
		teclado.nextLine(); // consume el salto de linea
		
		
		System.out.println("Introduce tipo de disco ");
		temCadena = (teclado.nextLine());
		
		System.out.println("Introduce la capacidad del disco en GB ");
		temInt = (teclado.nextInt());
		pc.setHd(new Disco (temInt ,temCadena));
		
		
		if(pc instanceof Sobremesa) {
			
			Sobremesa pcs = (Sobremesa)pc;
			
			System.out.println("Introduce la marca del Raton ");
			pcs.setRaton(new Raton (teclado.nextLine()));
			
			System.out.println("Introduce el numTeclas del teclado ");
			pcs.setTeclado(new Teclado (teclado.nextInt()));
			
			return pcs;

			
			
		}
		
		
		
		return pc;
	}
	

	public static void main(String[] args) {
		
		Computadora c1,c2;
		
		
		
		System.out.println("Vamos a dar de alta dous ordenadores");
		
		System.out.println("Altado primeriro ordenador");
		c1= altaComputadora();
		
		
		System.out.println("Alta do segundo ordenador");
		c2= altaComputadora();
		
		
		System.out.println(c1);
		System.out.println(c2);



		
			
//				Procesador pr = new Procesador ("intel I9",4.2);
//				Memoria mem = new Memoria(16);
//				Disco disc = new Disco (1024,"SSD");
//
//		        // Crear Teclado y Ratón
//		        Teclado teclado = new Teclado("Logitech", "K120", "USB", "ES", false, false, 104, 0.5, false);
//		        Raton raton = new Raton("Logitech", "M185", "Inalámbrico", 1000, 3, true, 0.08, false, true);
//		        
//		        // Crear Sobremesa
//		        Sobremesa sobremesa = new Sobremesa("HP", "Pavilion", pr, disc,mem,  
//		                                            teclado, raton, 799.99, true, true, 4, 2);
//		        
//		        // Crear Portátil
//		        Portatil portatil = new Portatil("Dell", "XPS 15",  pr, disc,mem,
//		                                         "1920x1080", true, 15.6, 5000, 8.5);
//		        
//		        System.out.println("=== SOBREMESA ===");
//		        System.out.println(sobremesa);
//		        
//		        System.out.println("\n=== PORTÁTIL ===");
//		        System.out.println(portatil);
		    }
				
		
	}


