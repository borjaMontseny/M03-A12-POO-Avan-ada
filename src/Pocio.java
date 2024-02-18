public class Pocio extends Item {
	// ATRIBUTOS
	protected String descripcio;
	protected int efecte; // Els punts de vida que donen o treuen

	// CONSTRUCTORES
	public Pocio(String nom, double pes, int valor, String descripcio, int efecte) {
		super(nom, pes, valor);
		this.descripcio = descripcio;
		this.efecte = efecte;
	}

	// MÉTODOS
	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public int getEfecte() {
		return efecte;
	}

	public void setEfecte(int efecte) {
		this.efecte = efecte;
	}

	@Override
	public String toString() {
		return "Pocio{" + "descripcio='" + descripcio + '\'' + ", efecte=" + efecte + ", nom='" + nom + '\'' + ", pes="
				+ pes + ", valor=" + valor + '}';
	}
}
