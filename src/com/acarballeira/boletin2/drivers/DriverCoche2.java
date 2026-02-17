package com.acarballeira.boletin2.drivers;

import java.util.Arrays;

import com.acarballeira.boletin2.Coche;
import com.acarballeira.boletin2.Motor;
import com.acarballeira.boletin2.Rueda;
import com.acarballeira.boletin2.TipoMotor;
import com.acarballeira.boletin2.TipoRueda;


public class DriverCoche2 {

	public static void main(String[] args) {
			
		// 1. Crear coches (con sus ruedas inicializadas)

		// Coche 1: 150 caballos, 4 ruedas
		Motor motor1 = new Motor(TipoMotor.GASOLINA, 150);
		Rueda[] ruedas1 = new Rueda[4];
		// Ruedas coche 1
		ruedas1[0] = new Rueda(TipoRueda.DEPORTIVO, 18);
		ruedas1[1] = new Rueda(TipoRueda.DEPORTIVO, 18);
		ruedas1[2] = new Rueda(TipoRueda.DEPORTIVO, 18);
		ruedas1[3] = new Rueda(TipoRueda.DEPORTIVO, 18);
		Coche coche1 = new Coche("Toyota", motor1, ruedas1);

		// Coche 2: 120 caballos, 4 ruedas
		Motor motor2 = new Motor(TipoMotor.DIESEL, 120);
		Rueda[] ruedas2 = new Rueda[4];
		// Ruedas coche 2
		ruedas2[0] = new Rueda(TipoRueda.VERANO, 17);
		ruedas2[1] = new Rueda(TipoRueda.VERANO, 17);
		ruedas2[2] = new Rueda(TipoRueda.VERANO, 17);
		ruedas2[3] = new Rueda(TipoRueda.VERANO, 17);
		Coche coche2 = new Coche("BMW", motor2, ruedas2);

		// Coche 3: Mercedes 180 caballos, 4 ruedas
		Motor motor3 = new Motor(TipoMotor.GASOLINA, 180);
		Rueda[] ruedas3 = new Rueda[3];
		// Ruedas coche 3
		ruedas3[0] = new Rueda(TipoRueda.DEPORTIVO, 19);
		ruedas3[1] = new Rueda(TipoRueda.DEPORTIVO, 19);
		ruedas3[2] = new Rueda(TipoRueda.DEPORTIVO, 19);
		Coche coche3 = new Coche("Mercedes", motor3, ruedas3);

		// Coche 4: AUDI 250 caballos, 4 ruedas
		Motor motor4 = new Motor(TipoMotor.DIESEL, 250);
		Rueda[] ruedas4 = new Rueda[4];
		// Ruedas coche 4
		ruedas4[0] = new Rueda(TipoRueda.TODOTERRENO, 18);
		ruedas4[1] = new Rueda(TipoRueda.TODOTERRENO, 18);
		ruedas4[2] = new Rueda(TipoRueda.TODOTERRENO, 18);
		ruedas4[3] = new Rueda(TipoRueda.TODOTERRENO, 18);
		Coche coche4 = new Coche("AUDI", motor4, ruedas4);
		
		// 2. Crear array de coches
		Coche[] coches = {coche1, coche2, coche3, coche4};

		// 3. Mostrar ANTES de ordenar
		System.out.println("=== ANTES DE ORDENAR ===");
		for (Coche c : coches) {
		    System.out.println(c);
		}

		// 4. Ordenar
		Arrays.sort(coches);

		// 5. Mostrar DESPUÉS de ordenar
		System.out.println("\n=== DESPUÉS DE ORDENAR ===");
		for (Coche c : coches) {
		    System.out.println(c);
		}
		
	}
	
	
}