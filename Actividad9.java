package Actividades1;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Cual es el numero");
		double numero = sc.nextInt();
		
		boolean numero_par = numero % 2 == 0;
		
		System.out.println("¿Es par?" + numero_par);

	}
}