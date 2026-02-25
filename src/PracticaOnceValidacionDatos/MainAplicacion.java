package PracticaOnceValidacionDatos;

import java.util.ArrayList;

/**
 * Clase MainAplicacion.
 */
public class MainAplicacion {

	/**
	 * Método Main.
	 * 
	 * Creamos un listado de Personas.
	 * 
	 * Validamos el nombre, dni/nie y correo electrónico de cada persona.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ArrayList<Persona> listadoPersonas = new ArrayList<Persona>();
		listadoPersonas.add(new Persona("Juan Perez", "12345678Z", "juan@gmail.com"));
		listadoPersonas.add(new Persona("Ana123", "12345678", "ana@gmail.com"));
		listadoPersonas.add(new Persona("María López", "X1234567L", "mariaemail.com"));
		listadoPersonas.add(new Persona("Carlos García", "1234A678Z", "carlos@gmail.com"));
		listadoPersonas.add(new Persona("Lucía Fernández", "Y7654321P", "lucia@gmail"));
		listadoPersonas.add(new Persona("Pedro Gómez", "87654321X", "pedro@gmail.com"));
		listadoPersonas.add(new Persona("Sofía123", "12345678T", "sofia@gmail.com"));
		listadoPersonas.add(new Persona("Miguel Ruiz", "Z7654321R", "miguelruizgmail.com"));
		listadoPersonas.add(new Persona("Laura Martín", "X2345678L", "laura@gmail.com"));
		listadoPersonas.add(new Persona("Javier!", "98765432M", "javier@gmail"));
		

		listadoPersonas.stream().forEach(persona -> {
			boolean isValido = false;
			StringBuilder error = new StringBuilder("Error con datos de la persona: " + persona.getNombre());
			if (!persona.validarNombre()) {
				isValido = true;
				error.append("\n - Nombre incorrecto.");
			}
			if (!persona.validarDni()) {
				isValido = true;
				error.append("\n - DNI/NIE incorrecto.");
			}
			if (!persona.validarCorreoElectronico()) {
				isValido = true;
				error.append("\n - Correo electrónico incorrecto.");
			}
			if (isValido) {
				System.out.println(error + "\n");
			}

		});
	}

}
