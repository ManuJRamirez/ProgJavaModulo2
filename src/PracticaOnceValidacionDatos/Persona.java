package PracticaOnceValidacionDatos;

import java.util.regex.Pattern;

/**
 * Clase Persona.
 * 
 * En esta clase se define el objeto Persona junto con sus 3 atributos y métodos
 * para validar los datos que introducimos en dichos atributos.
 */
public class Persona {

	/** Atributo de tipo String donde guardaremos el nombre de la persona. */
	private String nombre;

	/** Atributo de tipo String para guardar DNI o NIE de la persona. */
	private String dniNie;

	/** Atributo de tipo String para guardar correo electronico. */
	private String correoElectronico;

	/**
	 * Constructor con parámetros de clase.
	 *
	 * @param nombre            Nombre de persona
	 * @param dniNie            DNI o NIE de la persona
	 * @param correoElectronico Correo electronico de la persona
	 */
	public Persona(String nombre, String dniNie, String correoElectronico) {
		this.nombre = nombre;
		this.dniNie = dniNie;
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Método "Get" que devuelve el nombre.
	 *
	 * @return Nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método "Get" que devuelve el DNI o NIE.
	 *
	 * @return Devuelve el DNI o NIE de la persona.
	 */
	public String getDniNie() {
		return dniNie;
	}

	/**
	 * Método "Get" que devuelve el correo electronico.
	 *
	 * @return Devuelve el correo electronico de la persona.
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Método con el que validamos el nombre de la persona.
	 *
	 * @return true, si pasa la validacón y false si no la pasa.
	 */
	public boolean validarNombre() {
		return Pattern.matches("^[a-zA-ZÁÉÍÓÚáéíóúÑñ ]+$", nombre);
	}

	/**
	 * Método con el que validamos el dni/nie de la persona.
	 *
	 * @return true, si pasa la validacón y false si no la pasa.
	 */
	public boolean validarDni() {
		String dniRegex = "^[0-9]{8}[A-Za-z]$";
		String nieRegex = "^[XYZxyz][0-9]{7}[A-Za-z]$";

		return Pattern.matches(dniRegex, dniNie) || Pattern.matches(nieRegex, dniNie);
	}

	/**
	 * Método con el que validamos el correo electronico de la persona.
	 *
	 * @return true, si pasa la validacón y false si no la pasa.
	 */
	public boolean validarCorreoElectronico() {
		String correoElectronicoRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

		return Pattern.matches(correoElectronicoRegex, correoElectronico);
	}
}
