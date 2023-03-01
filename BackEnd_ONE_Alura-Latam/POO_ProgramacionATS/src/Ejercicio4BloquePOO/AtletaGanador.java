package Ejercicio4BloquePOO;

public class AtletaGanador {
	
	
	public static int getIndexAtletaGanador(Atleta atletas[]) {
		int index = 0;
		double atletaMasRapido = atletas[0].getTiempoCarrera();
		for (int i = 0; i < atletas.length; i++) {
			if(atletas[i].getTiempoCarrera() < atletaMasRapido) {
				atletaMasRapido = atletas[i].getTiempoCarrera();
				index = i;
			}
		}
		return index;
	}
}
