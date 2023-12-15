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

	// Funcion para mostrar partidos de una jornada en particular

	// Funcion partidoFinalizado

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
