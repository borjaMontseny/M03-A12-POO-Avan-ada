public class Item implements Comparable<Item> {
	// ATRIBUTOS
	protected String nom;
	protected double pes;
	protected int valor; // Monedes d'or

	// CONSTRUCTORES
	public Item(String nom, double pes, int valor) {
		this.nom = nom;
		this.pes = pes;
		this.valor = valor;
	}

	// MÉTODOS
	public int compareTo(Item item2) {
		int resultat = 0;
		if (this.getValor() > item2.getValor()) { // ordenar de més a menys valor
			resultat = -1;
		} else if (this.getValor() < item2.getValor()) {
			resultat = 1;
		} else if (this.getValor() == item2.getValor()) { // si tenen el mateix valor
			if (this.getPes() < item2.getPes()) { // ordenarem de menys a més pes
				resultat = -1;
			} else if (this.getPes() > item2.getPes()) {
				resultat = 1;
			} else if (this.getPes() == item2.getPes()) { // i si també coincideix
				resultat = this.getNom().compareTo(item2.getNom()); // ordenarem per ordre alfabètic
			}
		}
		return resultat;
	}

	@Override
	public String toString() {
		return "Item " + nom + ", pes=" + pes + ", valor=" + valor;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
