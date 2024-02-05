package unidad3;

public class Ordenador {

	public static final int MONTAJE_CORRECTO = 0;
	public static final int MONTAJE_FALLIDO = -1;

	private String caja;
	private float precio;
	private int altura;
	private String SO;
	private float peso;

	public Componente[] listaComponentes;

	public Ordenador() {
		super();
		// TODO Auto-generated constructor stub

		listaComponentes = new Componente[6];
	}

	/**
	 * Comprueba que el ordenador tiene todos los componentes necesarios (cpu,
	 * placa, psu, ram, disco) y que no haya repetidos ni componentes erroneos a
	 * montar, y comprobar que los componentes esten montados en su sitio correcto.
	 * 
	 * @return -1 si no está correcto y 0 si está correcto.
	 */
	public int montaje() {
		/*
		 * 1. comprobar que estan todos, crearia booleanos para cada tipo de componente,
		 * recorreria el array de componentes y cada vez que haya de un tipo, pondría a
		 * true un boolean. Al final comprobaría que todos los booleans son ciertos.
		 * 
		 * 2. En el mismo bucle anterior, al recorrer comprobamos que no haya repetidos.
		 * 
		 * 3. Sabemos si estan en el sitio correcto si en la posición 0 está el tipo 1,
		 * en la 1 el tipo 2, etc.
		 */
		return 0;
	}

	/**
	 * Comprueba que el presupuesto es el suficiente para el montaje
	 * 
	 * @param presupuesto para montar el ordenador
	 * @return -1 si no está correcto y 0 si está correcto.
	 */
	public int cumplePresupuesto(int presupuesto) {

		// Recorremos todos los componentes para sumar sus precios
		for (Componente comp : listaComponentes) {
			this.precio += comp.getPrecio();
		}

		if (presupuesto < this.precio)
			return -1;

		return 0;
	}
}
