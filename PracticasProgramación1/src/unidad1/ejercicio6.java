package unidad1;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		int base=0;
		int altura=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la base : ");
		base=teclado.nextInt();
		System.out.print("Introduce la altura : ");
		altura=teclado.nextInt();
		int areaTriangulo=(base * altura) / 2;
		System.out.println("El área del triangulo es: " + areaTriangulo);
		
		teclado.close();
	}

}
