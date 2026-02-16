package com.acarballeira.boletin2.coche.drivers;

import com.acarballeira.boletin2.coche.Coche;
import com.acarballeira.boletin2.coche.Motor;
import com.acarballeira.boletin2.coche.Rueda;
import com.acarballeira.boletin2.coche.TipoMotor;
import com.acarballeira.boletin2.coche.TipoRueda;

public class DriverCoche1 {

	public static void main(String[] args) {


		// Crear motor
		Motor motor = new Motor(TipoMotor.GASOLINA, 150);

		// Crear 4 ruedas
		Rueda[] ruedas = new Rueda[4];
		ruedas[0] = new Rueda(TipoRueda.VERANO, 18);
		ruedas[1] = new Rueda(TipoRueda.VERANO, 18);
		ruedas[2] = new Rueda(TipoRueda.VERANO, 18);
		ruedas[3] = new Rueda(TipoRueda.VERANO, 18);

		// Crear coche
		Coche coche = new Coche("Toyota", motor, ruedas);

		// Probar
		coche.arrancar();
		coche.conducir();
		coche.detener();

	}

}
