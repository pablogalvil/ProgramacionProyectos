package unidad1;

public class Ejemplo2Suma2Numeros {
	
	/**
	 * Este programa coge dos numeros y los suma
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Definicion de variable
		//numeros enteros para la suma
		int num1,num2;
		int suma;
		
		//Inicializamos la suma a 0
		suma=0;
		
		//Le asignamos valores a los sumandos
		num1=4;
		num2=6;
		
		//sumamos los valores y se los asignamos a suma
		suma=num1+num2;
		
		System.out.print("La suma es: " + suma);
		System.out.print("la suma es: " + (num1+num2));
		

	}

}
