package Ejercicio7BloquePOO;

import java.util.Scanner;

public class Main {
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
			
		};
		
		int opcion;
		
		do {
			System.out.println("\nSeleccione la cuenta que desea utilizar");
			int n = entrada.nextInt()-1;
			
			System.out.println("\nSeleccione el tipo de operacion que desea realizar: ");
			System.out.println("1. Obtener saldo");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Salir");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			
			case 1: System.out.println("El saldo de la cuenta seleccionada es: " + cuentas[n].getSaldo());
			break;
			
			case 2: 
				System.out.println("Ingrese la candidad que desea depositar:");
				double deposito = entrada.nextDouble();
				cuentas[n].ingresarDinero(deposito);
				System.out.println("Deposito exitoso");
			break;
			
			case 3: 
				System.out.println("Ingrese la candidad que desea retirar:");
				double retiro = entrada.nextDouble();
				cuentas[n].retirarDinero(retiro);
				System.out.println("Retiro exitoso");
			break;
			
			}
		} while (opcion !=4);
		
		
		
		
		
		
		
	}
}