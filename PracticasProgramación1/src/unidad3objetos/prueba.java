package unidad3objetos;

import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
		// Array de organos sanos para probar las funciones
		organo[] orgsSano = new organo[8];
		// *********Nombre, funcion, estado, peso, posicion, importancia, imagen, activo
		orgsSano[0] = new organo("cerebro", "pensar", 0, 600, 0, 0, "cerebro", false);
		orgsSano[1] = new organo("corazon", "pensar", 0, 400, 1, 0, "cerebro", false);
		orgsSano[2] = new organo("riñon izquierdo", "pensar", 0, 800, 2, 1, "cerebro", false);
		orgsSano[3] = new organo("riñon derecho", "pensar", 0, 250, 2, 1, "cerebro", false);
		orgsSano[4] = new organo("pulmon izquierdo", "pensar", 0, 500, 1, 0, "cerebro", false);
		orgsSano[5] = new organo("pulmon derecho", "pensar", 0, 500, 1, 0, "cerebro", false);
		orgsSano[6] = new organo("estomago", "pensar", 0, 500, 2, 2, "cerebro", false);
		orgsSano[7] = new organo("oido", "pensar", 0, 100, 0, 2, "cerebro", false);
		
		//Array de organos con problemas para probar las funciones
		organo[] orgsMalo = new organo[8];
		// *********Nombre, funcion, estado, peso, posicion, importancia, imagen, activo
		orgsMalo[0] = new organo("cerebro", "pensar", 1, 600, 0, 0, "cerebro", false);
		orgsMalo[1] = new organo("corazon", "pensar", 3, 400, 1, 0, "cerebro", false);
		orgsMalo[2] = new organo("riñon izquierdo", "pensar", 3, 800, 2, 1, "cerebro", false);
		orgsMalo[3] = new organo("riñon derecho", "pensar", 2, 250, 2, 1, "cerebro", false);
		orgsMalo[4] = new organo("pulmon izquierdo", "pensar", 1, 500, 1, 0, "cerebro", false);
		orgsMalo[5] = new organo("pulmon derecho", "pensar", 2, 500, 1, 0, "cerebro", false);
		orgsMalo[6] = new organo("estomago", "pensar", 1, 500, 2, 2, "cerebro", false);
		orgsMalo[7] = new organo("oido", "pensar", 2, 100, 0, 2, "cerebro", false);

		// Cuerpos para probar las funciones
		// ***********************organos, nombre, edad, peso, raza, estado
		cuerpo pepe = new cuerpo(orgsSano, "pepe", 30, 70, new raza(), 0);
		cuerpo juan = new cuerpo(orgsMalo, "pepe", 30, 70, new raza(), 0);

		// Pruebas de revision
		System.out.println("PRUEBAS DE REVISION");
		System.out.println(" ");
		System.out.println(orgsSano[0].revision());
		System.out.println(" ");

		// Pruebas de analisis
		System.out.println("PRUEBAS DE ANALISIS");
		System.out.println(" ");
		System.out.println("Oncologico : " + orgsSano[0].analisis(1));
		System.out.println("Perjudicado : " + orgsSano[0].analisis(2));
		System.out.println("Rutinario : " + orgsSano[0].analisis(3));
		System.out.println(" ");

		// Pruebas de transplante
		// Creo organo para transplantar
		organo O = new organo("corazon", "latir", 0, 500, 1, 0, "corazon", true);
		System.out.println("PRUEBAS DE TRANSPLANTE");
		System.out.println(" ");
		System.out.println("Transplante erroneo : " + pepe.transplante(O));
		System.out.println("Transplante correcto : " + juan.transplante(O));
		System.out.println(" ");

		// Pruebas de cura
		System.out.println("PRUEBAS DE CURA");
		System.out.println(" ");
		System.out.println(pepe.cura(orgsSano[3]));
		System.out.println(juan.cura(orgsMalo[3]));
		System.out.println(" ");

		// Pruebas de oncologia
		System.out.println("PRUEBAS DE ONCOLOGIA");
		System.out.println(" ");
		System.out.println(pepe.oncologia());
		System.out.println(" ");

		// Pruebas de revision general
		System.out.println("PRUEBAS DE REVISION GENERAL");
		System.out.println(" ");
		System.out.println("Organos sanos : " + Arrays.toString(pepe.revisionGeneral()));
		System.out.println("Organos con enfermedades : " + Arrays.toString(juan.revisionGeneral()));
		System.out.println(" ");

	}

}
