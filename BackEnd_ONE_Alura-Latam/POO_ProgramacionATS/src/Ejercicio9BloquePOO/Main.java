package Ejercicio9BloquePOO;

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
		
		Poligono triangulos[] = new Triangulo[10];
		int contTri = 0;

		// Variables rectangulo:
		Poligono rectangulos[] = new Rectangulo[10];
		int contRec = 0;

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
				
				triangulos[contTri] = new Triangulo(3, lado1, lado2, lado3);
				contTri++;
				break;
			
			case 2:
				System.out.println("\nIngrese el valor del lado #1 (cm): ");
				lado1 = ent.nextDouble();

				System.out.println("\nIngrese el valor del lado #2 (cm): ");
				lado2 = ent.nextDouble();

				rectangulos[contRec] = new Rectangulo(4, lado1, lado2);
				contRec++;
				break;

			case 3:
				for (int i = 0; i < contTri; i++) {

					triangulos[i].toString();
				}
				break;
			
			case 4:
				for (int i = 0; i < contRec; i++) {

					rectangulos[i].toString();
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
