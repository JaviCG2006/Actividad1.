package Actividades1;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Todas las respuestas tienen que ser respondidas con true o false");
		//Preguntar si esta lloviendo
		System.out.println("¿Esta lloviendo?");
		boolean lloviendo = sc.nextBoolean();
		//Preguntar si a terminado su tarea
		System.out.println("¿Has terminado tu tarea?");
		boolean tarea = sc.nextBoolean();
		//Preguntar si va a la biblioteca
		System.out.println("¿Vas a la biblioteca?");
		boolean biblioteca = sc.nextBoolean();
		
		boolean salir = (!lloviendo && tarea) || (biblioteca);
		System.out.println("¿Podra salir?" + salir);
		
	
	}
}
