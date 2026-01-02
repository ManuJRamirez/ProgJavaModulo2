package PracticaUnoCoche;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private float potencia;
	private int velocidadMaxima;
	private Chasis chasis;
	private Rueda[] ruedas;

	public Coche(String matricula, String marca, String modelo, float potencia, int velocidadMaxima, Chasis chasis,
			Rueda[] ruedas) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.velocidadMaxima = velocidadMaxima;
		this.chasis = chasis;
		this.ruedas = ruedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}
	
	
	/* Clase anidada chasis*/
	public static class Chasis {
		private String material;
		private float peso; // en kg

		public Chasis(String material, float peso) {
			super();
			this.material = material;
			this.peso = peso;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		@Override
		public String toString() {
			return "material: " + material + ", peso: " + peso + "kg";
		}

	}

	/* Clase anidada Rueda */
	public static class Rueda {

		private String medida;
		private String tipo;
		private String marca;
		private String modelo;

		public Rueda(String medida, String tipo, String marca, String modelo) {
			super();
			this.medida = medida;
			this.tipo = tipo;
			this.marca = marca;
			this.modelo = modelo;
		}

		public String getMedida() {
			return medida;
		}

		public void setMedida(String medida) {
			this.medida = medida;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		@Override
		public String toString() {
			return "medida: " + medida + ", tipo: " + tipo + ", marca: " + marca + ", modelo: " + modelo;
		}

	}

	@Override
	public String toString() {

		StringBuilder texto = new StringBuilder();

		texto.append("Coche [Matrícula: ").append(matricula).append(", Marca: ").append(marca).append(", Modelo: ")
				.append(modelo).append(", Potencia: ").append(potencia).append("cv, Velocidad Maxima: ")
				.append(velocidadMaxima).append("km/h]\n");

		texto.append("Chasis: ").append(chasis).append("\n");
		texto.append("Ruedas:\n");

		for (int i = 0; i < ruedas.length; i++) {
			texto.append("  Rueda ").append(i + 1).append(": ").append(ruedas[i]).append("\n");
		}

		return texto.toString();
	}

}
