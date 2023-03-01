package Ejercicio5BloquePOO;

import java.util.Scanner;

public class Main {
	
	public static int getIndexAreaMayor(Isosceles isosceles[]) {
		int index = 0;
		double areaMayor = isosceles[0].getArea();
		
		for (int j = 1; j < isosceles.length; j++) {
			if(isosceles[j].getArea() > areaMayor) {
				areaMayor = isosceles[j].getArea();
				index = j;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cantidadTriangulos;
		System.out.println("Bienvenido al sistema de calculo de triangulos Isosceles");
		System.out.println("\nIngrese la cantidad de triangulos que vamos a ingresar:");
		cantidadTriangulos = entrada.nextInt();
		
		Isosceles triangulos[] = new Isosceles[cantidadTriangulos];
		
		double ladoIgual, ladoOpuesto;
		
		
		for (int i = 0; i < cantidadTriangulos; i++) {
		System.out.println("\n\nPor favor ingrese la informacion del triangulo");
		System.out.println("\nValor del lado igual:");
		ladoIgual = entrada.nextDouble();
		
		System.out.println("\nValor del lado opuesto:");
		ladoOpuesto = entrada.nextDouble();
		
		triangulos[i] = new Isosceles(ladoIgual, ladoOpuesto);
		}
		
		int indexArea = getIndexAreaMayor(triangulos);
		System.out.println(triangulos[indexArea].getMayorArea());
		
	
	}	
}
