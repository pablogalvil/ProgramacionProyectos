package unidad2bucles;

public class ejercicio9 {

	public static final int SIZE = 8;
	public static final char TOWN = 'T';
	public static final char ROAD = 'R';
	public static final char CURSED = 'D';
	public static final char MONSTER = 'M';

	public static void main(String[] args) {
		// Variables
		// Verifica si las ciudades están conectadas
		boolean isConnected = false;
		// Total de monstruos y ciudades
		int numMonster = 0;
		int numTown = 0;
		// Array del mapa
		char[][] mapaReino = { { CURSED, TOWN, ROAD, ROAD, TOWN, MONSTER, MONSTER, MONSTER },
				{ CURSED, MONSTER, CURSED, CURSED, CURSED, CURSED, TOWN, ROAD },
				{ CURSED, TOWN, MONSTER, MONSTER, TOWN, ROAD, ROAD, MONSTER },
				{ CURSED, ROAD, CURSED, CURSED, ROAD, CURSED, MONSTER, CURSED },
				{ CURSED, ROAD, CURSED, CURSED, ROAD, CURSED, MONSTER, CURSED },
				{ CURSED, TOWN, CURSED, CURSED, ROAD, CURSED, MONSTER, TOWN },
				{ CURSED, CURSED, CURSED, CURSED, ROAD, MONSTER, CURSED, CURSED },
				{ CURSED, CURSED, CURSED, CURSED, TOWN, CURSED, CURSED, CURSED } };

		// Bucle principal
		for (int i = 0; i < SIZE; i++) {
			// Bucle para encontrar una ciudad o monstruo
			for (int j = 0; j < SIZE; j++) {
				// Condicional para saber si hay una ciudad
				if (mapaReino[i][j] == TOWN) {
					// Sumo uno al total de ciudades
					numTown++;
					// Bucle para saber si está conectada a la derecha
					for (int x = 1; x + j < SIZE; x++) {
						if (mapaReino[i][j + x] == ROAD && j + x != 7) {
							isConnected = true;
						} else if (mapaReino[i][j + x] == TOWN) {
							isConnected = true;
							break;
						} else {
							isConnected = false;
							break;
						}
					} // Bucle para saber si está conectada a la izquierda
					if (!isConnected) {
						for (int x = 1; x + j < SIZE; x++) {
							if (mapaReino[i][j - x] == ROAD && j + x != 7) {
								isConnected = true;
							} else if (mapaReino[i][j - x] == TOWN) {
								isConnected = true;
								break;
							} else {
								isConnected = false;
								break;
							}
						}
					} // Bucle para saber si está conectada hacia abajo
					if (!isConnected) {
						for (int y = 1; y + i < SIZE; y++) {
							if (mapaReino[i + y][j] == ROAD && j + y != 7) {
								isConnected = true;
							} else if (mapaReino[i + y][j] == TOWN) {
								isConnected = true;
								break;
							} else {
								isConnected = false;
								break;
							}
						}
					} // Bucle para saber si está conectada hacia arriba
					if (!isConnected) {
						for (int y = 1; y + i < SIZE; y++) {
							if (mapaReino[i - y][j] == ROAD && j + y != 7) {
								isConnected = true;
							} else if (mapaReino[i - y][j] == TOWN) {
								isConnected = true;
								break;
							} else {
								isConnected = false;
								break;
							}
						}
					}
					if (isConnected)
						System.out.println("La ciudad en las coordenadas Y:" + i + " y X:" + j + " está conectada.");
					else
						System.out.println("La ciudad en las coordenadas Y:" + i + " y X:" + j + " no está conectada.");
				} // Termina el condicional principal
				if (mapaReino[i][j] == MONSTER) {
					numMonster++;
				}
			} // Termina el segundo bucle
		} // Termina el primer bucle
			// Condicional para saber si sigue habiendo esperanza
		if (numMonster > numTown)
			System.out.println("Ya no queda esperanza!!\nSalvese quien pueda!!");
	}

}
