package Actividades1;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Escribe una aplicacion que pida el año actual
		 * y el nacimiento del usuario.
		 * Debe calcular su edad, suponiendo que en el año
		 * en curso el usuario ya ha cumplido años.
		 */
		
		System.out.println("Dime el año actual");
		int ano_actual = sc.nextInt();
		System.out.println("Dime tu año de nacimiento");
		int nacimiento = sc.nextInt();
		int anos_usuario = ano_actual - nacimiento;
		
		System.out.println("Tienes: " + anos_usuario);
	
	}
}
