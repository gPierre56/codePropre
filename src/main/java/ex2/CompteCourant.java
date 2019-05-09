package ex2;

public class CompteCourant extends CompteBancaire {

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/**
	 * Constructor
	 * 
	 * @param type
	 * @param solde
	 * @param decouvert : doit être renseigné en nombre positif
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert * -1) {
			this.solde = solde - montant;
		}

	}

	/**
	 * Getter
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
