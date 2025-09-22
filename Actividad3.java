package Actividades1;

import java.util.Scanner;

public class Actividad3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame tu edad");
		int edad = sc.nextInt();
		System.out.println("la edad del usuario al año siguiente sera " + (edad + 1));
		
	}

}
