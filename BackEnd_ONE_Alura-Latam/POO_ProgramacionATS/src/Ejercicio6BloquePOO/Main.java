//package Ejercicio6BloquePOOV2;
//
//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		
//		NumeroComplejo complejos[] = new NumeroComplejo[2];
//		
//			System.out.println("Bienvenido al programa de calculo de numeros complejos");
//		
//		for (int i = 0; i < 2; i++) {
//			System.out.println("\nIngrese los valores del numero complejo");
//			System.out.println("Parte real:");
//			double real = entrada.nextDouble();
//			
//			System.out.println("\nParte imaginaria:");
//			double img = entrada.nextDouble();		
//		
//			complejos[i] = new NumeroComplejo(real, img);
//		
//		}
//		
//		System.out.println("\nConfirma la operacion que deseas realizar: ");
//		System.out.println("1. Sumar numeros complejos");
//		System.out.println("2. Multiplicar numeros complejos");
//		System.out.println("3. Comparar numeros complejos");
//		System.out.println("4. Multiplicar por entero");
//		int seleccion = entrada.nextInt();
//		
//		switch (seleccion) {
//		
//		case 1:  System.out.println(complejos[0].sumarComplejo(complejos[1]));
//		}
//		
//		
//	}
//}
