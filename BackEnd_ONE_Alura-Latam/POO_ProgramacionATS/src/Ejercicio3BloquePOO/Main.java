package Ejercicio3BloquePOO;

import java.util.Scanner;

public class Main {
	
	public static int carroMasBarato(Carro carro[]) {
		int index=0;
		double masBarato = carro[0].precio;
		for (int i = 1; i < carro.length; i++) {
			if(masBarato > carro[i].precio) {
				masBarato = carro[i].precio;
				index = i; 
			}
		}
		return index;
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cantidadCarros;
		System.out.println("Digite la cantidad de carros a ingresar:");
		cantidadCarros = entrada.nextInt();
		String marca;
		String modelo;
		double precio;
		int indexBarato;
		Carro carros[] = new Carro [cantidadCarros];
		
		for (int i = 0; i < carros.length; i++) {
			entrada.nextLine();
			System.out.println("\n\n.:Ingresa las caracteristicas del auto:.");
			System.out.println("Ingresa la marca:");
			marca = entrada.nextLine();
			
			System.out.println("\nIngresa el modelo:");
			modelo = entrada.nextLine();
			
			System.out.println("\nIngresa el precio:");
			precio = entrada.nextDouble();
			
			carros[i] = new Carro(marca, modelo, precio);
		
		}
		
		indexBarato = carroMasBarato(carros);
		carros[indexBarato].mostrarDatos();
		System.out.println(carros[indexBarato].mostrarDatos());
	}
}

