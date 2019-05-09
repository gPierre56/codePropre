package ex3.animal;

public enum Comportement {

	CARNIVORE("CARNIVORE"), HERBIVORE("HERBIVORE");

	private String nomComportement;

	private Comportement(String nomComportement) {
		this.nomComportement = nomComportement;
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
