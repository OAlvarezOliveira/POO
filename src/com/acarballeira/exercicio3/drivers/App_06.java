package com.acarballeira.exercicio3.drivers;

import java.util.Random;

import com.acarballeira.exercicio3.bicicleta.Bicicleta;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_06 {

	public static void main(String[] args) {


		Bicicleta bh = new Bicicleta();
		bh.setKmsCadena(1500);
		bh.setPresion(0, 43);
		bh.setPresion(1, 43);
		bh.setTipo("MTB");
		bh.setColor(new Random().nextInt(11));
		
		System.out.println(bh);
		bh.comprobarEstadoCadena();

	}

}
