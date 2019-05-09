package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.zone.Zone;

public class Zoo {

	private String nom;
	private List<Zone> listeZones = new ArrayList<Zone>();

	public Zoo(String nom, List<Zone> listeZones) {
		super();
		this.nom = nom;
		this.listeZones = listeZones;
	}

	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")) {
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")) {
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("REPTILE")) {
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("POISSON")) {
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the listeZones
	 */
	public List<Zone> getListeZones() {
		return listeZones;
	}

	/**
	 * Setter
	 * 
	 * @param listeZones the listeZones to set
	 */
	public void setListeZones(List<Zone> listeZones) {
		this.listeZones = listeZones;
	}

}
