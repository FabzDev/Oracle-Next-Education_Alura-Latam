package Ejercicio8BloquePOO;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int cantPaq;
		int numPaq;
		int numCed;
		double peso;
		String prio;
		Paquete[] paquetes;

		Sucursal sucursalPrincipal = new Sucursal(1221, "Cra8H#128-126", "Barranquilla");
		System.out.println("\n\t.:Bienvenido a la sucursal Ciudad Caribe:.");
		System.out.println("\nCuantos paquetes desea consultar?");
		cantPaq = ent.nextInt();
		paquetes = new Paquete[cantPaq];

		for (int i = 0; i < cantPaq; i++) {
			System.out.println("\n\t.Ingrese la informacion del paquete #" + (i + 1));
			System.out.println("Numero de referencia:");
			numPaq = ent.nextInt();

			System.out.println("Numero de cedula del remitente:");
			numCed = ent.nextInt();

			System.out.println("Peso:");
			peso = ent.nextInt();

			System.out.println("Prioridad:");
			prio = ent.next();

			paquetes[i] = new Paquete(numPaq, numCed, peso, prio);

		}

		for (int i = 0; i < cantPaq; i++) {
			System.out.println(paquetes[i].mostrarDatosPaquete());
			System.out.println(sucursalPrincipal.calcularPrecio(paquetes[i]));

		}
	}
}
