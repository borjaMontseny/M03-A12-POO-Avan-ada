import java.util.ArrayList;

public abstract class Personatge {
	// ATRIBUTOS
	protected String nom;
	protected int edat;
	protected int forca;
	protected int puntsVida;
	protected ArrayList<Item> equip;

	// CONSTRUCTORES
	public Personatge(String nom, int edat, int forca, int puntsVida) {
		this.nom = nom;
		this.edat = edat;
		this.forca = forca;
		this.puntsVida = puntsVida;
		this.equip = new ArrayList<Item>();
	}

	// MÉTODOS
	public void checkPersonatge() {
		if (this.getPuntsVida() <= 0) {
			System.out.println(this.getNom() + " ara té 0 punts de vida.\n" + this.getNom() + " ha mort\n");
		} else {
			System.out.println(this.getNom() + " ara té " + this.getPuntsVida() + " punts de vida");
		}
	};

	public void checkPersonatge(Personatge personatge2) {
		if (personatge2.getPuntsVida() <= 0) {
			System.out
					.println(personatge2.getNom() + " ara té 0 punts de vida.\n" + personatge2.getNom() + " ha mort\n");
		} else {
			System.out.println(personatge2.getNom() + " ara té " + personatge2.getPuntsVida() + " punts de vida");
		}
	};

	public void ordenarEquip() {
		this.equip.sort(null);
	}

	public void mostrarEquipatge() {
		for (Item item : this.equip) {
			System.out.println(item); // no hace falta toString()
		}
	}

	public boolean equipar(Item item) {
		boolean isEquipable = false;

		// Comptem els items que hi han al arrayList
		int contadorItems = 0;
		for (int i = 0; i < equip.size(); i++) {
			if (equip.get(i) != null) {
				contadorItems++;
			}
		}

		// si tenim menys de 10 items, podem afegir l'item
		if (contadorItems < 10) {
			equip.add(item);
			ordenarEquip();
			isEquipable = true;
		} else {
			isEquipable = false;
		}
		return isEquipable;
	}

	public void beure() {
		for (Item item : equip) {
			if (item instanceof Pocio) {
				this.setPuntsVida(this.getPuntsVida() - ((Pocio) item).getEfecte());
				equip.remove(item);
				return; // return para que salga del bucle y no siga iterando una vez hecha la acción
			}

		}
		checkPersonatge();
	}

	// GETTERS & SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getPuntsVida() {
		return puntsVida;
	}

	public void setPuntsVida(int puntsVida) {
		this.puntsVida = puntsVida;
	}

	public ArrayList<Item> getEquip() {
		return equip;
	}

	public void setEquip(ArrayList<Item> equip) {
		this.equip = equip;
	}
}
