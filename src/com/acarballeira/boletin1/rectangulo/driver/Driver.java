package com.acarballeira.boletin1.rectangulo.driver;

import com.acarballeira.boletin1.rectangulo.Rectangulo;



public class Driver {

	public static void main(String[] args) {
		
		Rectangulo rect1 = new Rectangulo(10, 5);
		
		
		System.out.println("Área: " + rect1.calculaArea());  
 
		System.out.println("Perímetro: " + rect1.calculaPerimetro());  
;
System.out.println("Dibujo : \n" + rect1.toString());  

	}

}
