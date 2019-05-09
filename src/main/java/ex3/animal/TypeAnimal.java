package ex3.animal;

public enum TypeAnimal {

	MAMMIFERE(1, "MAMMIFERE"), POISSON(2, "POISSON"), SERPENT(3, "SERPENT");

	private int numType;
	private String nomType;

	/**
	 * Constructor
	 * 
	 * @param nomType
	 */
	private TypeAnimal(int numType, String nomType) {
		this.numType = numType;
		this.nomType = nomType;
	}

	/**
	 * Getter
	 * 
	 * @return the nomType
	 */
	public String getNomType() {
		return nomType;
	}

	/**
	 * Setter
	 * 
	 * @param nomType the nomType to set
	 */
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}

	/**
	 * Getter
	 * 
	 * @return the numType
	 */
	public int getNumType() {
		return numType;
	}

	/**
	 * Setter
	 * 
	 * @param numType the numType to set
	 */
	public void setNumType(int numType) {
		this.numType = numType;
	}

}
