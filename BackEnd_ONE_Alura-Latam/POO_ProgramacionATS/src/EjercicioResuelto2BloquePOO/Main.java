package EjercicioResuelto2BloquePOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tablero pizarra1;
		int seleccion;
		int incremento=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el valor inicial para x:");
		int x = entrada.nextInt();
		
		System.out.println("Ingresa el valor inicial para y:");
		int y = entrada.nextInt();
		
		pizarra1 = new Tablero(x,y);
		
		do {
			System.out.println("\n\t .:MENU:."); 
			System.out.println("1. Mover hacia ARRIBA"); 
			System.out.println("2. Mover hacia ABAJO"); 
			System.out.println("3. Mover hacia DERECHA"); 
			System.out.println("4. Mover hacia IZQUIERDA"); 
			System.out.println("5. Para salir del programa");
			seleccion = entrada.nextInt();
			
			if (seleccion !=5) {
			System.out.println("\nIngrese el incremento");
			incremento = entrada.nextInt();
			}
			
			switch (seleccion) {
			case 1: pizarra1.moverArriba(incremento); pizarra1.getX();break;
			case 2: pizarra1.moverAbajo(incremento);break;
			case 3: pizarra1.moverDerecha(incremento);break;
			case 4: pizarra1.moverIzquierda(incremento);break;
			default: System.out.println("\nOpcion invalida");
				}
			
			System.out.println("\nLa nueva coordenada es: X="+pizarra1.getX()+" Y="+pizarra1.getY());
			
		} while (seleccion != 5);
		
		}
	}


