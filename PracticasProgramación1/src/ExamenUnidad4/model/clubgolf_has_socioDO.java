package ExamenUnidad4.model;

public class clubgolf_has_socioDO {

	private int idClubGolf;
	private int idSocio;
	private int recordGolpes;

	public clubgolf_has_socioDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public clubgolf_has_socioDO(int idClubGolf, int idSocio, int recordGolpes) {
		super();
		this.idClubGolf = idClubGolf;
		this.idSocio = idSocio;
		this.recordGolpes = recordGolpes;
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
	 * @return the idSocio
	 */
	public int getIdSocio() {
		return idSocio;
	}

	/**
	 * @param idSocio the idSocio to set
	 */
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
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

	@Override
	public String toString() {
		return "clubgolf_has_socio [idClubGolf=" + idClubGolf + ", idSocio=" + idSocio + ", recordGolpes="
				+ recordGolpes + "]";
	}

}
