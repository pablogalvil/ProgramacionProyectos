package unidad1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		//Uso double por si da decimales al ser números grandes
		double sueldoBruto=0;
		double impuestos=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu sueldo bruto : ");
		sueldoBruto=teclado.nextDouble();
		System.out.print("Introduce los impuestos que te cobran : ");
		impuestos=teclado.nextDouble();
		double sueldoNeto=sueldoBruto-impuestos;
		System.out.println("Tu sueldo neto es : " + sueldoNeto);
		
		
		teclado.close();

	}

}
