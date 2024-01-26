package unidad3objetos;

import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
		// Array de organos para probar las funciones
		organo[] orgs = new organo[8];
		// *********Nombre, funcion, estado, peso, posicion, importancia, imagen, activo
		orgs[0] = new organo("cerebro", "pensar", 0, 600, 0, 0, "cerebro", false);
		orgs[1] = new organo("corazon", "pensar", 0, 400, 1, 0, "cerebro", false);
		orgs[2] = new organo("riñon izquierdo", "pensar", 0, 800, 2, 1, "cerebro", false);
		orgs[3] = new organo("riñon derecho", "pensar", 0, 250, 2, 1, "cerebro", false);
		orgs[4] = new organo("pulmon izquierdo", "pensar", 0, 500, 1, 0, "cerebro", false);
		orgs[5] = new organo("pulmon derecho", "pensar", 0, 500, 1, 0, "cerebro", false);
		orgs[6] = new organo("estomago", "pensar", 0, 500, 2, 2, "cerebro", false);
		orgs[7] = new organo("oido", "pensar", 0, 100, 0, 2, "cerebro", false);

		// Cuerpo para probar las funciones
		// ***********************organos, nombre, edad, peso, raza, estado
		cuerpo pepe = new cuerpo(orgs, "pepe", 30, 70, new raza(), 0);

		// Pruebas de revision
		System.out.println("PRUEBAS DE REVISION");
		System.out.println(" ");
		System.out.println(orgs[0].revision());
		System.out.println(" ");

		// Pruebas de analisis
		System.out.println("PRUEBAS DE ANALISIS");
		System.out.println(" ");
		System.out.println("Oncologico : " + orgs[0].analisis(1));
		System.out.println("Perjudicado : " + orgs[0].analisis(2));
		System.out.println("Rutinario : " + orgs[0].analisis(3));
		System.out.println(" ");

		// Pruebas de transplante
		// Creo organo para transplantar
		organo O = new organo("corazon", "latir", 0, 500, 1, 0, "corazon", true);
		System.out.println("PRUEBAS DE TRANSPLANTE");
		System.out.println(" ");
		System.out.println(pepe.transplante(O));
		System.out.println(" ");

		// Pruebas de cura
		System.out.println("PRUEBAS DE CURA");
		System.out.println(" ");
		System.out.println(pepe.cura(orgs[0]));
		System.out.println(" ");

		// Pruebas de oncologia
		System.out.println("PRUEBAS DE ONCOLOGIA");
		System.out.println(" ");
		System.out.println(pepe.oncologia());
		System.out.println(" ");

		// Pruebas de revision general
		System.out.println("PRUEBAS DE REVISION GENERAL");
		System.out.println(" ");
		System.out.println(Arrays.toString(pepe.revisionGeneral()));
		System.out.println(" ");

	}

}
