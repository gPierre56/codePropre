package ex2;

/**
 * Classe mère abstraite de l'entité compte
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant au solde
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

	public CompteBancaire(double solde) {
		super();
		this.solde = solde;

	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
