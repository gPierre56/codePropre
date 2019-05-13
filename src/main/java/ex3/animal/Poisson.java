package ex3.animal;

/**
 * @author Guillaume Classe fille d'animal, entité poisson
 *
 */
public class Poisson extends Animal {

	/**
	 * Constructor
	 * 
	 * @param nomAnimal
	 * @param comportement
	 */
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
