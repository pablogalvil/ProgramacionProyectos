package examenUnidad3;

public class Trampa {

	// Constantes de tipo
	public static final int TIPO_FOSO_DE_PINCHOS = 0;
	public static final int TIPO_DARDOS_VENENOSOS = 1;
	public static final int TIPO_SIERRAS_GIRATORIAS_OCULTAS = 2;
	public static final int TIPO_PEDRON_CONVIERTE_2D = 3;
	public static final int TIPO_SACOS_DE_CHIHUAHUAS_LOCOS = 4;

	// Variables miembro
	private String nombre;
	private int tipo;
	private int danio;
	private int capacidad;
	private boolean recargable;
	public boolean activa;
	private int nivel;
	public int numTrampa = 0;

	// Datos aleatorios para cada trampa
	public Trampa() {
		super();
		numTrampa++;
		this.nombre = "Trampa " + numTrampa;
		this.tipo = (int) (Math.random() * 5);
		this.danio = (int) (Math.random() * 100) + 1;
		this.capacidad = (int) (Math.random() * 10) + 1;
		double aleatorio = Math.random();
		if (aleatorio < 0.5)
			this.recargable = false;
		else
			this.recargable = true;
		double aleatorio2 = Math.random();
		if (aleatorio2 < 0.1)
			this.activa = false;
		else
			this.activa = true;
		this.nivel = (int) (Math.random() * 3) + 1;
	}

	public Trampa(String nombre, int tipo, int danio, int capacidad, boolean recargable, boolean activa, int nivel) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.danio = danio;
		this.capacidad = capacidad;
		this.recargable = recargable;
		this.activa = activa;
		this.nivel = nivel;
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
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the recargable
	 */
	public boolean isRecargable() {
		return recargable;
	}

	/**
	 * @param recargable the recargable to set
	 */
	public void setRecargable(boolean recargable) {
		this.recargable = recargable;
	}

	/**
	 * @return the activa
	 */
	public boolean isActiva() {
		return activa;
	}

	/**
	 * @param activa the activa to set
	 */
	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Trampa [nombre=" + nombre + ", tipo=" + tipo + ", danio=" + danio + ", capacidad=" + capacidad
				+ ", recargable=" + recargable + ", activa=" + activa + ", nivel=" + nivel + "]";
	}

}
