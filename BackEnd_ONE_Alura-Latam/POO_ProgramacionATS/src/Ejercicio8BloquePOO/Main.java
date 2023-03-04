package Ejercicio8BloquePOO;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int cantPaquetes;
		
		Scanner ent = new Scanner(System.in);
		
		
		System.out.println("Cuantos paquetes desea ingresar?");
		cantPaquetes = ent.nextInt();
		
		for (int i = 0; i < cantPaquetes; i++) {
		
			
			System.out.println("Cuantos paquetes desea ingresar?");
			cantPaquetes = ent.nextInt();
			
			System.out.println("Cuantos paquetes desea ingresar?");
			cantPaquetes = ent.nextInt();
			
			System.out.println("Cuantos paquetes desea ingresar?");
			cantPaquetes = ent.nextInt();
			
			System.out.println("Cuantos paquetes desea ingresar?");
			cantPaquetes = ent.nextInt();
		}
	}
}
