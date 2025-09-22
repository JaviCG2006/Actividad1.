package Actividades1;

import java.util.Scanner;

public class Actividad8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Cual es tu edad");
		int edad = sc.nextInt();
		
		boolean edad_mayor = edad>=18;
		
		System.out.println("¿Es mayor?" + edad_mayor);

	}
}
