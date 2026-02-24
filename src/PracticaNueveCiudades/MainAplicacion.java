package PracticaNueveCiudades;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Clase Main.
 * 
 * Usaremos esta clase para responder a las preguntas que se nos plantean en el ejercicio.
 * 
 * Primero creamos una lista de "Ciudad" y añadiremos varias ciudades.
 * Luego usaremos streams para recorrer la lista y "syso" para responder a las preguntas.
 * En la pregunta 3, usaremos un "Set" para almacenar las provincias sin duplicarlas.
 * 
 * 
 */
public class MainAplicacion {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// Crea la lista de ciudades
		ArrayList<Ciudad> listadoCiudades = new ArrayList<Ciudad>();

		listadoCiudades.add(new Ciudad("Sevilla", "Sevilla", 684000));
		listadoCiudades.add(new Ciudad("Dos Hermanas", "Sevilla", 302000));
		listadoCiudades.add(new Ciudad("Málaga", "Málaga", 579000));
		listadoCiudades.add(new Ciudad("Granada", "Granada", 232000));
		listadoCiudades.add(new Ciudad("Córdoba", "Córdoba", 325000));
		listadoCiudades.add(new Ciudad("Cádiz", "Cádiz", 116000));
		listadoCiudades.add(new Ciudad("Barcelona", "Barcelona", 1620000));
		listadoCiudades.add(new Ciudad("Bilbao", "Vizcaya", 345000));
		listadoCiudades.add(new Ciudad("Zaragoza", "Zaragoza", 675000));
		listadoCiudades.add(new Ciudad("Valladolid", "Valladolid", 295000));
		listadoCiudades.add(new Ciudad("Murcia", "Murcia", 460000));
		listadoCiudades.add(new Ciudad("Madrid", "Madrid", 3200000));
		listadoCiudades.add(new Ciudad("Alcalá de Henares", "Madrid", 195000));
		listadoCiudades.add(new Ciudad("Aranjuez", "Madrid", 6000));
		listadoCiudades.add(new Ciudad("Chinchón", "Madrid", 500));

		// Realiza las operaciones con Streams que permitan contestar a las preguntas

		System.out.println("1.-¿Cuántas ciudades hay en total?");
		System.out.println("Tenemos un total de " + listadoCiudades.size() + " ciudades en el listado.");
		System.out.println();

//=====================================================================================================================================

		System.out.println("2.-¿Cuántas ciudades de \"Madrid\" tienen mas de 1.000 habitantes?");
		long madridMasDeMil = listadoCiudades.stream()
				.filter(ciudad -> ciudad.getProvincia().equalsIgnoreCase("Madrid") && ciudad.getHabitantes() > 1000)
				.count();
		System.out.println("Hay un total de " + madridMasDeMil
				+ " ciudades con más de 1.000 habitantes en la provincia de Madrid.");
		System.out.println();

//=====================================================================================================================================

		System.out.println("3.-¿De qué pronvincias son las ciudades?");
		Set<String> provincias = listadoCiudades.stream().map(Ciudad::getProvincia).collect(Collectors.toSet());
		System.out.println("Las provincias son: " + provincias);
		System.out.println();

//=====================================================================================================================================

		System.out.println("4.-¿De cuántas provincias diferentes son las ciudades?");
		System.out.println("Hay un total de " + provincias.size() + " provincias diferentes en nuestro listado.");
		System.out.println();

//=====================================================================================================================================	

		System.out.println("5.-¿Alguna ciudad de Madrid tiene más de 50.000 habitantes?");
		String hayMadridMasDeCincuentaMil = (listadoCiudades.stream().anyMatch(
				ciudad -> ciudad.getProvincia().equalsIgnoreCase("Madrid") && ciudad.getHabitantes() > 50000) ? "Sí"
						: "No");
		long madridMasCincuentaMil = listadoCiudades.stream()
				.filter(ciudad -> ciudad.getProvincia().equalsIgnoreCase("Madrid") && ciudad.getHabitantes() > 50000)
				.count();
		System.out.println(hayMadridMasDeCincuentaMil + ". Hay un total de " + madridMasCincuentaMil
				+ " ciudades de la provincia de Madrid con más de 50.000 habitantes en nuestro listado.");
	}

}
