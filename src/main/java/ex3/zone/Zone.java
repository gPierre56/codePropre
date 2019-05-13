package ex3.zone;

import java.util.ArrayList;
import java.util.List;

import ex3.animal.Animal;

/**
 * @author Guillaume Classe mère des zones du zoo
 *
 */
public abstract class Zone {

	/** listeAnimaux : List<Animal> */
	protected List<Animal> listeAnimaux = new ArrayList<Animal>();

	/**
	 * @return le nombre de kg de nourriture consommé par les animaux de la zone
	 */
	public abstract double calculerKgsNourritureParJour();

	/**
	 * afiche dans la console tous les animaux figurant dans la zone
	 */
	public void afficherListeAnimaux() {
		for (int i = 0; i < listeAnimaux.size(); i++) {
			System.out.println(listeAnimaux.get(i).getNomAnimal());
		}
	}

	/**
	 * @return le nombre d'animaux dans la zone
	 */
	public int compterAnimaux() {
		return listeAnimaux.size();
	}

	/**
	 * @param animal ajoute un animal
	 */
	public void addAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}

	@Override
	public String toString() {
		return "Zone [listeAnimaux=" + this.listeAnimaux + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listeAnimaux == null) ? 0 : listeAnimaux.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zone other = (Zone) obj;
		if (listeAnimaux == null) {
			if (other.listeAnimaux != null)
				return false;
		} else if (!listeAnimaux.equals(other.listeAnimaux))
			return false;
		return true;
	}

	/**
	 * Getter
	 * 
	 * @return the listeAnimaux
	 */
	public List<Animal> getListeAnimaux() {
		return listeAnimaux;
	}

	/**
	 * Setter
	 * 
	 * @param listeAnimaux the listeAnimaux to set
	 */
	public void setListeAnimaux(List<Animal> listeAnimaux) {
		this.listeAnimaux = listeAnimaux;
	}

}
