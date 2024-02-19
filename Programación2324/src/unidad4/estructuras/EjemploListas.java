package unidad4.estructuras;

import java.util.ArrayList;
import java.util.List;

import unidad4.model.ClienteDO;

public class EjemploListas {

	public static void main(String[] args) {

		// Definición de array básico de java
		int listaNumeros[] = new int[10];

		// Definición de un arraylist de números
		List<Integer> listNumeros = new ArrayList<Integer>();

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
	}

}
