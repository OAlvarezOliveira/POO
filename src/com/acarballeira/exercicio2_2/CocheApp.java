package com.acarballeira.exercicio2_2;

import java.util.Arrays;

public class CocheApp {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Toyota", 120, TipoMotor.GASOLINA, 17, TipoRueda.VERANO);
		Coche c2 = new Coche("Audi", 420, TipoMotor.DIESEL, 18, TipoRueda.INVIERNO);
		Coche c3 = new Coche("BMW", 90, TipoMotor.HIBRIDO, 16, TipoRueda.ALLSEASON);
		Coche c4 = new Coche("Mercedes", 200, TipoMotor.GLP, 19, TipoRueda.VERANO);
		
		Rueda[] vRueda = {new Rueda(19, TipoRueda.VERANO), new Rueda(19, TipoRueda.VERANO), new Rueda(19, TipoRueda.VERANO)};
		Coche c5 = new Coche("Volkswagen", new Motor(200, TipoMotor.GASOLINA), vRueda);
		
		
		//Poblamos array/vector de forma estática
		Coche[] coches = {c1, c2, c3, c4, c5};		
		
		Arrays.sort(coches);
		
		for(Coche c : coches) {
			System.out.println(c);
		}

	}

}
