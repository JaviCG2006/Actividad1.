package Actividades1;

import java.util.Scanner;

public class Actividad7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Dime el radio de la mcircunferencia");
		int radio = sc.nextInt();
		
		double PI = 3.14;
		
		double longuitud = radio * 2 * PI;
		double Area = PI * radio * radio;
		
		System.out.println("La longuitud de la circunferencia es " + longuitud);
		System.out.println("El area del de la circunferencia es " + Area);
		
	}

}
