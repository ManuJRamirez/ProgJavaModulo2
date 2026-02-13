package PracticaCuatroProductorConsumidor;

public class MainAplicacion {

	/**
	 * Método principal de la aplicación.
	 * 
	 * Creamos una cola, que pasaremos como parámetro a la hora de crear el "Productor" y el "Consumidor".
	 * 
	 * Posteriormente iniciamos ambos hilos.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		Cola colaCompartida = new Cola(7);

		Thread productor1 = new Thread(new Productor(colaCompartida));
		Thread consumidor1 = new Thread(new Consumidor(colaCompartida));

		productor1.start();
		System.out.println("Productor1 -> " + productor1.getName() + " -> Arrancado");
		consumidor1.start();
		System.out.println("Consumidor1 -> " + consumidor1.getName() + " -> Arrancado");

	}

	
	/*
	 * Prueba interrumpiendo el hilo del productor y volviendo a crear uno nuevo 5
	 * segundos depués.
	 * 
	 */
//	public static void main(String[] args) throws InterruptedException {
//		Cola colaCompartida = new Cola(7);
//
//		Thread productor1 = new Thread(new Productor(colaCompartida));
//		Thread consumidor1 = new Thread(new Consumidor(colaCompartida));
//
//		productor1.start();
//		System.out.println("Productor1 -> " + productor1.getName() + " -> Arrancado");
//		consumidor1.start();
//		System.out.println("Consumidor1 -> " + consumidor1.getName() + " -> Arrancado");
//
//		Thread.sleep(5000);
//		System.out.println("Interrumpiendo productor...");
//		productor1.interrupt();
//		Thread.sleep(5000);
//		Thread productor2 = new Thread(new Productor(colaCompartida));
//		productor2.start();
//		System.out.println("Productor2 -> " + productor1.getName() + " -> Arrancado");
//
//	}

}
