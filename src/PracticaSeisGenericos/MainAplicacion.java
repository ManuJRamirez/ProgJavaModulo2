package PracticaSeisGenericos;

public class MainAplicacion {

	/**
	 * Clase Main.
	 * 
	 * Comprobamos el funcionamiento de nuestra bolsa.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		BagGenerica<String> bolsa1 = new BagGenerica<>();

		String test = "test";
		String test2 = "test2";
		String test3 = "test3";

		System.out.println("*************************PRUEBAS*************************");
		System.out.println("==========================add============================");

		// Añado 3 elementos y muestro por consola.
		System.out.println(bolsa1.add(test3));
		System.out.println(bolsa1.add(test));
		System.out.println(bolsa1.add(test2));
		System.out.println(bolsa1);


		// Tamaño de la colección.
		System.out.println("=========================size============================");
		System.out.println(bolsa1.size());


		// Compruebo si el elemento está en la lista.
		System.out.println("=======================contains==========================");
		System.out.println("Contiene \"test3\"? -> " + bolsa1.contains("test3"));
		System.out.println("Contiene \"test7\"? -> " + bolsa1.contains("test7"));

		
		// Limpio la colección y compruebo si está vacía
		System.out.println("========================isEmpty==========================");
//		bolsa1.clear();
		System.out.println(bolsa1.isEmpty());


		// Extraigo un elemento aleatorio.
		System.out.println("========================extract==========================");
		System.out.println(bolsa1.extract());
		// Aqui compruebo si ha eliminado el elemento que extraigo.
		System.out.println(bolsa1);

	}

}
