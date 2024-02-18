public class Guerrer extends Personatge {

	// ATRIBUTOS
	protected double pesAixecable;

	// CONSTRUCTORES
	public Guerrer(String nom, int edat, int forca, int puntsVida, double pesAixecable) {
		super(nom, edat, forca, puntsVida);
		this.pesAixecable = pesAixecable;
	}

	// METODOS
	public void atacar(Personatge personatge2) {
		// Creem l'arma per defecte per si no en troba
		Arma armaTrovada = new Arma("punys", 0, 0, 1, "Desarmat");
		int danyRealitzat = 0;
		// Buscar una arma
		for (Item item : this.equip) {
			if (item instanceof Arma) {
				armaTrovada = (Arma) item;
			}
		}

		if (armaTrovada.getTipus() == "Cos a cos") {
			danyRealitzat = armaTrovada.getPuntsAtac() + 1;
		} else if (armaTrovada.getTipus() == "Distància") {
			danyRealitzat = armaTrovada.getPuntsAtac();
		} else {
			danyRealitzat = armaTrovada.getPuntsAtac();
		}

		System.out.println(this.getNom() + " ataca amb " + armaTrovada.getNom() + " a " + personatge2.getNom()
				+ "!\nLi ha tret " + danyRealitzat + " punts de vida!");

		personatge2.setPuntsVida(personatge2.getPuntsVida() - danyRealitzat);

		checkPersonatge(personatge2);

	}

	@Override
	public String toString() {
		return "Guerrer{" + "nom='" + nom + '\'' + ", edat=" + edat + ", forca=" + forca + '}';
	}

}
