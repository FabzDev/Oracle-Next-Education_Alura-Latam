package Ejercicio6BloquePOOV2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		NumeroComplejo numero1, numero2, suma, multComplejo, multEntero;
		boolean compComplejo;
		double a, b, c, d;
		int entero, opcion;

		do {
			System.out.println("\n\n\t .:OPERACIONES CON NUMEROS COMPLEJOS:.");
			System.out.println("\nConfirma la operacion que deseas realizar: ");
			System.out.println("1. Sumar numeros complejos");
			System.out.println("2. Multiplicar numeros complejos");
			System.out.println("3. Comparar numeros complejos");
			System.out.println("4. Multiplicar por entero");
			System.out.println("5. Salir");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("\n\nIngresa el primer numero complejo");
				System.out.println("Parte real: ");
				a = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				b = entrada.nextInt();

				System.out.println("\nIngresa el segundo numero complejo");
				System.out.println("Parte real: ");
				c = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				d = entrada.nextInt();

				numero1 = new NumeroComplejo(a, b);
				numero2 = new NumeroComplejo(c, d);

				suma = numero1.sumarComplejo(numero2);
				System.out.println("\nEl resultado es: " + suma.getA() + " + (" + suma.getB() + "i)");
				break;

			case 2:
				System.out.println("\n\nIngresa el primer numero complejo");
				System.out.println("Parte real: ");
				a = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				b = entrada.nextInt();

				System.out.println("\nIngresa el segundo numero complejo");
				System.out.println("Parte real: ");
				c = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				d = entrada.nextInt();

				numero1 = new NumeroComplejo(a, b);
				numero2 = new NumeroComplejo(c, d);

				multComplejo = numero1.multiplicarComplejo(numero2);
				System.out.println("\nEl resultado es: " + multComplejo.getA() + " + (" + multComplejo.getB() + "i)");
				break;

			case 3:

				System.out.println("\n\nIngresa el primer numero complejo");
				System.out.println("Parte real: ");
				a = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				b = entrada.nextInt();

				System.out.println("\nIngresa el segundo numero complejo");
				System.out.println("Parte real: ");
				c = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				d = entrada.nextInt();

				numero1 = new NumeroComplejo(a, b);
				numero2 = new NumeroComplejo(c, d);

				compComplejo = numero1.comprobarIgualdad(numero2);
				if (compComplejo) {
					System.out.println("\nLos numeros complejos son iguales");
				} else {
					System.out.println("\nLos numeros complejos NO son iguales");
				}
				break;

			case 4:
				System.out.println("\n\nIngresa el primer numero complejo");
				System.out.println("Parte real: ");
				a = entrada.nextInt();
				System.out.println("Parte imaginaria: ");
				b = entrada.nextInt();
				numero1 = new NumeroComplejo(a, b);
				
				System.out.println("Ingrese el numero entero");
				entero = entrada.nextInt();
				
				multEntero = numero1.multiplicarEntero(entero);
				System.out.println("\nEl resultado es: " + multEntero.getA() + " + (" + multEntero.getB() + "i)");
				break;
				
			case 5:
				System.out.println("\n\nHasta pronto!");
			}

		} while (opcion != 5);

	}
}