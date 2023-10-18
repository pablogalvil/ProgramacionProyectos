package unidad2;

import java.util.Scanner;

public class Ejemplo7Loteria {

	/**
	 * Realizar un programa que genere aleatoriamente un número de loteria de forma
	 * aleatoria entre 1 y 15.
	 * 
	 * Dos usuarios introduciran sus números de loteria por teclado.
	 * 
	 * El programa debera decir a los usuarios si les ha tocado el número de
	 * loteria.
	 * 
	 * Tambien dirá que usuario ha estado más cerca de acerta o si están igual.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int loteria = 0;
		String nom1 = "";
		String nom2 = "";
		Scanner teclado = new Scanner(System.in);

		System.out.print("Bienvenido usuario 1, por favor introduzca su nombre : ");
		nom1 = teclado.next();
		System.out.print(nom1 + " por favor introduzca su número : ");
		num1 = teclado.nextInt();

		System.out.print("Bienvenido usuario 2, por favor introduzca su nombre : ");
		nom2 = teclado.next();
		System.out.print(nom2 + " por favor introduzca su número : ");
		num2 = teclado.nextInt();

		loteria = (int) (Math.random() * 15) + 1;

		if (loteria != num1 && loteria != num2) {
			System.out.println("Lo sentimos " + nom1 + " y " + nom2 + " ustedes no han ganado el premio");
		}else {
			if (loteria == num1 && loteria != num2) {
				System.out.println("¡Felicidades " + nom1 + " usted ha ganado el premio!");
				System.out.println("Lo sentimos " + nom2 + " usted no ha tenido la misma suerte");
			}else {
				if (loteria != num1 && loteria == num2) {
					System.out.println("¡Felicidades " + nom2 + " usted ha ganado el premio!");
					System.out.println("Lo sentimos " + nom1 + " usted no ha tenido la misma suerte");
				}else {
					if (loteria == num1 && loteria == num2) {
						System.out.println("¡Felicidades " + nom1 + " y " + nom2 + " ustedes han ganado el premio!");
					}
				}
			}
		}

		teclado.close();
	}
}
