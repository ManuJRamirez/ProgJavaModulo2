package PracticaCincoBaraja;

public class MainAplicacion {

	/**
	 * Metodo Main.
	 * 
	 * Creamos varias cartas de tipo Carta y las mostramos por consola.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Carta carta1 = new Carta(Numero.REY, Palo.COPAS);
		System.out.println(carta1);
		Carta carta2 = new Carta(Numero.SIETE, Palo.OROS);
		System.out.println(carta2);
		Carta carta3 = new Carta(Numero.CINCO, Palo.ESPADAS);
		System.out.println(carta3);
		Carta carta4 = new Carta(Numero.AS, Palo.BASTOS);
		System.out.println(carta4);

	}

}
