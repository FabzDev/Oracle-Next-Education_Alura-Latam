package Ejercicio9BloquePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		// Variables:
		int opcion;
		double lado1;
		double lado2;
		double lado3;

		// Variables triangulo:	
		
		ArrayList<Poligono> triangulos = new ArrayList<Poligono>();
		

		// Variables rectangulo:
		ArrayList<Poligono> rectangulos = new ArrayList<Poligono>();
		

		do {
			System.out.println("\n\nMenu");
			System.out.println("1. Ingresar triangulo");
			System.out.println("2. Ingresar rectangulo");
			System.out.println("3. Mostrar triangulos");
			System.out.println("4. Mostrar rectangulos");
			System.out.println("5. Salir");
			System.out.println("\nIngrese la opcion deseada: ");
			opcion = ent.nextInt();

			switch (opcion) {
			
			case 1:
				System.out.println("\nIngrese el valor del lado #1 (cm): ");
				lado1 = ent.nextDouble();

				System.out.println("\nIngrese el valor del lado #2 (cm): ");
				lado2 = ent.nextDouble();
				
				System.out.println("\nIngrese el valor del lado #3 (cm): ");
				lado3 = ent.nextDouble();
				
				Triangulo triangulo= new Triangulo(lado1, lado2, lado3);
				triangulos.add(triangulo);
//				contTri++;
				break;
			
			case 2:
				System.out.println("\nIngrese el valor del lado #1 (cm): ");
				lado1 = ent.nextDouble();

				System.out.println("\nIngrese el valor del lado #2 (cm): ");
				lado2 = ent.nextDouble();

				Rectangulo rectangulo = new Rectangulo(lado1, lado2);
				rectangulos.add(rectangulo); 
				break;

			case 3:
				for(Poligono poli: triangulos) {
					System.out.println(poli.toString());
				}
				break;
			
			case 4:
				for (Poligono poli: rectangulos) {
					System.out.println(poli.toString());
					
				}
				break;
				
			case 5:
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("Opcion invalida, por favor intentelo nuevamente");
				break;
			}

		} while (opcion != 5);

	}

}
