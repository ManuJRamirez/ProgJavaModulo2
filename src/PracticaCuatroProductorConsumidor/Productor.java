package PracticaCuatroProductorConsumidor;

/**
 * Clase "Productor" que implementa "Runnable".
 * 
 * Esta clase representa el hilo encargado de producir datos y añadirlos a la
 * cola que comparte con el hilo consumidor.
 */
public class Productor implements Runnable {

	/** Atributo de tipo "Cola" que usaremos para hacer referencia a la cola. */
	private Cola colaCompartida;

	/**
	 * Atributo de tipo "int" que usaremos como dato para introducir en la cola .
	 */
	private int datoQueVamosAIntroducir = 0;

	public int getDatoQueVamosAIntroducir() {
		return datoQueVamosAIntroducir;
	}

	public void setDatoQueVamosAIntroducir(int datoQueVamosAIntroducir) {
		this.datoQueVamosAIntroducir = datoQueVamosAIntroducir;
	}

	/**
	 * Constructor con parámetros de clase.
	 *
	 * @param colaCompartida parámetro que hace referencia a la cola compartida
	 *                       donde se insertarán los datos.
	 */
	public Productor(Cola colaCompartida) {
		this.colaCompartida = colaCompartida;
	}

	/**
	 * Método "run" sobrescrito en el que se define el comportamiento del hilo
	 * Productor.
	 * 
	 * Su funcionamiento es producir datos y añadirlos a la cola. Se le ha puesto un
	 * sleep de 300 ms para que la producción no sea tan rápida. Si el hilo fuera
	 * interrumpido saltaría una excepción de tipo "InterruptedException" y
	 * mostraría mensaje por consola.
	 * 
	 * Haremos uso del método sincronizado "productorIntroduceEnCola" de la clase "Cola" al que se le pasara el "datoQueVamosAIntroducir".
	 */
	@Override
	public void run() {
		try {
			while (true) {
				colaCompartida.productorIntroduceEnCola(datoQueVamosAIntroducir++);
				Thread.sleep(300);

			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(
					"Hilo del productor interrumpido. Finalizando hilo -> " + Thread.currentThread().getName());
		}
	}
}
