package unidad4.estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unidad4.model.ClienteDO;

public class EjemploListas {

	public static void main(String[] args) {

		// Definición de array básico de java
		int listaNumeros[] = new int[10];

		// Definimos un array estandar
		String listaNombres3[] = { "Pablo", "Sergio", "Alex" };

		// Definición de un arraylist de números
		List<Integer> listNumeros = new ArrayList<Integer>();

		List<String> listaNombres = new ArrayList<String>();
		List<String> listaNombres2 = new ArrayList<String>();

		List<Character> listaCaracteres;

		// Creamos una lista de clientes
		List<ClienteDO> listaClientes = new ArrayList<ClienteDO>();
		List<ClienteDO> listaClientes2 = new ArrayList<ClienteDO>();

		ClienteDO cliente1 = new ClienteDO(1, null, "Perlita", 19, ' ', null, "toitoto");
		ClienteDO cliente2 = new ClienteDO(2, "LuisMi", "Toscano", 19, 'M', "emailluis@gmail.com", "toitoto");
		ClienteDO cliente3 = new ClienteDO(3, null, "Perlita23", 19, ' ', null, "toitooooto");
		ClienteDO cliente4 = new ClienteDO(4, null, "PerlitaTotal", 19, ' ', null, "toitoooooooto");
		ClienteDO cliente5 = new ClienteDO(5, null, "PerlitaSuprema", 19, ' ', null, "toitoooooooooto");

		// Añadimos elementos utilizando add
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		// Podemos usar un índice para indicar la posición donde insertarlo
		listaClientes.add(1, cliente3);

		listaClientes2.add(cliente4);
		listaClientes2.add(cliente5);

		// Podemos añadir multiples elementos de otra lista de tipo compatible con
		// addAll
		listaClientes2.addAll(0, listaClientes);

		// Para sacar un elemento de la lista utilizamos get
		System.out.println("El cliente en la posición 2 es " + listaClientes.get(1));

		System.out.println(listaClientes2);

		String nombre = "Juanjo4";

		listaNombres.add("Juanjo");
		listaNombres.add("Juanjo2");
		listaNombres.add("Juanjo3");
		listaNombres.add("Pepe");
		listaNombres.add(nombre);
		listaNombres.add("Juanjo5");
		listaNombres.add("Juanjo6");
		listaNombres.add("Juanjo7");
		listaNombres.add("Pepe2");
		listaNombres.add("Pepe3");

		listaNombres2.add(nombre);
		listaNombres2.add("Juanjo3");
		listaNombres2.add("Pepe");

		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");

		listaNombres2 = listaNombres.subList(0, 2);

		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");

		// Para buscar hay dos funciones principalmente, indexOf y contains
		System.out.println("¿Está Juanjo2 en la lista? " + listaNombres.contains("Juanjo2"));

		// IndexOf busca entre los elementos y nos devuelve la posicion donde se
		// encuentra
		int posicionJuanjo2 = listaNombres.indexOf("Juanjo2");

		System.out.println("En la posicion " + posicionJuanjo2 + " esta " + listaNombres.get(posicionJuanjo2));

		// Para borrar un elemento utilizamos la funcion remove
		listaNombres.remove(posicionJuanjo2);

		System.out.println("¿Está Juanjo2 en la lista? " + listaNombres.contains("Juanjo2"));

		// Clear borra todos los elementos de la lista
		// listaNombres.clear();

		// Borra todos los elementos de la lista excepto los de la lista metida como
		// parametro
		listaNombres.retainAll(listaNombres2);

		System.out.println("Lista de nombres después de retainAll " + listaNombres);

		// Cantidad de elementos en una lista se saca con size
		System.out.println("La lista 1 tiene " + listaNombres.size());

		// CONVERSIONES

		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");

		// De array a lista
		List<String> listaNombres4 = Arrays.asList(listaNombres3);

		System.out.println(listaNombres4);

		// Conversion de lista o collection a array simple
		String listaNombres5[] = (String[]) listaNombres4.toArray();
	}

}
