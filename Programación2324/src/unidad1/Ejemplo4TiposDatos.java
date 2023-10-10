																				package unidad1;

public class Ejemplo4TiposDatos {
	
	/**
	 * Vamos a leer por tecladoo variables de todos los tipos de datos primitivos de Java y los mostramos por pantalla
	 * @param args
	 */

	public static void main(String[] args) {
		
		//Tipos de datos y sus valores
		byte edadEmpleado = 45;
		short edad = 23;
		int numAlum = 238;
		float notaMedia = 7.34f;
		double pi = 3.14159231231231;
		boolean esMayorEdad = false; //o true
		char letraPuerta ='B'; //Caracteres
		String telefono = "(0034) - 765243344";
		
		
		//color de pelo
		String colorPelo = "Rubio";
		
		//tipo pelo
		String tipoPelo = "Largo Lagarto";
		
		//edad
		short edadP = 20000;
		
		//puntos vida
		int pVida = 200;
		
		//peso
		float pesoo = 85.34f;
		
		//ataque
		int ataque = 23;
		
		//esNoMuerto
		boolean esNoMuerto = true;
		
		//puntos magia
		int pMagia = 0;
		
		//nivel Personaje
		int nivel = 1;
		
		//Subida de nivel
		nivel = nivel+1;
		//Igual a la anterior
		System.out.println(nivel++);
		//Si ponemos el operador ++ antes de la variable, primero se incrementa el valor y luego ejecuta el resto de operadores/instrucciones
		System.out.println(++nivel);
		
		//Incremento de vida por subida de nivel
		pVida = pVida +10;
		//Se puede escribir de las dos formas
		pVida += 10;
		
		
	}

}
