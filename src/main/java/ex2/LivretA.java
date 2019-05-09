package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructor
	 * 
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * méthode qui ajoute les intérêts annuels au livret A
	 */
	public void appliquerRemuAnnuelle() {

		this.solde = solde + solde * tauxRemuneration / 100;

	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0) {
			this.solde = solde - montant;
		}

	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
