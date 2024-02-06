package examenUnidad3;

public class Monstruo {

	// Constantes de tipo
	public static final int TIPO_TROLL = 0;
	public static final int TIPO_DRAGON = 1;
	public static final int TIPO_KOALA_OSCURO = 2;
	public static final int TIPO_SLIME = 3;
	public static final int TIPO_ORUGAS_CHUPA_TOBILLOS = 4;

	// constantes de debilidad
	public static final int DEBILIDAD_FUEGO = 0;
	public static final int DEBILIDAD_AGUA = 1;
	public static final int DEBILIDAD_COSQUILLAS = 2;
	public static final int DEBILIDAD_GATITOS_EXPLOSIVOS = 3;

	// Variables miembro
	private String nombre;
	private int tipo;
	private int debilidad;
	private int puntosDeVida;
	private int ataque;
	private int nivel;
	private int tamanio;
	public int numMonstruo = 0;

	// Datos aleatorios para cada monstruo
	public Monstruo() {
		super();
		numMonstruo++;
		this.nombre = "Monstruo " + numMonstruo;
		this.tipo = (int) (Math.random() * 5);
		this.debilidad = (int) (Math.random() * 4);
		this.puntosDeVida = (int) (Math.random() * 91) + 10;
		this.ataque = (int) (Math.random() * 100) + 1;
		this.nivel = (int) (Math.random() * 3) + 1;
		// En cm, el máximo es 20m y el mínimo 1m
		this.tamanio = (int) (Math.random() * 1900) + 100;
	}

	public Monstruo(String nombre, int tipo, int debilidad, int puntosDeVida, int ataque, int nivel, int tamanio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.debilidad = debilidad;
		this.puntosDeVida = puntosDeVida;
		this.ataque = ataque;
		this.nivel = nivel;
		this.tamanio = tamanio;
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
	 * @return the debilidad
	 */
	public int getDebilidad() {
		return debilidad;
	}

	/**
	 * @param debilidad the debilidad to set
	 */
	public void setDebilidad(int debilidad) {
		this.debilidad = debilidad;
	}

	/**
	 * @return the puntosDeVida
	 */
	public int getPuntosDeVida() {
		return puntosDeVida;
	}

	/**
	 * @param puntosDeVida the puntosDeVida to set
	 */
	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	/**
	 * @return the ataque
	 */
	public int getAtaque() {
		return ataque;
	}

	/**
	 * @param ataque the ataque to set
	 */
	public void setAtaque(int ataque) {
		this.ataque = ataque;
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

	/**
	 * @return the tamanio
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Monstruo [nombre=" + nombre + ", tipo=" + tipo + ", debilidad=" + debilidad + ", puntosDeVida="
				+ puntosDeVida + ", ataque=" + ataque + ", nivel=" + nivel + ", tamanio=" + tamanio + "]";
	}

}
