package com.acarballeira.boletin2.drivers;

import com.acarballeira.boletin2.Coche;
import com.acarballeira.boletin2.Motor;
import com.acarballeira.boletin2.Rueda;
import com.acarballeira.boletin2.TipoMotor;
import com.acarballeira.boletin2.TipoRueda;

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
