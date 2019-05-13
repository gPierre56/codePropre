package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex3.animal.Comportement;
import ex3.animal.Mammifere;
import ex3.animal.Poisson;
import ex3.animal.Serpent;
import ex3.service.MenuService;
import ex3.service.ZooService;
import ex3.zone.Aquarium;
import ex3.zone.FermeReptile;
import ex3.zone.SavaneAfricaine;
import ex3.zone.Zone;
import ex3.zone.ZoneCarnivore;

public class ZooApplication {

	/**
	 * @param args point d'entrée de l'application
	 */
	public static void main(String[] args) {

		// initialisation d'un zoo pour les tests
		List<Zone> listeZones = new ArrayList<Zone>();
		listeZones.add(new Aquarium());
		listeZones.add(new FermeReptile());
		listeZones.add(new ZoneCarnivore());
		listeZones.add(new SavaneAfricaine());
		listeZones.get(0).addAnimal(new Poisson("Requin", Comportement.CARNIVORE));
		listeZones.get(0).addAnimal(new Poisson("Raie", Comportement.HERBIVORE));
		listeZones.get(1).addAnimal(new Serpent("Boa", Comportement.CARNIVORE));
		listeZones.get(1).addAnimal(new Serpent("Anaconda", Comportement.CARNIVORE));
		listeZones.get(2).addAnimal(new Mammifere("Lion", Comportement.CARNIVORE));
		listeZones.get(2).addAnimal(new Mammifere("Tigre", Comportement.CARNIVORE));
		listeZones.get(3).addAnimal(new Mammifere("Gazelle", Comportement.HERBIVORE));
		listeZones.get(3).addAnimal(new Mammifere("Zèbre", Comportement.HERBIVORE));
		Zoo zoo = new Zoo("Bestiaire de la mort qui tue", listeZones);

		MenuService menu = new MenuService();
		ZooService zooService = new ZooService();
		Scanner sc = new Scanner(System.in);
		Integer choix = 0;

		System.out.println("***** Administration du zoo *****");
		do {
			menu.afficherMenu();
			choix = Integer.parseInt(sc.next());
			switch (choix) {
			// affichage des animaux du zoo
			case 1:
				zooService.afficherListeAnimaux(sc, zoo);
				break;
			// ajout d'un animal
			case 2:
				zooService.addAnimal(sc, zoo);
				break;
			// calcul des rations par zone
			case 3:
				zooService.calculerRation(sc, zoo);

			}
		} while (!choix.equals(99));

	}

}
