package unidad3;

public class EjemploUsoObjetos {

	public static void main(String[] args) {
		// Para crear un objeto de tipo persona
		// Utilizamos new Persona()
		Persona mario = new Persona();

		// Para acceder a las propiedades del objeto se utiliza el operador "."
		// Solo se pueden hacer a las que ponemos "public"
		mario.nombre = "Mario";
		mario.edad = 18;
		mario.peso = 78;
		mario.vivo = true;

		Calculadora oper = new Calculadora();

		System.out.println(oper.suma(3, 5));

		System.out.println(oper.division(25, 5));
		
		System.out.println(Calculadora.division(25, 5));

		System.out.println(Calculadora.division(25.0f, 0.0f));
		
		int lista[]= {3,4,2,7,56,1,23,-4,34};
		
		System.out.println("El mínimo es " + Calculadora.min(lista));
		
		System.out.println("El area de un circulo de 1 metro es " + oper.areaCirculo(5) + "m");

	}

}
