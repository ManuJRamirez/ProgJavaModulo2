package PracticaCincoBaraja;

/**
 * Enumeración para definir el tipo de palo de las cartas.
 */
public enum Palo {

	/** Espadas. */
	ESPADAS('E'),
	/** Copas. */
	COPAS('C'),
	/** Bastos. */
	BASTOS('B'),
	/** Oros. */
	OROS('O');

	/** Atributo inmutable donde se almacena la abreviatura del palo */
	private final char abreviatura;

	/**
	 * Constructor. Asigna la abreviatura a cada constante del enum.
	 *
	 * @param abreviatura parámetro identificativo de cada palo.
	 */
	private Palo(char abreviatura) {
		this.abreviatura = abreviatura;
	}

	/**
	 * Método que devuelve la abreviatura almacenada.
	 *
	 * @return abreviatura, carácter que representa el palo.
	 */
	public char getAbreviatura() {
		return abreviatura;
	}

}
