package Actividades1;

import java.util.Scanner;

public class Actividad13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la nota del primer trimestre");
		int trimestre1 = sc.nextInt();
		System.out.println("Dame la nota del segundo trimestre");
		int trimestre2 = sc.nextInt();
		System.out.println("Dame la nota del tercer trimestre");
		int trimestre3 = sc.nextInt();
		
		double nota_media = (double) ((trimestre1 + trimestre2 + trimestre3)/3);
		
		System.out.println("La nota media con decimales es " + nota_media);
		System.out.println("La nota media con decimales es " + (int) nota_media);
		
	}

}
