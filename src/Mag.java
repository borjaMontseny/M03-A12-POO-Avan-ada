public class Mag extends Personatge {
	// ATRIBUTOS
	protected int puntsMagia;
	protected int coneixement;

	// CONSTRUCTORES
	public Mag(String nom, int edat, int forca, int puntsVida, int puntsMagia, int coneixement) {
		super(nom, edat, forca, puntsVida);
		this.puntsMagia = puntsMagia;
		this.coneixement = coneixement;
	}

	// MÉTODOS
	public void atacar(Personatge personatge2) {
		// Creem l'arma per defecte per si no en troba
		Arma armaTrovada = new Arma("imaginació", 0, 0, 0, "Desarmat");
		int danyRealitzat = 0;
		// Buscar una arma
		for (Item item : this.equip) {
			if (item instanceof Arma) {
				armaTrovada = (Arma) item;
			}
		}

		if (armaTrovada.getTipus() == "Màgica") {
			danyRealitzat = armaTrovada.getPuntsAtac();
		}

		System.out.println(this.getNom() + " ataca amb " + armaTrovada.getNom() + " a " + personatge2.getNom()
				+ "!\nLi ha tret " + danyRealitzat + " punts de vida!");

		personatge2.setPuntsVida(personatge2.getPuntsVida() - danyRealitzat);

		checkPersonatge(personatge2);
	}

	@Override
	public boolean equipar(Item item) {
		// TODO Auto-generated method stub
		return false;
	}
}
