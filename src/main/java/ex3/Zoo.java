package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.zone.Zone;

/**
 * @author Guillaume entité principale de l'application
 *
 */
public class Zoo {

	/** nom : String */
	private String nom;
	/** listeZones : List<Zone> */
	private List<Zone> listeZones = new ArrayList<Zone>();

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param listeZones
	 */
	public Zoo(String nom, List<Zone> listeZones) {
		super();
		this.nom = nom;
		this.listeZones = listeZones;
	}

	@Override
	public String toString() {
		return "Zoo [nom=" + nom + ", listeZones=" + listeZones + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listeZones == null) ? 0 : listeZones.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Zoo other = (Zoo) obj;
		if (listeZones == null) {
			if (other.listeZones != null)
				return false;
		} else if (!listeZones.equals(other.listeZones))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
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
