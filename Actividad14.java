package Actividades1;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dame un numero decimal");
	double numero = sc.nextInt();

	double numeroRe = Math.round(numero);
	double numeroRe2 = (int)( numeroRe + 0.5);
	
	//Mostramos
	System.out.println("El numero mas proximo es " + numeroRe);
	System.out.println("El numero mas proximo es " + numeroRe2);
	
	}
}