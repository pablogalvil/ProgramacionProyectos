package unidad3;

public class LigaFutbol {

	public static final int NUM_EQUIPOS = 18;

	private String nombre;
	private String pais;

	private Equipo listaEquipos[];
	private Partido listaPartidos[];

	public LigaFutbol(String nombre, String pais, Equipo[] listaEquipos, Partido[] listaPartidos) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.listaEquipos = listaEquipos;
		this.listaPartidos = listaPartidos;
	}

	// Funcion que muestra la clasificación actual de la liga, podemos meter
	// parametro opcional

	// Funcion que ordena los equipos

	/**
	 * La funcion recibe una lista de equipos y los ordena por puntos
	 * 
	 * @param ListaEquipos Lista de equipos
	 * @return La lista de equipos ordenada
	 */
	public Equipo[] ordenarEquipos(Equipo ListaEquipos[]) {

		// Recorremos
		for (int j = 0; j < listaEquipos.length; j++) {
			for (int i = 0; i < listaEquipos.length; i++) {

				// Si el equipo en la siguiente posicion tiene mas puntos nos cambiamos
				if (listaEquipos[i + 1].getPuntos() > listaEquipos[i].getPuntos()) {
					// Nos cambiamos de posicion, primero salvamos el equipo de la pos i
					Equipo EqTemp = listaEquipos[i];
					// Ponemos la posicion i+1 en i
					listaEquipos[i] = listaEquipos[i + 1];
					// Por ultimo el equipo de pos i guardado en la temporal lo ponemos en i+1
					listaEquipos[i + 1] = EqTemp;
				}
			}
		}

		// Devuelvo la lista de equipos
		return ListaEquipos;
	}

	// Funcion para mostrar partidos de una jornada en particular

	// Funcion partidoFinalizado

	/**
	 * La funcion mostrara por pantalla los equipos ordenados por puntos, mostrara
	 * posiciones equipo, si posiciones es 0 mostrará todos
	 * 
	 * @param posiciones
	 */
	public void mostrarClasificacion(int posiciones) {
		// Si posiciones es 0 lo inicializo al tamaño del array
		if (posiciones == 0)
			posiciones = this.listaEquipos.length;

		// Ordenamos la lista de equipos de la liga
		// Arrays.sort(this.listaEquipos);
		listaEquipos = ordenarEquipos(listaEquipos);

		// Mostramos todos los equipos
		for (int i = 0; i < this.listaEquipos.length; i++) {
			System.out.println(listaEquipos[i].getNombre() + " " + listaEquipos[i].getPuntos());
		}
	}

	/**
	 * La función recorre todos los equipos y dentro de cada equipo todos los
	 * jugadores buscando el jugador con mas goles
	 * 
	 * @return
	 */
	public Jugador pichichi() {
		// Creo el jugador a devolver
		Jugador pichichi = new Jugador();

		// Inicializamos el maximo al menor valor posible
		int numGolMax = Integer.MIN_VALUE;

		// Recorremos los equipos de la liga
		for (int i = 0; i < this.listaEquipos.length; i++) {
			// Para cada equipo recorremos sus jugadores
			Jugador[] listaJug = this.listaEquipos[i].getListaJugadores();
			for (int j = 0; j < listaJug.length; j++) {
				// Si el jugador actual ha marcado más goles que nuestro máximo, es el nuevo
				// pichichi
				if (listaJug[j].getNumGoles() > numGolMax) {
					// Asignamos el jugador al objeto pichichi
					pichichi = listaJug[j];
					// Actualizamos el maximo
					numGolMax = listaJug[j].getNumGoles();
				}
			}
		}

		// Devuelvo el valor máximo
		return pichichi;
	}

	/**
	 * Equipos Descenso (siempre descienden 3 equipos) : devuelve array equipos que
	 * descienden, los que tengan menos de 6 millones, no hayan marcado más de 4
	 * goles o los tres últimos.
	 * 
	 * @return
	 */
	// POR HACER
	public Equipo[] enDescenso() {
		// Definimos el array de equipos que va a descender
		Equipo[] equiposDescenso = new Equipo[3];

		// Variable para ir insertando los equipos que descienden
		int posDes = 0;

		// Recorremos todos los equipos
		for (int i = 0; i < this.listaEquipos.length; i++) {
			this.listaEquipos[i].getPresupuesto();

			// despues en otro bucle metemos los que no han marcado mas de 4 goles

			this.listaEquipos[i].getNumGoles();
		}

		// Devolvemos la lista de equipos que desciende
		return equiposDescenso;
	}

	// Funcion ordenar listaEquipos segun los puntos

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the listaEquipos
	 */
	public Equipo[] getListaEquipos() {
		return listaEquipos;
	}

	/**
	 * @param listaEquipos the listaEquipos to set
	 */
	public void setListaEquipos(Equipo[] listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	/**
	 * @return the listaPartidos
	 */
	public Partido[] getListaPartidos() {
		return listaPartidos;
	}

	/**
	 * @param listaPartidos the listaPartidos to set
	 */
	public void setListaPartidos(Partido[] listaPartidos) {
		this.listaPartidos = listaPartidos;
	}

	public static void main(String[] args) {

	}

}
