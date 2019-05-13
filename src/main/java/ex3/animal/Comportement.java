package ex3.animal;

/**
 * @author Guillaume Enumération des comportements disponibles
 *
 */
public enum Comportement {

	CARNIVORE(1, "CARNIVORE"), HERBIVORE(2, "HERBIVORE");

	private int numComportement;
	private String nomComportement;

	/**
	 * Constructor
	 * 
	 * @param numComportement
	 * @param nomComportement
	 */
	private Comportement(int numComportement, String nomComportement) {
		this.numComportement = numComportement;
		this.nomComportement = nomComportement;
	}

	/**
	 * Getter
	 * 
	 * @return the numComportement
	 */
	public int getNumComportement() {
		return numComportement;
	}

	/**
	 * Setter
	 * 
	 * @param numComportement the numComportement to set
	 */
	public void setNumComportement(int numComportement) {
		this.numComportement = numComportement;
	}

	/**
	 * Getter
	 * 
	 * @return the nomComportement
	 */
	public String getNomComportement() {
		return nomComportement;
	}

	/**
	 * Setter
	 * 
	 * @param nomComportement the nomComportement to set
	 */
	public void setNomComportement(String nomComportement) {
		this.nomComportement = nomComportement;
	}

}
