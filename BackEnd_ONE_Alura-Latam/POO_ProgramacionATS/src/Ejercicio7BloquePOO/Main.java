package Ejercicio7BloquePOO;

import java.util.Scanner;

public class Main {

	public static int buscador(Cuenta[] cuenta, int nc) {
		int index = 0;
		boolean encontrado = false;
		for (int i = 0; i < cuenta.length; i++) {
			if (cuenta[i].getNumeroCuenta() == nc) {
				index = i;
				encontrado = true;
			}
		}
		if (encontrado) {
			return index;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre;
		String apellido;
		double cedula;
		int cantidadCuentas;

		System.out.println("\t.:Bienvenido al sistema bancario:.");
		System.out.println("Ingrese su nombre:");
		nombre = entrada.nextLine();

		System.out.println("Ingrese su apellido:");
		apellido = entrada.nextLine();

		System.out.println("Ingrese su cedula:");
		cedula = entrada.nextDouble();

		System.out.println("Digite la cantidad de cuentas:");
		cantidadCuentas = entrada.nextInt();

		Cuenta[] cuentas = new Cuenta[cantidadCuentas];

		for (int i = 0; i < cantidadCuentas; i++) {
			System.out.println("Por favor ingrese la informacion de la cuenta: ");

			System.out.println("\nNumero de cuenta: ");
			int noCuenta = entrada.nextInt();

			System.out.println("\nSaldo inicial: ");
			double saldo = entrada.nextDouble();

			cuentas[i] = new Cuenta(noCuenta, saldo);

		}
		;

		int opcion;

		do {

			System.out.println("\n\nSeleccione el tipo de operacion que desea realizar: ");
			System.out.println("1. Obtener saldo");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Salir");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("\nIngrese el numero de la cuenta");
				int nC = entrada.nextInt();

				if (buscador(cuentas, nC) == -1) {
					System.out.println("El numero de la cuenta esta errado.");
				} else {
					System.out.println(
							"\nEl saldo de la cuenta seleccionada es: " + cuentas[buscador(cuentas, nC)].getSaldo());
				}

				break;

			case 2:
				System.out.println("\nIngrese el numero de la cuenta");
				nC = entrada.nextInt();

				if (buscador(cuentas, nC) == -1) {
					System.out.println("El numero de la cuenta esta errado.");
				} else {
					System.out.println("\nConfirme la candidad de dinero que desea depositar:");
					double deposito = entrada.nextDouble();

					cuentas[buscador(cuentas, nC)].ingresarDinero(deposito);
					System.out.println("Deposito exitoso");
					System.out.println("\nSu nuevo saldo es: " + cuentas[buscador(cuentas, nC)].getSaldo());
				}

				break;

			case 3:
				System.out.println("\nIngrese el numero de la cuenta");
				nC = entrada.nextInt();

				if (buscador(cuentas, nC) == -1) {
					System.out.println("El numero de la cuenta esta errado.");
				} else {
					System.out.println("\nConfirme la candidad de dinero que desea retirar:");
					double retiro = entrada.nextDouble();
					if (retiro >= cuentas[buscador(cuentas, nC)].getSaldo()) {
						System.out.println("Saldo insuficiente");
					} else {
						cuentas[buscador(cuentas, nC)].retirarDinero(retiro);
						System.out.println("Retiro exitoso");
						System.out.println("\nSu nuevo saldo es: " + cuentas[buscador(cuentas, nC)].getSaldo());
					}
				}
				break;

			}
		} while (opcion != 4);

	}
}