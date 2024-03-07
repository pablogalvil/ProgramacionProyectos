package unidad4.model;

public class FrutaDO {
	private int idFruta;
	private String nombre;
	private int danio;
	private int puntosRec;
	private int tipo;

	public FrutaDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FrutaDO(int idFruta, String nombre, int danio, int puntosRec, int tipo) {
		super();
		this.idFruta = idFruta;
		this.nombre = nombre;
		this.danio = danio;
		this.puntosRec = puntosRec;
		this.tipo = tipo;
	}

	/**
	 * @return the idFruta
	 */
	public int getIdFruta() {
		return idFruta;
	}

	/**
	 * @param idFruta the idFruta to set
	 */
	public void setIdFruta(int idFruta) {
		this.idFruta = idFruta;
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
	 * @return the danio
	 */
	public int getDanio() {
		return danio;
	}

	/**
	 * @param danio the danio to set
	 */
	public void setDanio(int danio) {
		this.danio = danio;
	}

	/**
	 * @return the puntosRec
	 */
	public int getPuntosRec() {
		return puntosRec;
	}

	/**
	 * @param puntosRec the puntosRec to set
	 */
	public void setPuntosRec(int puntosRec) {
		this.puntosRec = puntosRec;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "FrutaDO [idFruta=" + idFruta + ", nombre=" + nombre + ", danio=" + danio + ", puntosRec=" + puntosRec
				+ ", tipo=" + tipo + "]";
	}

}
