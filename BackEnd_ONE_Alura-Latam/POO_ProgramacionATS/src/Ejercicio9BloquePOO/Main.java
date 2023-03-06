package Ejercicio9BloquePOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		// Variables:
		int opcion;
		double base;
		double altura;

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
				System.out.println("\nIngrese el valor de la base (cm): ");
				base = ent.nextDouble();

				System.out.println("\nIngrese el valor de la altura (cm):");
				altura = ent.nextDouble();

				triangulos[contTri] = new Triangulo(base, altura);
				contTri++;
				break;
			
			case 2:
				System.out.println("\nIngrese el valor de la base (cm): ");
				base = ent.nextDouble();

				System.out.println("\nIngrese el valor de la altura (cm):");
				altura = ent.nextDouble();

				rectangulos[contRec] = new Rectangulo(base, altura);
				contRec++;
				break;

			case 3:
				for (int i = 0; i < contTri; i++) {

					triangulos[i].mostrarDatos(i, "triangulo");
				}
				break;
			
			case 4:
				for (int i = 0; i < contRec; i++) {

					rectangulos[i].mostrarDatos(i, "rectangulo");
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
