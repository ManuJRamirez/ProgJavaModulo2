package PracticaUnoCoche;

public class MainAplicacion {

	public static void main(String[] args) {
		
		
		Coche.Rueda[] ruedas1 = new Coche.Rueda[4];
		ruedas1[0] = new Coche.Rueda("205/55 R16", "seco", "Michelin", "Primacy");
		ruedas1[1] = new Coche.Rueda("205/55 R16", "seco", "Michelin", "Primacy");
		ruedas1[2] = new Coche.Rueda("205/55 R16", "seco", "Michelin", "Primacy");
		ruedas1[3] = new Coche.Rueda("205/55 R16", "seco", "Michelin", "Primacy");
		
		Coche.Chasis chasis1 = new Coche.Chasis("Aluminio", 500);
		
		Coche coche1 = new Coche("0000NFC", "Seat", "Leon", 125, 220, chasis1, ruedas1);
		
		System.out.println(coche1.toString());
	}

}
