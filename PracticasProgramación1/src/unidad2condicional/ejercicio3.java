package unidad2condicional;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		
		//Introducimos los números.
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el primer número : ");
		num1=teclado.nextInt();
		System.out.print("Introduce el segundo número : ");
		num2=teclado.nextInt();
		System.out.print("Introduce el tercer número : ");
		num3=teclado.nextInt();
		System.out.print("Introduce el cuarto número : ");
		num4=teclado.nextInt();
		
		//Condicional para cada caso.
		if (num1>num2 && num1>num3 && num1>num4) {
			System.out.println("El primer número, " + num1 + " es el mayor");
		}else if (num2>num1 && num2>num3 && num2>num4) {
			System.out.println("El segundo número, " + num2 + " es el mayor");
		}else if (num3>num1 && num3>num2 && num3>num4) {
			System.out.println("El tercer número, " + num3 + " es el mayor");
		}else if (num4>num1 && num4>num2 && num4>num3) {
			System.out.println("El cuarto número, " + num4 + " es el mayor");
		}
		
		//Cerramos teclado.
		teclado.close();

	}

}
