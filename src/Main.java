import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Item> prueba = new ArrayList<Item>();

		for (Item item : prueba) {
			System.out.println(item);
		}

		// Items genèrics
		Item cofre = new Item("Cofre", 3.1, 5000);
		Item anellDeRubi = new Item("Anell de Rubí", 0.02, 2300);

		// Armes
		Arma espasaLlarga = new Arma("Espasa llarga", 3.1, 5000, 25, "Cos a cos");
		Arma varetaMagica = new Arma("Vareta màgica", 0.125, 3200, 3, "Màgica");
		Arma arcDeMarfil = new Arma("Arc de marfil", 1, 2800, 2, "Distància");

		// Pocions
		Pocio hidromel = new Pocio("Hidromel", 0.2, 200, "Poció de vida", 2);
		Pocio sucEscorpi = new Pocio("Suc d'escorpí", 0.125, 3200, "Verí", -1);

		// Mags
		Mag benalises = new Mag("Benalises", 90, 3, 18, 26, 12);
		benalises.equipar(anellDeRubi);
		benalises.equipar(hidromel);

		Mag pedralba = new Mag("Pedralba", 120, 4, 15, 21, 9);
		pedralba.mostrarEquipatge();
		// Guerrers
		// String nom, int edat, int forca, int puntsVida, ArrayList<Item> equip, double
		// pesAixecable
		Guerrer argelaga = new Guerrer("Argelaga", 35, 12, 20, 120);
		argelaga.equipar(arcDeMarfil);

		Guerrer matoll = new Guerrer("Matoll", 42, 15, 22, 120);
		matoll.equipar(espasaLlarga);
		matoll.equipar(cofre);
		matoll.atacar(argelaga);
		System.out.println("otro ataque ");
		pedralba.atacar(matoll);

		System.out.println("utima prueba");
		pedralba.equipar(espasaLlarga);
		pedralba.equipar(cofre);
		pedralba.mostrarEquipatge();
	}
}