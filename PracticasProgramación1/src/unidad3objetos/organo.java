package unidad3objetos;

public class organo {
	public static final int SANO = 0;
	public static final int DOLOR = 1;
	public static final int PERJUDICADO = 2;
	public static final int CANCERIGENO = 3;

	public static final int CABEZA = 0;
	public static final int TRONCO_SUPERIOR = 1;
	public static final int TRONCO_INFERIOR = 2;

	public static final int VITAL = 0;
	public static final int BASICA = 1;
	public static final int SECUNDARIA = 2;

	public static final int ONCOLOGICO = 1;
	public static final int ESTADO = 2;
	public static final int RUTINARIO = 3;

	public static final boolean SI = true;
	public static final boolean NO = false;

	private String nombre;
	private String funcion;
	private int estado;
	private double peso;
	private int posicion;
	private int importancia;
	private String imagen;
	public boolean activo;

	/**
	 * Esta función revisa si el organo está en la posicion adecuada y si tiene la
	 * importancia adecuada
	 * 
	 * @return true si todo está bien // false en caso contrario.
	 */
	public boolean revision() {
		boolean todoCorrecto = false;

		switch (nombre) {
		case "cerebro":
			if (this.importancia == VITAL && this.posicion == CABEZA) {
				todoCorrecto = true;
			}
			break;
		case "corazon":
			if (this.importancia == VITAL && this.posicion == TRONCO_SUPERIOR) {
				todoCorrecto = true;
			}
			break;
		case "riñones":
			if (this.importancia == BASICA && this.posicion == TRONCO_INFERIOR) {
				todoCorrecto = true;
			}
			break;
		case "pulmones":
			if (this.importancia == VITAL && this.posicion == TRONCO_SUPERIOR) {
				todoCorrecto = true;
			}
			break;
		case "oido":
			if (this.importancia == SECUNDARIA && this.posicion == CABEZA) {
				todoCorrecto = true;
			}
			break;
		case "estomago":
			if (this.importancia == SECUNDARIA && this.posicion == TRONCO_INFERIOR) {
				todoCorrecto = true;
			}
			break;
		}
		return todoCorrecto;
	}

	public boolean analisis(int tipoAnalisis) {
		boolean analisisSatisfactorio = false;
		switch (tipoAnalisis) {
		case ONCOLOGICO:
			if (this.estado != CANCERIGENO) {
				analisisSatisfactorio = true;
			}
			break;
		case ESTADO:
			if (this.estado != PERJUDICADO) {
				analisisSatisfactorio = true;
			}
			break;
		case RUTINARIO:
			if (this.peso > 200 && this.peso < 1000) {
				analisisSatisfactorio = true;
			}
			break;
		}
		return analisisSatisfactorio;
	}

	@Override
	public String toString() {
		return "organo [nombre=" + nombre + ", funcion=" + funcion + ", estado=" + estado + ", peso=" + peso
				+ ", posicion=" + posicion + ", importancia=" + importancia + ", imagen=" + imagen + ", activo="
				+ activo + "]";
	}

	public organo() {
		super();
		// TODO Auto-generated constructor stub
		int numAleatorio = (int) (Math.random() * 6);
		switch (numAleatorio) {
		case 0:
			this.nombre = "cerebro";
		case 1:
			this.nombre = "corazón";
		case 2:
			this.nombre = "riñones";
		case 3:
			this.nombre = "pulmones";
		case 4:
			this.nombre = "oído";
		case 5:
			this.nombre = "estómago";
		}
		this.posicion = (int) (Math.random() * 3);
		this.estado = (int) (Math.random() * 4);
		this.peso = (double) (Math.random() * 1001) + 200;
		activo = NO;
	}

	public organo(String nombre, String funcion, int estado, double peso, int posicion, int importancia, String imagen,
			boolean activo) {
		super();
		this.nombre = nombre;
		this.funcion = funcion;
		this.estado = estado;
		this.peso = peso;
		this.posicion = posicion;
		this.importancia = importancia;
		this.imagen = imagen;
		this.activo = activo;
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
	 * @return the funcion
	 */
	public String getFuncion() {
		return funcion;
	}

	/**
	 * @param funcion the funcion to set
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the importancia
	 */
	public int getImportancia() {
		return importancia;
	}

	/**
	 * @param importancia the importancia to set
	 */
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
