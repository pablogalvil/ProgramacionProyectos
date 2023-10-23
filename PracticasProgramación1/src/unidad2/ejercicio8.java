package unidad2;

public class ejercicio8 {

	public static void main(String[] args) {
		// Tiradas jugador 1
		int tirada1, tirada2, tirada3 = 0;
		// Tiradas jugador 2
		int tirada4, tirada5, tirada6 = 0;
		int resultado1 = 0, resultado2 = 0;
		int total1 = 0, total2 = 0;

		System.out.println("Bienvenidos, jugadores 1 y 2");
		System.out.println("Sacaremos los resultados del jugador 1");

		// Cogemos las tiradas del jugador 1
		tirada1 = (int) (Math.random() * 6) + 1;
		tirada2 = (int) (Math.random() * 6) + 1;
		tirada3 = (int) (Math.random() * 6) + 1;

		if (tirada1 == tirada2 && tirada1 == tirada3) {
			System.out.println("El jugador 1 tiene un trio");
			// el resultado será 3 para trios, 2 para parejas y 1 para quien no tenga
			// ninguna pareja
			resultado1 = 3;
		} else if (tirada1 == tirada2 || tirada1 == tirada3 || tirada2 == tirada3) {
			System.out.println("El jugador 1 tiene una pareja");
			resultado1 = 2;
		} else {
			resultado1 = 1;
			total1 = tirada1 + tirada2 + tirada3;
			System.out.println("El jugador 1 tiene un total de : " + total1);
		}

		// Cogemos las tiradas del jugador 2
		tirada4 = (int) (Math.random() * 6) + 1;
		tirada5 = (int) (Math.random() * 6) + 1;
		tirada6 = (int) (Math.random() * 6) + 1;

		if (tirada4 == tirada5 && tirada4 == tirada6) {
			System.out.println("El jugador 2 tiene un trio");
			// el resultado será 3 para trios, 2 para parejas y 1 para quien no tenga
			// ninguna pareja
			resultado2 = 3;
		} else if (tirada4 == tirada5 || tirada4 == tirada6 || tirada5 == tirada6) {
			System.out.println("El jugador 2 tiene una pareja");
			resultado2 = 2;
		} else {
			resultado2 = 1;
			total2 = tirada4 + tirada5 + tirada6;
			System.out.println("El jugador 2 tiene un total de : " + total2);
		}

		if (resultado1 == 3 && resultado2 == 3 && tirada1 > tirada4) {
			System.out.println("El jugador 1 es el ganador");
		} else if (resultado1 == 3 && resultado2 == 3 && tirada1 < tirada4) {
			System.out.println("El jugador 2 es el ganador");
		} else if (resultado1 == 3 && resultado2 == 3 && tirada1 == tirada4) {
			System.out.println("Empate");
		} else if (resultado1 == 3 && resultado2 != 3) {
			System.out.println("El jugador 1 es el ganador");
		} else if (resultado2 == 3 && resultado1 != 3) {
			System.out.println("El jugador 2 es el ganador");
		} else if (resultado1 == 2 && resultado2 == 2 && (tirada1<tirada4 || tirada1<tirada5 || tirada2<tirada4 || tirada2<tirada5)) {
			System.out.println("El jugador 2 es el ganador");
		} else if (resultado1 == 2 && resultado2 == 2 && (tirada1>tirada4 || tirada1>tirada5 || tirada2>tirada4 || tirada2>tirada5)) {
			System.out.println("El jugador 1 es el ganador");
		} else if (resultado1 == 2 && resultado2 == 2) {
			System.out.println("Empate");
		} else if (resultado1 == 2 && resultado2 == 1) {
			System.out.println("El jugador 1 es el ganador");
		} else if (resultado2 == 2 && resultado1 == 1) {
			System.out.println("El jugador 2 es el ganador");
		} else if (resultado1 == 1 && resultado2 == 1 && total1>total2) {
			System.out.println("El jugador 1 es el ganador");
		} else if (resultado1 == 1 && resultado2 == 1 && total1<total2) {
			System.out.println("El jugador 2 es el ganador");
		} else if (resultado1 == 1 && resultado2 == 1 && total1==total2) {
			System.out.println("Empate");
		}

	}

}
