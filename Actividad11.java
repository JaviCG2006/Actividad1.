package Actividades1;

import java.util.Scanner;

public class Actividad11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// semestre 1
		System.out.println("Cuanto se a vendido este semestre de manzanas");
		double manzanas1 = sc.nextInt();
		System.out.println("Cuanto se a vendido este semestre de peras");
		double peras1 = sc.nextInt();
		
		final double semestre_manzanas1 = (manzanas1 * 2.35);
		final double semestre_peras1 = (peras1 * 1.95);
		
		//semestre 2
		System.out.println("Cuanto se a vendido este semestre de manzanas");
		double manzanas2 = sc.nextInt();
		System.out.println("Cuanto se a vendido este semestre de peras");
		double peras2 = sc.nextInt();
		
		final double semestre_manzanas2 = (manzanas2 * 2.35);
		final double semestre_peras2 = (peras2 * 1.95);
		
		
		//Ventas totales
		final double venta_manzana = (semestre_manzanas1 + semestre_manzanas2);
		final double venta_pera = (semestre_peras1 + semestre_peras2);
		final double ventas_anuales = (venta_manzana + venta_pera);
		
		System.out.println("Esto se a obtenido de beneficio este año en total" + ventas_anuales + "€");
		
	}
}
