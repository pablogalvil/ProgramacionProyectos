package ExamenUnidad4.model;

public class ClubgolfDO {
	public static final int NO_ESCUELA = 0;
	public static final int SI_ESCUELA = 1;

	private int idClubGolf;
	private String nombre;
	private String localidad;
	private int recordGolpes;
	private int escuela;

	public ClubgolfDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClubgolfDO(int idClubGolf, String nombre, String localidad, int recordGolpes, int escuela) {
		super();
		this.idClubGolf = idClubGolf;
		this.nombre = nombre;
		this.localidad = localidad;
		this.recordGolpes = recordGolpes;
		this.escuela = escuela;
	}

	/**
	 * @return the idClubGolf
	 */
	public int getIdClubGolf() {
		return idClubGolf;
	}

	/**
	 * @param idClubGolf the idClubGolf to set
	 */
	public void setIdClubGolf(int idClubGolf) {
		this.idClubGolf = idClubGolf;
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
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the recordGolpes
	 */
	public int getRecordGolpes() {
		return recordGolpes;
	}

	/**
	 * @param recordGolpes the recordGolpes to set
	 */
	public void setRecordGolpes(int recordGolpes) {
		this.recordGolpes = recordGolpes;
	}

	/**
	 * @return the escuela
	 */
	public int getEscuela() {
		return escuela;
	}

	/**
	 * @param escuela the escuela to set
	 */
	public void setEscuela(int escuela) {
		this.escuela = escuela;
	}

	@Override
	public String toString() {
		return "ClubgolfDO [idClubGolf=" + idClubGolf + ", nombre=" + nombre + ", localidad=" + localidad
				+ ", recordGolpes=" + recordGolpes + ", escuela=" + escuela + "]";
	}

}
