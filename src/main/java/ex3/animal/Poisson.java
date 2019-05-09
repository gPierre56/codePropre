package ex3.animal;

public class Poisson extends Animal {

	public Poisson(String nomAnimal, Comportement comportement) {
		super(nomAnimal, comportement);
		this.type = TypeAnimal.POISSON;
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

}
