package PracticaCuatroProductorConsumidor;

/**
 * Clase "Consumidor" que implementa "Runnable".
 * 
 * Esta clase representa el hilo encargado de consumir datos y extraerlos de la
 * cola que comparte con el hilo productor.
 */
public class Consumidor implements Runnable {

	/** Atributo de tipo "Cola" que usaremos para hacer referencia a la cola. */
	private Cola colaCompartida;

	/**
	 * Constructor con parámetros de clase.
	 *
	 * @param colaCompartida arámetro que hace referencia a la cola compartida donde
	 *                       se insertarán los datos.
	 */
	public Consumidor(Cola colaCompartida) {
		this.colaCompartida = colaCompartida;
	}

	/**
	 * Método "run" sobrescrito en el que se define el comportamiento del hilo
	 * Consumidor.
	 * 
	 * Su funcionamiento es consumir los datos y extraerlos de la cola. Se le ha
	 * puesto un sleep de 350 ms para dar tiempo a que el hilo Productor pueda
	 * llenar la cola. Si el hilo fuera interrumpido saltaría una excepción de tipo
	 * "InterruptedException" y mostraría mensaje por consola.
	 * 
	 * Haremos uso del método sincronizado "consumirDatos" de la clase "Cola".
	 * 
	 * Si usamos "Thread.sleep(300);" en lugar de "(350)", el productor y el consumidor funcionarían 1:1 y nunca se llenaría la cola.
	 */
	@Override
	public void run() {
		try {
			while (true) {
				colaCompartida.consumirDatos();
//				Thread.sleep(300);
				Thread.sleep(350);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Hilo consumidor interrumpido. Finalizando hilo -> " + Thread.currentThread().getName());
		}

	}

}
