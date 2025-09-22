package Actividades1;

import java.util.Scanner;

	/*
	 * El tipo short permite almacenar valores comprendidos
	 * entre -32768 y 32767
	 * Escribir un programa que compruebe que el rango
	 * de valores de un tipo se comporta de forma cíclica,
	 * es decir, el valor siguiente al máximo es el valor mínimo.
	 */

public class Actividad5 {
	public static void main(String[] args) {
		
		short numero = 32767;	//definimos el tipo de dato
		System.out.println("El numero antes de incrementar es " + numero);
		numero++;
		//numero += 1
		//numero = 
		System.out.println("El numero es " + numero);
	}
}
