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

	}

}
