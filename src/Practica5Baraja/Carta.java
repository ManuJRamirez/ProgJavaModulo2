package Practica5Baraja;


/**
 * Clase inmutable Carta.
 * 
 * Representa una carta de la baraja.
 * Cada carta esta compuesta por un número y un palo.
 * 
 */
public class Carta {
	
	/** Atributo inmutable de tipo Palo. */
	private final Palo palo;
	
	/** Atributo inmutable de tipo Numero. */
	private final Numero numero;
	
	/**
	 * Constructor de clase.
	 * 
	 * Instanciamos una carta usando como parámetros un numero de tipo Numero y un palo de tipo Palo.
	 *
	 * @param numero Parámetro que correspende al número de la carta.
	 * @param palo Parámetro que corresponde al palo de la carta.
	 */
	public Carta(Numero numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}

	/**
	 * Método toString con el que podemos representar la carta.
	 *
	 * @return Devolvemos un String que indica el palo y el número de la carta creada, junto a la abreviatura de cada uno.
	 */
	@Override
	public String toString() {
		return "Carta seleccionada es:\n Palo: " + palo + ", numero: " + numero + " => " +numero.getAbreviatura()+palo.getAbreviatura();
	}
	
	

}
