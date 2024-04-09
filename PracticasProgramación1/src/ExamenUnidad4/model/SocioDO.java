package ExamenUnidad4.model;

public class SocioDO {

	private int idSocio;
	private String nombre;
	private int edad;
	private int sexo;
	private int cuota;

	public SocioDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocioDO(int idSocio, String nombre, int edad, int sexo, int cuota) {
		super();
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.cuota = cuota;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the sexo
	 */
	public int getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the cuota
	 */
	public int getCuota() {
		return cuota;
	}

	/**
	 * @param cuota the cuota to set
	 */
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "SocioDO [idSocio=" + idSocio + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", cuota="
				+ cuota + "]";
	}

}
