package PracticaNueveCiudades;

/**
 * The Class Ciudad.
 */
public class Ciudad {
	
	/** Atributo de tipo String en el que almacenamos el nombre de la ciudad. */
	private String nombre;
	
	/** Atributo de tipo String en el que almacenamos la provincia a la que pertenece la ciudad. */
	private String provincia;
	
	/** Atributo de tipo int en el que almacenamos el número de habitantes que tiene la ciudad. */
	private int habitantes;
	
	/**
	 * Constructor de clase con parámetros
	 *
	 * @param nombre Nombre de la ciudad.
	 * @param provincia Provincia a la que pertenece.
	 * @param habitantes Habitantes que tiene.
	 */
	public Ciudad(String nombre, String provincia, int habitantes) {
		this.nombre = nombre;
		this.provincia = provincia;
		this.habitantes = habitantes;
	}

	/**
	 * Método "Get" que devuelve el nombre de la ciudad.
	 *
	 * @return Nombre de la ciudad.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método "Get" que devuelve la provincia a la que pertenece la ciudad.
	 *
	 * @return Provincia a la que pertenece la ciudad
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * Método "Get" que devuelve el número de habitantes que tiene la ciudad.
	 *
	 * @return Habitantes de la ciudad.
	 */
	public int getHabitantes() {
		return habitantes;
	}
	
	/**
	 * Devuelve la representación en texto "String" del objeto "Ciudad".
	 *
	 * @return String del objeto Ciudad con los atributos "nombre", "provincia" y "habitantes".
	 */
	@Override
	public String toString() {
		return "Ciudad -> [Nombre: " + nombre + ", provincia: " + provincia + ", habitantes: " + habitantes + "]";
	}

	


}
