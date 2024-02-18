public class Arma extends Item {
	// ATRIBUTOS
	protected int puntsAtac;
	protected String tipus;

	// CONSTRUCTORES
	public Arma(String nom, double pes, int valor, int puntsAtac, String tipus) {
		super(nom, pes, valor);
		this.puntsAtac = puntsAtac;
		this.tipus = tipus;
	}

	// MÉTODOS
	public int getPuntsAtac() {
		return puntsAtac;
	}

	public void setPuntsAtac(int puntsAtac) {
		this.puntsAtac = puntsAtac;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	@Override
	public String toString() {
		return "Arma nom=" + nom + ", pes='" + pes + '\'' + ", valor='" + valor + '\'' + ", pes=" + pes + ", valor="
				+ valor;
	}
}
