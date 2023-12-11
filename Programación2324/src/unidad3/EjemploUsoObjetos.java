package unidad3;

public class EjemploUsoObjetos {

	public static void main(String[] args) {
		// Para crear un objeto de tipo persona
		// Utilizamos new Persona()

		Persona miguel = new Persona();

		Persona mario = new Persona();
		// Cuando usamos new
		Persona juan = new Persona();
		// Si creamos un objeto de tipo persona utilizando el constructor que recibe los
		// datos, estos se asignan a las variables miembro.
		Persona juanma = new Persona("Juanma", 21, 73, false);

		System.out.println("Datos de juan : " + juan);

		System.out.println("Datos de juanma : " + juanma);

		// Incrementamos la cantidad de personas
		// miguel.numPersonas++;

		System.out.println("Numero de personas : " + Persona.numPersonas);

		// Nos cargamos a juan
		juan.morirse();

		System.out.println("Numero de personas de juan : " + juan.numPersonas);

		// Para acceder a las propiedades del objeto se utiliza el operador "."
		// Solo se pueden hacer a las que ponemos "public"
		mario.setNombre("Jose");
		mario.setEdad(18);
		mario.setPeso(79);
		mario.setVivo(true);

		System.out.println("El nombre de mario es " + mario.getNombre());

		Calculadora oper = new Calculadora();

		System.out.println(oper.suma(3, 5));

		System.out.println(oper.division(25, 5));

		System.out.println(Calculadora.division(25, 5));

		System.out.println(Calculadora.division(25.0f, 0.0f));

		int lista[] = { 3, 4, 2, 7, 56, 1, 23, -4, 34 };

		System.out.println("El mínimo de forma iterativa es : " + Calculadora.min(lista));

		System.out.println("El mínimo de forma recursiva es : " + Calculadora.minR(lista));

		System.out.println("El area de un circulo de 1 metro es " + oper.areaCirculo(5) + "m");

		Vehiculo coche = new Vehiculo();

		coche.acelerar(34);

		System.out.println("Factorial Iterativo : " + Calculadora.factorial(6));

		System.out.println("Factorial Recursivo : " + Calculadora.factorialR(6));

	}

}
