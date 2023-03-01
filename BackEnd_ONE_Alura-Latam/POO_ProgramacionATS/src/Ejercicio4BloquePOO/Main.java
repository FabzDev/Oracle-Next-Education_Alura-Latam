package Ejercicio4BloquePOO;

import java.util.Scanner;

import Ejercicio3BloquePOO.Carro;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(".:Bienvenido al sistema de registro de atletas:.");
		System.out.println("\nConfirme la cantidad de atletas a ingresar:");
		int cantidadAtletas = entrada.nextInt();
		Atleta atletas[] = new Atleta[cantidadAtletas];
		
		for (int i = 0; i < cantidadAtletas; i++) {
			
			entrada.nextLine();
			System.out.println("\n\nPor favor confirme la informacion del atleta");
			System.out.println("Ingrese el numero de atleta:");
			int numeroDeAtleta = entrada.nextInt();
			
			System.out.println("\nIngrese el nombre del atleta:");
			String nombreDelAtleta = entrada.next();
			
			System.out.println("\nIngrese el tiempo de carrera:");
			double tiempoDeCarrera = entrada.nextDouble();
			
			atletas[i] = new Atleta(numeroDeAtleta, nombreDelAtleta, tiempoDeCarrera);
			
		}
	
		int indexAtletaGanador = AtletaGanador.getIndexAtletaGanador(atletas);
		System.out.println(atletas[indexAtletaGanador].mostrarAtletaGanador());
	
	
	
	}	
}
