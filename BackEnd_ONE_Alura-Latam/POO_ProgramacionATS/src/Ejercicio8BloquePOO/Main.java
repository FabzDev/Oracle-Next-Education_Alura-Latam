package Ejercicio8BloquePOO;

import java.util.Scanner;

public class Main {

	public static int buscarSucursal(Sucursal sucur[], int numSucursal, int contSuc) {
		int indexSuc = 0;
		boolean encontrado = false;

		for (int i = 0; i < contSuc; i++) {
			if (sucur[i].getNumSucursal() == numSucursal) {
				encontrado = true;
				indexSuc = i;
			}
		}

		if (encontrado) {
			return indexSuc;
		} else {
			return -1;
		}
	}

	public static int buscarPaquete(Paquete paq[], int numPaquete, int contPaq) {
		int indexPaq = 0;
		boolean encontrado = false;

		for (int i = 0; i < contPaq; i++) {
			if (paq[i].getNumPaquete() == numPaquete) {
				encontrado = true;
				indexPaq = i;
			}
		}

		if (encontrado) {
			return indexPaq;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		// Otras variables:
		int opcion;

		// Variables sucursal:
		int numSuc;
		String dir, ciu;
		int contSuc = 0;
		int indexSuc;
		Sucursal[] sucursales = new Sucursal[50];

		// variables paquete:
		int numPaq, numCed;
		double peso;
		int prio;
		int contPaq = 0;
		int indexPaq;
		Paquete[] paquetes = new Paquete[300];

		do {
			System.out.println("\n\n\t.:Menu:.");
			System.out.println("1. Crear nueva sucursal");
			System.out.println("2. Enviar paquete");
			System.out.println("3. Consultar sucursal");
			System.out.println("4. Consultar paquete");
			System.out.println("5. Mostrar todas las sucursales");
			System.out.println("6. Mostrar todos los paquetes");
			System.out.println("7. Salir");
			System.out.println("\nDigite la opción deseada");
			opcion = ent.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\n\tIngrese la información de la sucursal");
				System.out.println("Numero de sucursal:");
				numSuc = ent.nextInt();
				System.out.println("Dirección:");
				dir = ent.next();
				System.out.println("Ciudad:");
				ciu = ent.next();

				sucursales[contSuc] = new Sucursal(numSuc, dir, ciu);
				sucursales[contSuc].mostrarDatosSucursal();
				contSuc++;
				break;

			case 2:
				System.out.println("\n\tIngrese la información del paquete");
				System.out.println("Numero de referencia del paquete:");
				numPaq = ent.nextInt();
				System.out.println("Número de cédula del remitente:");
				numCed = ent.nextInt();
				System.out.println("Peso:");
				peso = ent.nextDouble();
				do {
					System.out.println("Prioridad (1: Estandar. 2: Alta, 3: Express): ");
					prio = ent.nextInt();
						
				} while (prio != 1 && prio != 2 && prio != 3);
				paquetes[contPaq] = new Paquete(numPaq, numCed, peso, prio);
				System.out.println(paquetes[contPaq].mostrarDatosPaquete());
				sucursales[contSuc-1].calcularPrecio(paquetes[contPaq]);
				
				contPaq++;
				break;

			case 3:
				System.out.println("\n\tDigite el número de la sucursal:");
				numSuc = ent.nextInt();

				indexSuc = buscarSucursal(sucursales, numSuc, contSuc);

				if (indexSuc == -1) {
					System.out.println("La sucursal ingresada no existe");
				} else {

					System.out.println(sucursales[indexSuc].mostrarDatosSucursal());
					
				}
				break;
				
			case 4:
				System.out.println("\n\tDigite el número de paquete:");
				numPaq = ent.nextInt();

				indexPaq = buscarPaquete(paquetes, numPaq, contPaq);
				
				if (indexPaq == -1) {
					System.out.println("El paquete ingresado no existe");
				} else {
					System.out.println(paquetes[indexPaq].mostrarDatosPaquete());
					
				}
				break;

			}

		} while (opcion != 7);

	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//		System.out.println("\nCuantos paquetes desea consultar?");
//		cantPaq = ent.nextInt();
//		paquetes = new Paquete[cantPaq];
//
//		for (int i = 0; i < cantPaq; i++) {
//			System.out.println("\n\t.Ingrese la informacion del paquete #" + (i + 1));
//			System.out.println("Numero de referencia:");
//			numPaq = ent.nextInt();
//
//			System.out.println("Numero de cedula del remitente:");
//			numCed = ent.nextInt();
//
//			System.out.println("Peso:");
//			peso = ent.nextInt();
//
//			System.out.println("Prioridad:");
//			prio = ent.next();
//
//			paquetes[i] = new Paquete(numPaq, numCed, peso, prio);
//
//		}
//
//		for (int i = 0; i < cantPaq; i++) {
//			System.out.println(paquetes[i].mostrarDatosPaquete());
//			System.out.println(sucursalPrincipal.calcularPrecio(paquetes[i]));
//
//		}
//	}
//}
