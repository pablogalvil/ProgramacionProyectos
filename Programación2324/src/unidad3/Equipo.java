package unidad3;

public class Equipo {

	private String id;
	private String nombre;
	private int puntos;
	private int numGoles;
	private int numGolesRec;
	private int presupuesto;
	private String estadio;
	private Jugador listaJugadores[];

	/**
	 * Funcion que recibe un jugador y lo añade a nuestra lista de jugadores.
	 * Buscara el primer espacio vacio de nuestro array para insertarlo.
	 * 
	 * @param nuevoJugador
	 * @return
	 */
	public int addJugador(Jugador nuevoJugador) {
		for (int i = 0; i < this.listaJugadores.length; i++) {
			if (this.listaJugadores[i] == null) {
				this.listaJugadores[i] = nuevoJugador;
				return 0;
			}
		}
		// Si no hay huecos devolvemos fallo
		return -1;
	}

	public int buscarJugador(String idJugador, Equipo equipo) {
		// Ver si el jugador está el equipo, si no está devuelvo -1
		// Recorremos la lista de jugadores del equipo
		Jugador listaJugEquipo[] = equipo.getListaJugadores();
		int posJug = -1;
		boolean jugEncontrado = false;

		for (int i = 0; i < listaJugEquipo.length && !jugEncontrado; i++) {
			// Si el id buscado está en el jugador de la posicion i
			if (listaJugEquipo[i].getId() == idJugador) {
				posJug = i;
				jugEncontrado = true;
			}
		}

		return posJug;
	}

	// Fichaje a un jugador de otro equipo
	/**
	 * La funcion ficha a un jugador del equipo que recibe como parametro
	 * 
	 * @param idJugador identificador del jugador a buscar
	 * @param equipo    Equipo del cual fichamos
	 * @return 0 si ha podido ficharlo y -1 si no
	 */
	public int ficharJugador(String idJugador, Equipo equipo) {
		// Primer paso ver si el equipo existe, si no existe devuelvo -1
		if (equipo == null)
			return -1;

		// Segundo paso es buscar al jugador
		int posJug = buscarJugador(idJugador, equipo);

		// Eliminamos al jugador de su lista de jugadores
		// Cargamos la lista de jugadores del equipo contrario
		Jugador listaEquipoF[] = equipo.getListaJugadores();
		// Añadimos al jugador a nuestra lista
		addJugador(listaEquipoF[posJug]);
		// Eliminamos poniendo a null el jugador

		return 0;
	}

	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipo(String id, String nombre, int puntos, int numGoles, int numGolesRec, int presupuesto,
			String estadio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntos = puntos;
		this.numGoles = numGoles;
		this.numGolesRec = numGolesRec;
		this.presupuesto = presupuesto;
		this.estadio = estadio;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", puntos=" + puntos + ", numGoles=" + numGoles
				+ ", numGolesRec=" + numGolesRec + ", presupuesto=" + presupuesto + ", estadio=" + estadio + "]";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the numGoles
	 */
	public int getNumGoles() {
		return numGoles;
	}

	/**
	 * @param numGoles the numGoles to set
	 */
	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	/**
	 * @return the numGolesRec
	 */
	public int getNumGolesRec() {
		return numGolesRec;
	}

	/**
	 * @param numGolesRec the numGolesRec to set
	 */
	public void setNumGolesRec(int numGolesRec) {
		this.numGolesRec = numGolesRec;
	}

	/**
	 * @return the presupuesto
	 */
	public int getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @return the estadio
	 */
	public String getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	/**
	 * @return the listaJugadores
	 */
	public Jugador[] getListaJugadores() {
		return listaJugadores;
	}

	/**
	 * @param listaJugadores the listaJugadores to set
	 */
	public void setListaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	// Para poder ordenar y comparar elementos de una clase necesitamos crear el
	// método compareTo
	public int compareTo(Equipo otro) {
		// Si mi equipo tiene mas puntos va delante
		if (this.puntos > otro.getPuntos())
			return -1;

		// Si el otro equipo tiene mas puntos va delante
		if (this.puntos < otro.getPuntos())
			return 1;

		// Si los dos equipos tienen los mismos puntos, van en la misma posicion
		return 0;
	}

}
