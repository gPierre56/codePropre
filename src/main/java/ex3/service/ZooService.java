package ex3.service;

import ex3.animal.Poisson;
import ex3.zone.Aquarium;
import ex3.zone.FermeReptile;
import ex3.zone.SavaneAfricaine;
import ex3.zone.ZoneCarnivore;

public class ZooService {

	SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	FermeReptile fermeReptile = new FermeReptile();
	Aquarium aquarium = new Aquarium();

	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	public void addAnimal(String nomAnimal, String nomType, String comportement) {
		switch (nomType) {
		// cas du poisson
		case "POISSON":
			aquarium.addAnimal(new Poisson(nomAnimal, comportement));

			break;

		default:
			break;
		}
	}

}
