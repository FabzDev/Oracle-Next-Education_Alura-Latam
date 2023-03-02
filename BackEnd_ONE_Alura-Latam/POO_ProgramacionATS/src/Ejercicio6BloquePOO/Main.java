package Ejercicio6BloquePOO;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Complejo complejos[] = new Complejo[2];
			System.out.println("Bienvenido al programa de calculo de numeros complejos");
		
		for (int i = 0; i < complejos.length; i++) {
			System.out.println("\nIngrese los valores del numero complejo");
			System.out.println("Parte real:");
		double real = entrada.nextDouble();
		
			System.out.println("\nParte imaginaria:");
		double img = entrada.nextDouble();		
		
		complejos[i] = new Complejo(real, img);
		
		}
		
		System.out.println(Operaciones.sumaComp(complejos[0], complejos[1]));
		
	}
}
